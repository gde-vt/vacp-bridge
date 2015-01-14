
package id.co.veritrans.vacp.client.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceHeader" type="{urn:schemas-visa-com:transaction-data-1.101}InvoiceHeader" minOccurs="0"/>
 *         &lt;element name="billTo" type="{urn:schemas-visa-com:transaction-data-1.101}BillTo" minOccurs="0"/>
 *         &lt;element name="shipTo" type="{urn:schemas-visa-com:transaction-data-1.101}ShipTo" minOccurs="0"/>
 *         &lt;element name="shipFrom" type="{urn:schemas-visa-com:transaction-data-1.101}ShipFrom" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:schemas-visa-com:transaction-data-1.101}Item" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purchaseTotals" type="{urn:schemas-visa-com:transaction-data-1.101}PurchaseTotals" minOccurs="0"/>
 *         &lt;element name="pos" type="{urn:schemas-visa-com:transaction-data-1.101}Pos" minOccurs="0"/>
 *         &lt;element name="installment" type="{urn:schemas-visa-com:transaction-data-1.101}Installment" minOccurs="0"/>
 *         &lt;element name="card" type="{urn:schemas-visa-com:transaction-data-1.101}Card" minOccurs="0"/>
 *         &lt;element name="ucaf" type="{urn:schemas-visa-com:transaction-data-1.101}UCAF" minOccurs="0"/>
 *         &lt;element name="linkToRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccAuthService" type="{urn:schemas-visa-com:transaction-data-1.101}CCAuthService" minOccurs="0"/>
 *         &lt;element name="ccCaptureService" type="{urn:schemas-visa-com:transaction-data-1.101}CCCaptureService" minOccurs="0"/>
 *         &lt;element name="ccCreditService" type="{urn:schemas-visa-com:transaction-data-1.101}CCCreditService" minOccurs="0"/>
 *         &lt;element name="ccAuthReversalService" type="{urn:schemas-visa-com:transaction-data-1.101}CCAuthReversalService" minOccurs="0"/>
 *         &lt;element name="voidService" type="{urn:schemas-visa-com:transaction-data-1.101}VoidService" minOccurs="0"/>
 *         &lt;element name="businessRules" type="{urn:schemas-visa-com:transaction-data-1.101}BusinessRules" minOccurs="0"/>
 *         &lt;element name="thirdPartyCertificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surchargeAmount" type="{urn:schemas-visa-com:transaction-data-1.101}amount" minOccurs="0"/>
 *         &lt;element name="surchargeSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinDataEncryptedPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinDataKeySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cashbackAmount" type="{urn:schemas-visa-com:transaction-data-1.101}amount" minOccurs="0"/>
 *         &lt;element name="pinDebitPurchaseService" type="{urn:schemas-visa-com:transaction-data-1.101}PinDebitPurchaseService" minOccurs="0"/>
 *         &lt;element name="pinDebitCreditService" type="{urn:schemas-visa-com:transaction-data-1.101}PinDebitCreditService" minOccurs="0"/>
 *         &lt;element name="pinDebitReversalService" type="{urn:schemas-visa-com:transaction-data-1.101}PinDebitReversalService" minOccurs="0"/>
 *         &lt;element name="emvRequest" type="{urn:schemas-visa-com:transaction-data-1.101}EmvRequest" minOccurs="0"/>
 *         &lt;element name="merchantTransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInitiationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedCreditTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentNetworkToken" type="{urn:schemas-visa-com:transaction-data-1.101}PaymentNetworkToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessage", propOrder = {
    "merchantID",
    "merchantReferenceCode",
    "invoiceHeader",
    "billTo",
    "shipTo",
    "shipFrom",
    "item",
    "purchaseTotals",
    "pos",
    "installment",
    "card",
    "ucaf",
    "linkToRequest",
    "ccAuthService",
    "ccCaptureService",
    "ccCreditService",
    "ccAuthReversalService",
    "voidService",
    "businessRules",
    "thirdPartyCertificationNumber",
    "surchargeAmount",
    "surchargeSign",
    "pinDataEncryptedPIN",
    "pinDataKeySerialNumber",
    "cashbackAmount",
    "pinDebitPurchaseService",
    "pinDebitCreditService",
    "pinDebitReversalService",
    "emvRequest",
    "merchantTransactionIdentifier",
    "paymentInitiationChannel",
    "extendedCreditTotalCount",
    "authIndicator",
    "paymentNetworkToken"
})
public class RequestMessage {

