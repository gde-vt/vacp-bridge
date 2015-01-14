
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardPresent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pos", propOrder = {
    "entryMode",
    "cardPresent",
    "terminalCapability",
    "trackData",
    "terminalID",
    "catLevel",
    "serviceCode"
})
public class Pos {

    protected String entryMode;
    protected String cardPresent;
    protected String terminalCapability;
    protected String trackData;
    protected String terminalID;
    protected String catLevel;
    protected String serviceCode;

    /**
     * Gets the value of the entryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryMode() {
        return entryMode;
    }

    /**
     * Sets the value of the entryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryMode(String value) {
        this.entryMode = value;
    }

    /**
     * Gets the value of the cardPresent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPresent() {
        return cardPresent;
    }

    /**
     * Sets the value of the cardPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPresent(String value) {
        this.cardPresent = value;
    }

    /**
     * Gets the value of the terminalCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalCapability() {
        return terminalCapability;
    }

    /**
     * Sets the value of the terminalCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalCapability(String value) {
        this.terminalCapability = value;
    }

    /**
     * Gets the value of the trackData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackData() {
        return trackData;
    }

    /**
     * Sets the value of the trackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackData(String value) {
        this.trackData = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the catLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatLevel() {
        return catLevel;
    }

    /**
     * Sets the value of the catLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatLevel(String value) {
        this.catLevel = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

}
