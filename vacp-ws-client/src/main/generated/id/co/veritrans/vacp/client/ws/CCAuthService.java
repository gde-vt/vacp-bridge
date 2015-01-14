
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCAuthService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCAuthService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commerceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciRaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconciliationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnAuthRecord" type="{urn:schemas-visa-com:transaction-data-1.101}boolean" minOccurs="0"/>
 *         &lt;element name="authType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verbalAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialAuthIndicator" type="{urn:schemas-visa-com:transaction-data-1.101}boolean" minOccurs="0"/>
 *         &lt;element name="captureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CCAuthService", propOrder = {
    "cavv",
    "commerceIndicator",
    "eciRaw",
    "xid",
    "reconciliationID",
    "returnAuthRecord",
    "authType",
    "verbalAuthCode",
    "partialAuthIndicator",
    "captureDate"
})
public class CCAuthService {

    protected String cavv;
    protected String commerceIndicator;
    protected String eciRaw;
    protected String xid;
    protected String reconciliationID;
    protected String returnAuthRecord;
    protected String authType;
    protected String verbalAuthCode;
    protected String partialAuthIndicator;
    protected String captureDate;
    @XmlAttribute(required = true)
    protected String run;

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
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
     * Gets the value of the eciRaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciRaw() {
        return eciRaw;
    }

    /**
     * Sets the value of the eciRaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciRaw(String value) {
        this.eciRaw = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXid() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXid(String value) {
        this.xid = value;
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
     * Gets the value of the returnAuthRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAuthRecord() {
        return returnAuthRecord;
    }

    /**
     * Sets the value of the returnAuthRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAuthRecord(String value) {
        this.returnAuthRecord = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

    /**
     * Gets the value of the verbalAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbalAuthCode() {
        return verbalAuthCode;
    }

    /**
     * Sets the value of the verbalAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbalAuthCode(String value) {
        this.verbalAuthCode = value;
    }

    /**
     * Gets the value of the partialAuthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAuthIndicator() {
        return partialAuthIndicator;
    }

    /**
     * Sets the value of the partialAuthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAuthIndicator(String value) {
        this.partialAuthIndicator = value;
    }

    /**
     * Gets the value of the captureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureDate() {
        return captureDate;
    }

    /**
     * Sets the value of the captureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureDate(String value) {
        this.captureDate = value;
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
