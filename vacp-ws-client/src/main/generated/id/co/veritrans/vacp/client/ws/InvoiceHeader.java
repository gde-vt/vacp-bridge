
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorAlternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantDescriptorCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxable" type="{urn:schemas-visa-com:transaction-data-1.101}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeader", propOrder = {
    "merchantDescriptor",
    "merchantDescriptorContact",
    "merchantDescriptorAlternate",
    "merchantDescriptorStreet",
    "merchantDescriptorCity",
    "merchantDescriptorState",
    "merchantDescriptorPostalCode",
    "merchantDescriptorCountry",
    "userPO",
    "taxable"
})
public class InvoiceHeader {

    protected String merchantDescriptor;
    protected String merchantDescriptorContact;
    protected String merchantDescriptorAlternate;
    protected String merchantDescriptorStreet;
    protected String merchantDescriptorCity;
    protected String merchantDescriptorState;
    protected String merchantDescriptorPostalCode;
    protected String merchantDescriptorCountry;
    protected String userPO;
    protected String taxable;

    /**
     * Gets the value of the merchantDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptor() {
        return merchantDescriptor;
    }

    /**
     * Sets the value of the merchantDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptor(String value) {
        this.merchantDescriptor = value;
    }

    /**
     * Gets the value of the merchantDescriptorContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorContact() {
        return merchantDescriptorContact;
    }

    /**
     * Sets the value of the merchantDescriptorContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorContact(String value) {
        this.merchantDescriptorContact = value;
    }

    /**
     * Gets the value of the merchantDescriptorAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorAlternate() {
        return merchantDescriptorAlternate;
    }

    /**
     * Sets the value of the merchantDescriptorAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorAlternate(String value) {
        this.merchantDescriptorAlternate = value;
    }

    /**
     * Gets the value of the merchantDescriptorStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorStreet() {
        return merchantDescriptorStreet;
    }

    /**
     * Sets the value of the merchantDescriptorStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorStreet(String value) {
        this.merchantDescriptorStreet = value;
    }

    /**
     * Gets the value of the merchantDescriptorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCity() {
        return merchantDescriptorCity;
    }

    /**
     * Sets the value of the merchantDescriptorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCity(String value) {
        this.merchantDescriptorCity = value;
    }

    /**
     * Gets the value of the merchantDescriptorState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorState() {
        return merchantDescriptorState;
    }

    /**
     * Sets the value of the merchantDescriptorState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorState(String value) {
        this.merchantDescriptorState = value;
    }

    /**
     * Gets the value of the merchantDescriptorPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorPostalCode() {
        return merchantDescriptorPostalCode;
    }

    /**
     * Sets the value of the merchantDescriptorPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorPostalCode(String value) {
        this.merchantDescriptorPostalCode = value;
    }

    /**
     * Gets the value of the merchantDescriptorCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantDescriptorCountry() {
        return merchantDescriptorCountry;
    }

    /**
     * Sets the value of the merchantDescriptorCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantDescriptorCountry(String value) {
        this.merchantDescriptorCountry = value;
    }

    /**
     * Gets the value of the userPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPO() {
        return userPO;
    }

    /**
     * Sets the value of the userPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPO(String value) {
        this.userPO = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxable(String value) {
        this.taxable = value;
    }

}
