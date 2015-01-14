
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCreditService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCreditService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="captureRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="run" use="required" type="{urn:schemas-visa-com:transaction-data-1.101}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCreditService", propOrder = {
    "captureRequestID",
    "commerceIndicator"
})
public class CCCreditService {

    protected String captureRequestID;
    protected String commerceIndicator;
    @XmlAttribute(required = true)
    protected String run;

    /**
     * Gets the value of the captureRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureRequestID() {
        return captureRequestID;
    }

    /**
     * Sets the value of the captureRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureRequestID(String value) {
        this.captureRequestID = value;
    }

    /**
     * Gets the value of the commerceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommerceIndicator() {
        return commerceIndicator;
    }

    /**
     * Sets the value of the commerceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommerceIndicator(String value) {
        this.commerceIndicator = value;
    }

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRun(String value) {
        this.run = value;
    }

}
