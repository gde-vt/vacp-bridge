
package id.co.veritrans.vacp.client.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmvRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmvRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="combinedTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmvRequest", propOrder = {
    "combinedTags",
    "cardSequenceNumber"
})
public class EmvRequest {

    protected String combinedTags;
    protected String cardSequenceNumber;

    /**
     * Gets the value of the combinedTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCombinedTags() {
        return combinedTags;
    }

    /**
     * Sets the value of the combinedTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCombinedTags(String value) {
        this.combinedTags = value;
    }

    /**
     * Gets the value of the cardSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSequenceNumber() {
        return cardSequenceNumber;
    }

    /**
     * Sets the value of the cardSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSequenceNumber(String value) {
        this.cardSequenceNumber = value;
    }

}
