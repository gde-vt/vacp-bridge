
package id.co.veritrans.vacp.client.ws;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplyMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplyMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantReferenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="decision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="missingField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="invalidField" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="purchaseTotals" type="{urn:schemas-visa-com:transaction-data-1.101}PurchaseTotals" minOccurs="0"/>
 *         &lt;element name="ccAuthReply" type="{urn:schemas-visa-com:transaction-data-1.101}CCAuthReply" minOccurs="0"/>
 *         &lt;element name="ccCaptureReply" type="{urn:schemas-visa-com:transaction-data-1.101}CCCaptureReply" minOccurs="0"/>
 *         &lt;element name="ccCreditReply" type="{urn:schemas-visa-com:transaction-data-1.101}CCCreditReply" minOccurs="0"/>
 *         &lt;element name="ccAuthReversalReply" type="{urn:schemas-visa-com:transaction-data-1.101}CCAuthReversalReply" minOccurs="0"/>
 *         &lt;element name="voidReply" type="{urn:schemas-visa-com:transaction-data-1.101}VoidReply" minOccurs="0"/>
 *         &lt;element name="pinDebitPurchaseReply" type="{urn:schemas-visa-com:transaction-data-1.101}PinDebitPurchaseReply" minOccurs="0"/>
 *         &lt;element name="pinDebitCreditReply" type="{urn:schemas-visa-com:transaction-data-1.101}PinDebitCreditReply" minOccurs="0"/>
 *         &lt;element name="pinDebitReversalReply" type="{urn:schemas-visa-com:transaction-data-1.101}PinDebitReversalReply" minOccurs="0"/>
 *         &lt;element name="receiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotion" type="{urn:schemas-visa-com:transaction-data-1.101}Promotion" minOccurs="0"/>
 *         &lt;element name="emvReply" type="{urn:schemas-visa-com:transaction-data-1.101}EmvReply" minOccurs="0"/>
 *         &lt;element name="card" type="{urn:schemas-visa-com:transaction-data-1.101}Card" minOccurs="0"/>
 *         &lt;element name="paymentNetworkToken" type="{urn:schemas-visa-com:transaction-data-1.101}PaymentNetworkToken" minOccurs="0"/>
 *         &lt;element name="reserved" type="{urn:schemas-visa-com:transaction-data-1.101}ReplyReserved" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReplyMessage", propOrder = {
    "merchantReferenceCode",
    "requestID",
    "decision",
    "reasonCode",
    "missingField",
    "invalidField",
    "requestToken",
    "purchaseTotals",
    "ccAuthReply",
    "ccCaptureReply",
    "ccCreditReply",
    "ccAuthReversalReply",
    "voidReply",
    "pinDebitPurchaseReply",
    "pinDebitCreditReply",
    "pinDebitReversalReply",
    "receiptNumber",
    "additionalData",
    "promotion",
    "emvReply",
    "card",
    "paymentNetworkToken",
    "reserved"
})
public class ReplyMessage {

