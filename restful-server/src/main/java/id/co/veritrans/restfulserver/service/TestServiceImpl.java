package id.co.veritrans.restfulserver.service;

import id.co.veritrans.vacp.client.ws.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.ws.rs.Path;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by gde on 1/14/15.
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {

    @Override
    public String hello() {
        return "Hello...";
    }

    @Override
    public ReplyMessage sendSampleRequest() {
        final TransactionProcessor tpImpl = new TransactionProcessor(
                TransactionProcessor.class.getClassLoader().getResource("wsdl/VACP_WSDL_1_101.wsdl"),
                new QName("urn:schemas-visa-com:transaction-data:TransactionProcessor", "TransactionProcessor"));

        tpImpl.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                final List<Handler> ret = new LinkedList<Handler>();
                ret.add(new WSSUsernameTokenSecurityHandler());
                return ret;
            }
        });

        final ITransactionProcessor tp = tpImpl.getPortXML();

        final ObjectFactory of = new ObjectFactory();
        final RequestMessage rm = new RequestMessage();

        rm.setMerchantID("v4p313p331638");
        rm.setMerchantReferenceCode("123"); //max 50 chars

        rm.setBillTo(new BillTo());
        rm.getBillTo().setFirstName("John");
        rm.getBillTo().setLastName("Smith");
        rm.getBillTo().setStreet1("201 S. Division St.");
        rm.getBillTo().setCity("Ann Arbor");
        rm.getBillTo().setState("MI");
        rm.getBillTo().setPostalCode("481042201");
        rm.getBillTo().setCountry("US");
        rm.getBillTo().setEmail("test@example.com");

        rm.setPurchaseTotals(new PurchaseTotals());
        rm.getPurchaseTotals().setCurrency("usd");
        rm.getPurchaseTotals().setGrandTotalAmount("3.00");

        rm.setCard(new Card());
        rm.getCard().setAccountNumber("4111111111111111");
        rm.getCard().setExpirationMonth(BigInteger.valueOf(12));
        rm.getCard().setExpirationYear(BigInteger.valueOf(2015));
        rm.getCard().setCvNumber("123");
        rm.getCard().setCardType("001");

        rm.setCcAuthService(new CCAuthService());
        rm.getCcAuthService().setRun("true");
        rm.getCcAuthService().setCommerceIndicator("internet");
        rm.getCcAuthService().setPartialAuthIndicator("true");

        rm.setBusinessRules(new BusinessRules());
        rm.getBusinessRules().setIgnoreAVSResult("true");
        rm.getBusinessRules().setIgnoreCVResult("true");

        rm.setThirdPartyCertificationNumber("331638012111");
        rm.setMerchantTransactionIdentifier(UUID.randomUUID().toString().replace("-", "").substring(0, 15));

        final ReplyMessage reply = tp.runTransaction(rm);
        return reply;
    }

    private static class WSSUsernameTokenSecurityHandler implements SOAPHandler<SOAPMessageContext> {

        private String login = "v4p313p331638";
        private String pwd = "npjnYLyRPpfPoFV23+P9EgspgiVsHO0nT5/JZE1252xTg8jhH8lo8wfZzTP8k5UUWWMFf6NvqxHQiBmdOxwhrz5hL5nf20hGOaOflPz2F5d+brEr8pSAVGa9HRX2abHDKOJCOZDURN+B0dZsARF1v9VeNrHz00q5kcmpChnqc3ybJ/b9Uqxo26ZteQQmVXEEeJCzUNiDxrl6Ng2CabUFKGmU4YRGq8H4FADSB/C5MGqE0m66eM1a7sbc0sluNmkMKNLLYGCzNFAsKGJL3CK6nHmd4oGDdG+Dc/V/eosfK9X7zPuB0sNzVgjZiS3e54PkOuP5UuGWW4qb8Tk7OvJAwA==";

        public WSSUsernameTokenSecurityHandler() {
        }

        @Override
        public boolean handleMessage(SOAPMessageContext context) {
            Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            if (outboundProperty.booleanValue()) {
                try {
                    SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                    SOAPFactory factory = SOAPFactory.newInstance();
                    String prefix = "wsse";
                    String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
                    SOAPElement securityElem = factory.createElement("Security", prefix, uri);

                    SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);
                    tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-2");
                    tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

                    SOAPElement userElem = factory.createElement("Username", prefix, uri);
                    userElem.addTextNode(login);

                    SOAPElement pwdElem = factory.createElement("Password", prefix, uri);
                    pwdElem.addTextNode(pwd);
                    pwdElem.addAttribute(QName.valueOf("Type"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");

                    tokenElem.addChildElement(userElem);
                    tokenElem.addChildElement(pwdElem);
                    securityElem.addChildElement(tokenElem);

                    if (envelope.getHeader() != null) {
                        envelope.getHeader().detachNode();
                    }

                    SOAPHeader header = envelope.addHeader();
                    header.addChildElement(securityElem);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                // inbound
            }

            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                context.getMessage().writeTo(baos);
            } catch (SOAPException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(baos.toByteArray()));

            return true;
        }

        @Override
        public Set<QName> getHeaders() {
            return new TreeSet();
        }

        @Override
        public boolean handleFault(SOAPMessageContext context) {
            return false;
        }

        @Override
        public void close(MessageContext context) {
            //
        }
    }
}
