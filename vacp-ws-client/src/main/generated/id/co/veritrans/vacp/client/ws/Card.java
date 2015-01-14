
package id.co.veritrans.vacp.client.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Card complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Card">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cvIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="encryptedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Card", propOrder = {
    "accountNumber",
    "expirationMonth",
    "expirationYear",
    "cvIndicator",
    "cvNumber",
    "cardType",
    "encryptedData",
    "suffix"
})
public class Card {

    protected String accountNumber;
    protected BigInteger expirationMonth;
    protected BigInteger expirationYear;
    protected String cvIndicator;
    protected String cvNumber;
    protected String cardType;
    protected String encryptedData;
    protected String suffix;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the expirationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Sets the value of the expirationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationMonth(BigInteger value) {
        this.expirationMonth = value;
    }

    /**
     * Gets the value of the expirationYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpirationYear() {
        return expirationYear;
    }

    /**
     * Sets the value of the expirationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpirationYear(BigInteger value) {
        this.expirationYear = value;
    }

    /**
     * Gets the value of the cvIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvIndicator() {
        return cvIndicator;
    }

    /**
     * Sets the value of the cvIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvIndicator(String value) {
        this.cvIndicator = value;
    }

    /**
     * Gets the value of the cvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvNumber() {
        return cvNumber;
    }

    /**
     * Sets the value of the cvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvNumber(String value) {
        this.cvNumber = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the encryptedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedData() {
        return encryptedData;
    }

    /**
     * Sets the value of the encryptedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedData(String value) {
        this.encryptedData = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

}