    protected String merchantID;
    protected String merchantReferenceCode;
    protected InvoiceHeader invoiceHeader;
    protected BillTo billTo;
    protected ShipTo shipTo;
    protected ShipFrom shipFrom;
    protected List<Item> item;
    protected PurchaseTotals purchaseTotals;
    protected Pos pos;
    protected Installment installment;
    protected Card card;
    protected UCAF ucaf;
    protected String linkToRequest;
    protected CCAuthService ccAuthService;
    protected CCCaptureService ccCaptureService;
    protected CCCreditService ccCreditService;
    protected CCAuthReversalService ccAuthReversalService;
    protected VoidService voidService;
    protected BusinessRules businessRules;
    protected String thirdPartyCertificationNumber;
    protected String surchargeAmount;
    protected String surchargeSign;
    protected String pinDataEncryptedPIN;
    protected String pinDataKeySerialNumber;
    protected String cashbackAmount;
    protected PinDebitPurchaseService pinDebitPurchaseService;
    protected PinDebitCreditService pinDebitCreditService;
    protected PinDebitReversalService pinDebitReversalService;
    protected EmvRequest emvRequest;
    protected String merchantTransactionIdentifier;
    protected String paymentInitiationChannel;
    protected String extendedCreditTotalCount;
    protected String authIndicator;
    protected PaymentNetworkToken paymentNetworkToken;

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the merchantReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReferenceCode() {
        return merchantReferenceCode;
    }

