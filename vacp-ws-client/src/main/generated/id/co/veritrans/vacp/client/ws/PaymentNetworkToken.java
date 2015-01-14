
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentNetworkToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentNetworkToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assuranceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentNetworkToken", propOrder = {
    "requestorID",
    "assuranceLevel",
    "accountStatus"
})
public class PaymentNetworkToken {

    protected String requestorID;
    protected String assuranceLevel;
    protected String accountStatus;

    /**
     * Gets the value of the requestorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestorID() {
        return requestorID;
    }

    /**
     * Sets the value of the requestorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestorID(String value) {
        this.requestorID = value;
    }

    /**
     * Gets the value of the assuranceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssuranceLevel() {
        return assuranceLevel;
    }

    /**
     * Sets the value of the assuranceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssuranceLevel(String value) {
        this.assuranceLevel = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

}