    protected String merchantReferenceCode;
    @XmlElement(required = true)
    protected String requestID;
    @XmlElement(required = true)
    protected String decision;
    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected List<String> missingField;
    protected List<String> invalidField;
    @XmlElement(required = true)
    protected String requestToken;
    protected PurchaseTotals purchaseTotals;
    protected CCAuthReply ccAuthReply;
    protected CCCaptureReply ccCaptureReply;
    protected CCCreditReply ccCreditReply;
    protected CCAuthReversalReply ccAuthReversalReply;
    protected VoidReply voidReply;
    protected PinDebitPurchaseReply pinDebitPurchaseReply;
    protected PinDebitCreditReply pinDebitCreditReply;
    protected PinDebitReversalReply pinDebitReversalReply;
    protected String receiptNumber;
    protected String additionalData;
    protected Promotion promotion;
    protected EmvReply emvReply;
    protected Card card;
    protected PaymentNetworkToken paymentNetworkToken;
    protected ReplyReserved reserved;

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
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecision(String value) {
        this.decision = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReasonCode(BigInteger value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the missingField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMissingField() {
        if (missingField == null) {
            missingField = new ArrayList<String>();
        }
        return this.missingField;
    }

    /**
     * Gets the value of the invalidField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invalidField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvalidField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInvalidField() {
        if (invalidField == null) {
            invalidField = new ArrayList<String>();
        }
        return this.invalidField;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
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
     * Gets the value of the ccAuthReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReply }
     *     
     */
    public CCAuthReply getCcAuthReply() {
        return ccAuthReply;
    }

    /**
     * Sets the value of the ccAuthReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReply }
     *     
     */
    public void setCcAuthReply(CCAuthReply value) {
        this.ccAuthReply = value;
    }

    /**
     * Gets the value of the ccCaptureReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCCaptureReply }
     *     
     */
    public CCCaptureReply getCcCaptureReply() {
        return ccCaptureReply;
    }

    /**
     * Sets the value of the ccCaptureReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCaptureReply }
     *     
     */
    public void setCcCaptureReply(CCCaptureReply value) {
        this.ccCaptureReply = value;
    }

    /**
     * Gets the value of the ccCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCCreditReply }
     *     
     */
    public CCCreditReply getCcCreditReply() {
        return ccCreditReply;
    }

    /**
     * Sets the value of the ccCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCCreditReply }
     *     
     */
    public void setCcCreditReply(CCCreditReply value) {
        this.ccCreditReply = value;
    }

    /**
     * Gets the value of the ccAuthReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link CCAuthReversalReply }
     *     
     */
    public CCAuthReversalReply getCcAuthReversalReply() {
        return ccAuthReversalReply;
    }

    /**
     * Sets the value of the ccAuthReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCAuthReversalReply }
     *     
     */
    public void setCcAuthReversalReply(CCAuthReversalReply value) {
        this.ccAuthReversalReply = value;
    }

    /**
     * Gets the value of the voidReply property.
     * 
     * @return
     *     possible object is
     *     {@link VoidReply }
     *     
     */
    public VoidReply getVoidReply() {
        return voidReply;
    }

    /**
     * Sets the value of the voidReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidReply }
     *     
     */
    public void setVoidReply(VoidReply value) {
        this.voidReply = value;
    }

    /**
     * Gets the value of the pinDebitPurchaseReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitPurchaseReply }
     *     
     */
    public PinDebitPurchaseReply getPinDebitPurchaseReply() {
        return pinDebitPurchaseReply;
    }

    /**
     * Sets the value of the pinDebitPurchaseReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitPurchaseReply }
     *     
     */
    public void setPinDebitPurchaseReply(PinDebitPurchaseReply value) {
        this.pinDebitPurchaseReply = value;
    }

    /**
     * Gets the value of the pinDebitCreditReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitCreditReply }
     *     
     */
    public PinDebitCreditReply getPinDebitCreditReply() {
        return pinDebitCreditReply;
    }

    /**
     * Sets the value of the pinDebitCreditReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitCreditReply }
     *     
     */
    public void setPinDebitCreditReply(PinDebitCreditReply value) {
        this.pinDebitCreditReply = value;
    }

    /**
     * Gets the value of the pinDebitReversalReply property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitReversalReply }
     *     
     */
    public PinDebitReversalReply getPinDebitReversalReply() {
        return pinDebitReversalReply;
    }

    /**
     * Sets the value of the pinDebitReversalReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitReversalReply }
     *     
     */
    public void setPinDebitReversalReply(PinDebitReversalReply value) {
        this.pinDebitReversalReply = value;
    }

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNumber(String value) {
        this.receiptNumber = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Sets the value of the additionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the emvReply property.
     * 
     * @return
     *     possible object is
     *     {@link EmvReply }
     *     
     */
    public EmvReply getEmvReply() {
        return emvReply;
    }

    /**
     * Sets the value of the emvReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmvReply }
     *     
     */
    public void setEmvReply(EmvReply value) {
        this.emvReply = value;
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

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyReserved }
     *     
     */
    public ReplyReserved getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyReserved }
     *     
     */
    public void setReserved(ReplyReserved value) {
        this.reserved = value;
    }

}
