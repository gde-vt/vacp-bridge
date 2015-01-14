
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ignoreAVSResult" type="{urn:schemas-visa-com:transaction-data-1.101}boolean" minOccurs="0"/>
 *         &lt;element name="ignoreCVResult" type="{urn:schemas-visa-com:transaction-data-1.101}boolean" minOccurs="0"/>
 *         &lt;element name="declineAVSFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessRules", propOrder = {
    "ignoreAVSResult",
    "ignoreCVResult",
    "declineAVSFlags"
})
public class BusinessRules {

    protected String ignoreAVSResult;
    protected String ignoreCVResult;
    protected String declineAVSFlags;

    /**
     * Gets the value of the ignoreAVSResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreAVSResult() {
        return ignoreAVSResult;
    }

    /**
     * Sets the value of the ignoreAVSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreAVSResult(String value) {
        this.ignoreAVSResult = value;
    }

    /**
     * Gets the value of the ignoreCVResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCVResult() {
        return ignoreCVResult;
    }

    /**
     * Sets the value of the ignoreCVResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCVResult(String value) {
        this.ignoreCVResult = value;
    }

    /**
     * Gets the value of the declineAVSFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclineAVSFlags() {
        return declineAVSFlags;
    }

    /**
     * Sets the value of the declineAVSFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclineAVSFlags(String value) {
        this.declineAVSFlags = value;
    }

}
