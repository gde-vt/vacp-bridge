
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCAuthReversalService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAuthReversalService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authRequestID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCAuthReversalService", propOrder = {
    "authRequestID"
})
public class CCAuthReversalService {

    protected String authRequestID;
    @XmlAttribute(required = true)
    protected String run;

    /**
     * Gets the value of the authRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRequestID() {
        return authRequestID;
    }

    /**
     * Sets the value of the authRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRequestID(String value) {
        this.authRequestID = value;
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
