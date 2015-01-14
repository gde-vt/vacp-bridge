
package id.co.veritrans.vacp.client.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCAuthReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAuthReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="amount" type="{urn:schemas-visa-com:transaction-data-1.101}amount" minOccurs="0"/>
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalIDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizedDateTime" type="{urn:schemas-visa-com:transaction-data-1.101}dateTime" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantAdviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantAdviceCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cavvResponseCodeRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalance" type="{urn:schemas-visa-com:transaction-data-1.101}amount" minOccurs="0"/>
 *         &lt;element name="paymentNetworkTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestAmount" type="{urn:schemas-visa-com:transaction-data-1.101}amount" minOccurs="0"/>
 *         &lt;element name="requestCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountBalanceSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCAuthReply", propOrder = {
    "reasonCode",
    "amount",
    "authorizationCode",
    "avsCode",
    "avsCodeRaw",
    "cvCode",
    "cvCodeRaw",
    "personalIDCode",
    "authorizedDateTime",
    "processorResponse",
    "reconciliationID",
    "authRecord",
    "merchantAdviceCode",
    "merchantAdviceCodeRaw",
    "cavvResponseCode",
    "cavvResponseCodeRaw",
    "accountBalance",
    "paymentNetworkTransactionID",
    "cardCategory",
    "requestAmount",
    "requestCurrency",
    "accountBalanceCurrency",
    "accountBalanceSign",
    "cardGroup"
})
public class CCAuthReply {

    @XmlElement(required = true)
    protected BigInteger reasonCode;
    protected String amount;
    protected String authorizationCode;
    protected String avsCode;
    protected String avsCodeRaw;
    protected String cvCode;
    protected String cvCodeRaw;
    protected String personalIDCode;
    protected String authorizedDateTime;
    protected String processorResponse;
    protected String reconciliationID;
    protected String authRecord;
    protected String merchantAdviceCode;
    protected String merchantAdviceCodeRaw;
    protected String cavvResponseCode;
    protected String cavvResponseCodeRaw;
    protected String accountBalance;
    protected String paymentNetworkTransactionID;
    protected String cardCategory;
    protected String requestAmount;
    protected String requestCurrency;
    protected String accountBalanceCurrency;
    protected String accountBalanceSign;
    protected String cardGroup;

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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the authorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the avsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Sets the value of the avsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Gets the value of the avsCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCodeRaw() {
        return avsCodeRaw;
    }

    /**
     * Sets the value of the avsCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCodeRaw(String value) {
        this.avsCodeRaw = value;
    }

    /**
     * Gets the value of the cvCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCode() {
        return cvCode;
    }

    /**
     * Sets the value of the cvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCode(String value) {
        this.cvCode = value;
    }

    /**
     * Gets the value of the cvCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvCodeRaw() {
        return cvCodeRaw;
    }

    /**
     * Sets the value of the cvCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvCodeRaw(String value) {
        this.cvCodeRaw = value;
    }

    /**
     * Gets the value of the personalIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalIDCode() {
        return personalIDCode;
    }

    /**
     * Sets the value of the personalIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalIDCode(String value) {
        this.personalIDCode = value;
    }

    /**
     * Gets the value of the authorizedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedDateTime() {
        return authorizedDateTime;
    }

    /**
     * Sets the value of the authorizedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedDateTime(String value) {
        this.authorizedDateTime = value;
    }

    /**
     * Gets the value of the processorResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Sets the value of the processorResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorResponse(String value) {
        this.processorResponse = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the authRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRecord() {
        return authRecord;
    }

    /**
     * Sets the value of the authRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRecord(String value) {
        this.authRecord = value;
    }

    /**
     * Gets the value of the merchantAdviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdviceCode() {
        return merchantAdviceCode;
    }

    /**
     * Sets the value of the merchantAdviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdviceCode(String value) {
        this.merchantAdviceCode = value;
    }

    /**
     * Gets the value of the merchantAdviceCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantAdviceCodeRaw() {
        return merchantAdviceCodeRaw;
    }

    /**
     * Sets the value of the merchantAdviceCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantAdviceCodeRaw(String value) {
        this.merchantAdviceCodeRaw = value;
    }

    /**
     * Gets the value of the cavvResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvResponseCode() {
        return cavvResponseCode;
    }

    /**
     * Sets the value of the cavvResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvResponseCode(String value) {
        this.cavvResponseCode = value;
    }

    /**
     * Gets the value of the cavvResponseCodeRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavvResponseCodeRaw() {
        return cavvResponseCodeRaw;
    }

    /**
     * Sets the value of the cavvResponseCodeRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavvResponseCodeRaw(String value) {
        this.cavvResponseCodeRaw = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalance(String value) {
        this.accountBalance = value;
    }

    /**
     * Gets the value of the paymentNetworkTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentNetworkTransactionID() {
        return paymentNetworkTransactionID;
    }

    /**
     * Sets the value of the paymentNetworkTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentNetworkTransactionID(String value) {
        this.paymentNetworkTransactionID = value;
    }

    /**
     * Gets the value of the cardCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCategory() {
        return cardCategory;
    }

    /**
     * Sets the value of the cardCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCategory(String value) {
        this.cardCategory = value;
    }

    /**
     * Gets the value of the requestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestAmount() {
        return requestAmount;
    }

    /**
     * Sets the value of the requestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestAmount(String value) {
        this.requestAmount = value;
    }

    /**
     * Gets the value of the requestCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCurrency() {
        return requestCurrency;
    }

    /**
     * Sets the value of the requestCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCurrency(String value) {
        this.requestCurrency = value;
    }

    /**
     * Gets the value of the accountBalanceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceCurrency() {
        return accountBalanceCurrency;
    }

    /**
     * Sets the value of the accountBalanceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceCurrency(String value) {
        this.accountBalanceCurrency = value;
    }

    /**
     * Gets the value of the accountBalanceSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountBalanceSign() {
        return accountBalanceSign;
    }

    /**
     * Sets the value of the accountBalanceSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountBalanceSign(String value) {
        this.accountBalanceSign = value;
    }

    /**
     * Gets the value of the cardGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardGroup() {
        return cardGroup;
    }

    /**
     * Sets the value of the cardGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardGroup(String value) {
        this.cardGroup = value;
    }

}