    /**
     * Sets the value of the merchantReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReferenceCode(String value) {
        this.merchantReferenceCode = value;
    }

    /**
     * Gets the value of the invoiceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader }
     *     
     */
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Sets the value of the invoiceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader }
     *     
     */
    public void setInvoiceHeader(InvoiceHeader value) {
        this.invoiceHeader = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link BillTo }
     *     
     */
    public BillTo getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTo }
     *     
     */
    public void setBillTo(BillTo value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link ShipTo }
     *     
     */
    public ShipTo getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipTo }
     *     
     */
    public void setShipTo(ShipTo value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link ShipFrom }
     *     
     */
    public ShipFrom getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipFrom }
     *     
     */
    public void setShipFrom(ShipFrom value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

    /**
     * Gets the value of the purchaseTotals property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseTotals }
     *     
     */
    public PurchaseTotals getPurchaseTotals() {
        return purchaseTotals;
    }

    /**
     * Sets the value of the purchaseTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseTotals }
     *     
     */
    public void setPurchaseTotals(PurchaseTotals value) {
        this.purchaseTotals = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setPos(Pos value) {
        this.pos = value;
    }

    /**
     * Gets the value of the installment property.
     * 
     * @return
     *     possible object is
     *     {@link Installment }
     *     
     */
    public Installment getInstallment() {
        return installment;
    }

    /**
     * Sets the value of the installment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Installment }
     *     
     */
    public void setInstallment(Installment value) {
        this.installment = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link Card }
     *     
     */
    public Card getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link Card }
     *     
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Gets the value of the ucaf property.
     * 
     * @return
     *     possible object is
     *     {@link UCAF }
     *     
     */
    public UCAF getUcaf() {
        return ucaf;
    }

    /**
     * Sets the value of the ucaf property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCAF }
     *     
     */
    public void setUcaf(UCAF value) {
        this.ucaf = value;
    }

    /**
     * Gets the value of the linkToRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToRequest() {
        return linkToRequest;
    }

    /**
     * Sets the value of the linkToRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToRequest(String value) {
        this.linkToRequest = value;
    }

    /**
     * Gets the value of the ccAuthService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthService }
     *     
     */
    public CCAuthService getCcAuthService() {
        return ccAuthService;
    }

    /**
     * Sets the value of the ccAuthService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthService }
     *     
     */
    public void setCcAuthService(CCAuthService value) {
        this.ccAuthService = value;
    }

    /**
     * Gets the value of the ccCaptureService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureService }
     *     
     */
    public CCCaptureService getCcCaptureService() {
        return ccCaptureService;
    }

    /**
     * Sets the value of the ccCaptureService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureService }
     *     
     */
    public void setCcCaptureService(CCCaptureService value) {
        this.ccCaptureService = value;
    }

    /**
     * Gets the value of the ccCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditService }
     *     
     */
    public CCCreditService getCcCreditService() {
        return ccCreditService;
    }

    /**
     * Sets the value of the ccCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditService }
     *     
     */
    public void setCcCreditService(CCCreditService value) {
        this.ccCreditService = value;
    }

    /**
     * Gets the value of the ccAuthReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalService }
     *     
     */
    public CCAuthReversalService getCcAuthReversalService() {
        return ccAuthReversalService;
    }

    /**
     * Sets the value of the ccAuthReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalService }
     *     
     */
    public void setCcAuthReversalService(CCAuthReversalService value) {
        this.ccAuthReversalService = value;
    }

    /**
     * Gets the value of the voidService property.
     * 
     * @return
     *     possible object is
     *     {@link VoidService }
     *     
     */
    public VoidService getVoidService() {
        return voidService;
    }

    /**
     * Sets the value of the voidService property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidService }
     *     
     */
    public void setVoidService(VoidService value) {
        this.voidService = value;
    }

    /**
     * Gets the value of the businessRules property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessRules }
     *     
     */
    public BusinessRules getBusinessRules() {
        return businessRules;
    }

    /**
     * Sets the value of the businessRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessRules }
     *     
     */
    public void setBusinessRules(BusinessRules value) {
        this.businessRules = value;
    }

    /**
     * Gets the value of the thirdPartyCertificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyCertificationNumber() {
        return thirdPartyCertificationNumber;
    }

    /**
     * Sets the value of the thirdPartyCertificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyCertificationNumber(String value) {
        this.thirdPartyCertificationNumber = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeAmount(String value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the surchargeSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurchargeSign() {
        return surchargeSign;
    }

    /**
     * Sets the value of the surchargeSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurchargeSign(String value) {
        this.surchargeSign = value;
    }

    /**
     * Gets the value of the pinDataEncryptedPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataEncryptedPIN() {
        return pinDataEncryptedPIN;
    }

    /**
     * Sets the value of the pinDataEncryptedPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataEncryptedPIN(String value) {
        this.pinDataEncryptedPIN = value;
    }

    /**
     * Gets the value of the pinDataKeySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinDataKeySerialNumber() {
        return pinDataKeySerialNumber;
    }

    /**
     * Sets the value of the pinDataKeySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinDataKeySerialNumber(String value) {
        this.pinDataKeySerialNumber = value;
    }

    /**
     * Gets the value of the cashbackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashbackAmount() {
        return cashbackAmount;
    }

    /**
     * Sets the value of the cashbackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashbackAmount(String value) {
        this.cashbackAmount = value;
    }

    /**
     * Gets the value of the pinDebitPurchaseService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public PinDebitPurchaseService getPinDebitPurchaseService() {
        return pinDebitPurchaseService;
    }

    /**
     * Sets the value of the pinDebitPurchaseService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseService }
     *     
     */
    public void setPinDebitPurchaseService(PinDebitPurchaseService value) {
        this.pinDebitPurchaseService = value;
    }

    /**
     * Gets the value of the pinDebitCreditService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditService }
     *     
     */
    public PinDebitCreditService getPinDebitCreditService() {
        return pinDebitCreditService;
    }

    /**
     * Sets the value of the pinDebitCreditService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditService }
     *     
     */
    public void setPinDebitCreditService(PinDebitCreditService value) {
        this.pinDebitCreditService = value;
    }

    /**
     * Gets the value of the pinDebitReversalService property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalService }
     *     
     */
    public PinDebitReversalService getPinDebitReversalService() {
        return pinDebitReversalService;
    }

    /**
     * Sets the value of the pinDebitReversalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalService }
     *     
     */
    public void setPinDebitReversalService(PinDebitReversalService value) {
        this.pinDebitReversalService = value;
    }

    /**
     * Gets the value of the emvRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EmvRequest }
     *     
     */
    public EmvRequest getEmvRequest() {
        return emvRequest;
    }

    /**
     * Sets the value of the emvRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvRequest }
     *     
     */
    public void setEmvRequest(EmvRequest value) {
        this.emvRequest = value;
    }

    /**
     * Gets the value of the merchantTransactionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionIdentifier() {
        return merchantTransactionIdentifier;
    }

    /**
     * Sets the value of the merchantTransactionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionIdentifier(String value) {
        this.merchantTransactionIdentifier = value;
    }

    /**
     * Gets the value of the paymentInitiationChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInitiationChannel() {
        return paymentInitiationChannel;
    }

    /**
     * Sets the value of the paymentInitiationChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInitiationChannel(String value) {
        this.paymentInitiationChannel = value;
    }

    /**
     * Gets the value of the extendedCreditTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCreditTotalCount() {
        return extendedCreditTotalCount;
    }

    /**
     * Sets the value of the extendedCreditTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCreditTotalCount(String value) {
        this.extendedCreditTotalCount = value;
    }

    /**
     * Gets the value of the authIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthIndicator() {
        return authIndicator;
    }

    /**
     * Sets the value of the authIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthIndicator(String value) {
        this.authIndicator = value;
    }

    /**
     * Gets the value of the paymentNetworkToken property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public PaymentNetworkToken getPaymentNetworkToken() {
        return paymentNetworkToken;
    }

    /**
     * Sets the value of the paymentNetworkToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentNetworkToken }
     *     
     */
    public void setPaymentNetworkToken(PaymentNetworkToken value) {
        this.paymentNetworkToken = value;
    }

}
