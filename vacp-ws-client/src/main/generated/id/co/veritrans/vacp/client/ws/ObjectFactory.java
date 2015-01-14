
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.co.veritrans.vacp.client.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestMessage_QNAME = new QName("urn:schemas-visa-com:transaction-data-1.101", "requestMessage");
    private final static QName _NvpReply_QNAME = new QName("urn:schemas-visa-com:transaction-data-1.101", "nvpReply");
    private final static QName _NvpRequest_QNAME = new QName("urn:schemas-visa-com:transaction-data-1.101", "nvpRequest");
    private final static QName _ReplyMessage_QNAME = new QName("urn:schemas-visa-com:transaction-data-1.101", "replyMessage");
    private final static QName _FaultDetails_QNAME = new QName("urn:schemas-visa-com:transaction-data-1.101", "faultDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.co.veritrans.vacp.client.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReplyMessage }
     * 
     */
    public ReplyMessage createReplyMessage() {
        return new ReplyMessage();
    }

    /**
     * Create an instance of {@link CCCaptureService }
     * 
     */
    public CCCaptureService createCCCaptureService() {
        return new CCCaptureService();
    }

    /**
     * Create an instance of {@link PinDebitReversalReply }
     * 
     */
    public PinDebitReversalReply createPinDebitReversalReply() {
        return new PinDebitReversalReply();
    }

    /**
     * Create an instance of {@link Pos }
     * 
     */
    public Pos createPos() {
        return new Pos();
    }

    /**
     * Create an instance of {@link EmvRequest }
     * 
     */
    public EmvRequest createEmvRequest() {
        return new EmvRequest();
    }

    /**
     * Create an instance of {@link PaymentNetworkToken }
     * 
     */
    public PaymentNetworkToken createPaymentNetworkToken() {
        return new PaymentNetworkToken();
    }

    /**
     * Create an instance of {@link VoidService }
     * 
     */
    public VoidService createVoidService() {
        return new VoidService();
    }

    /**
     * Create an instance of {@link InvoiceHeader }
     * 
     */
    public InvoiceHeader createInvoiceHeader() {
        return new InvoiceHeader();
    }

    /**
     * Create an instance of {@link FaultDetails }
     * 
     */
    public FaultDetails createFaultDetails() {
        return new FaultDetails();
    }

    /**
     * Create an instance of {@link PinDebitReversalService }
     * 
     */
    public PinDebitReversalService createPinDebitReversalService() {
        return new PinDebitReversalService();
    }

    /**
     * Create an instance of {@link PinDebitPurchaseService }
     * 
     */
    public PinDebitPurchaseService createPinDebitPurchaseService() {
        return new PinDebitPurchaseService();
    }

    /**
     * Create an instance of {@link CCAuthReversalService }
     * 
     */
    public CCAuthReversalService createCCAuthReversalService() {
        return new CCAuthReversalService();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link VoidReply }
     * 
     */
    public VoidReply createVoidReply() {
        return new VoidReply();
    }

    /**
     * Create an instance of {@link EmvReply }
     * 
     */
    public EmvReply createEmvReply() {
        return new EmvReply();
    }

    /**
     * Create an instance of {@link RequestReserved }
     * 
     */
    public RequestReserved createRequestReserved() {
        return new RequestReserved();
    }

    /**
     * Create an instance of {@link CCCaptureReply }
     * 
     */
    public CCCaptureReply createCCCaptureReply() {
        return new CCCaptureReply();
    }

    /**
     * Create an instance of {@link BusinessRules }
     * 
     */
    public BusinessRules createBusinessRules() {
        return new BusinessRules();
    }

    /**
     * Create an instance of {@link ShipTo }
     * 
     */
    public ShipTo createShipTo() {
        return new ShipTo();
    }

    /**
     * Create an instance of {@link Installment }
     * 
     */
    public Installment createInstallment() {
        return new Installment();
    }

    /**
     * Create an instance of {@link PinDebitCreditReply }
     * 
     */
    public PinDebitCreditReply createPinDebitCreditReply() {
        return new PinDebitCreditReply();
    }

    /**
     * Create an instance of {@link PurchaseTotals }
     * 
     */
    public PurchaseTotals createPurchaseTotals() {
        return new PurchaseTotals();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link CCAuthReversalReply }
     * 
     */
    public CCAuthReversalReply createCCAuthReversalReply() {
        return new CCAuthReversalReply();
    }

    /**
     * Create an instance of {@link CCCreditReply }
     * 
     */
    public CCCreditReply createCCCreditReply() {
        return new CCCreditReply();
    }

    /**
     * Create an instance of {@link ReplyReserved }
     * 
     */
    public ReplyReserved createReplyReserved() {
        return new ReplyReserved();
    }

    /**
     * Create an instance of {@link BillTo }
     * 
     */
    public BillTo createBillTo() {
        return new BillTo();
    }

    /**
     * Create an instance of {@link PinDebitCreditService }
     * 
     */
    public PinDebitCreditService createPinDebitCreditService() {
        return new PinDebitCreditService();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
    }

    /**
     * Create an instance of {@link RequestMessage }
     * 
     */
    public RequestMessage createRequestMessage() {
        return new RequestMessage();
    }

    /**
     * Create an instance of {@link UCAF }
     * 
     */
    public UCAF createUCAF() {
        return new UCAF();
    }

    /**
     * Create an instance of {@link ShipFrom }
     * 
     */
    public ShipFrom createShipFrom() {
        return new ShipFrom();
    }

    /**
     * Create an instance of {@link CCAuthService }
     * 
     */
    public CCAuthService createCCAuthService() {
        return new CCAuthService();
    }

    /**
     * Create an instance of {@link CCAuthReply }
     * 
     */
    public CCAuthReply createCCAuthReply() {
        return new CCAuthReply();
    }

    /**
     * Create an instance of {@link PinDebitPurchaseReply }
     * 
     */
    public PinDebitPurchaseReply createPinDebitPurchaseReply() {
        return new PinDebitPurchaseReply();
    }

    /**
     * Create an instance of {@link CCCreditService }
     * 
     */
    public CCCreditService createCCCreditService() {
        return new CCCreditService();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-visa-com:transaction-data-1.101", name = "requestMessage")
    public JAXBElement<RequestMessage> createRequestMessage(RequestMessage value) {
        return new JAXBElement<RequestMessage>(_RequestMessage_QNAME, RequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-visa-com:transaction-data-1.101", name = "nvpReply")
    public JAXBElement<String> createNvpReply(String value) {
        return new JAXBElement<String>(_NvpReply_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-visa-com:transaction-data-1.101", name = "nvpRequest")
    public JAXBElement<String> createNvpRequest(String value) {
        return new JAXBElement<String>(_NvpRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-visa-com:transaction-data-1.101", name = "replyMessage")
    public JAXBElement<ReplyMessage> createReplyMessage(ReplyMessage value) {
        return new JAXBElement<ReplyMessage>(_ReplyMessage_QNAME, ReplyMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:schemas-visa-com:transaction-data-1.101", name = "faultDetails")
    public JAXBElement<FaultDetails> createFaultDetails(FaultDetails value) {
        return new JAXBElement<FaultDetails>(_FaultDetails_QNAME, FaultDetails.class, null, value);
    }

}
