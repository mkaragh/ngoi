//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactNumberValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContactNumberTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ContactNumberTypeCode"/>
 *         &lt;element name="ContactNumberTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactNumber", propOrder = {
    "contactNumberValue",
    "contactNumberTypeCoded",
    "contactNumberTypeCodedOther"
})
public class ContactNumber {

    @XmlElement(name = "ContactNumberValue", required = true)
    protected String contactNumberValue;
    @XmlElement(name = "ContactNumberTypeCoded", required = true)
    protected ContactNumberTypeCode contactNumberTypeCoded;
    @XmlElement(name = "ContactNumberTypeCodedOther")
    protected String contactNumberTypeCodedOther;

    /**
     * Gets the value of the contactNumberValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumberValue() {
        return contactNumberValue;
    }

    /**
     * Sets the value of the contactNumberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumberValue(String value) {
        this.contactNumberValue = value;
    }

    /**
     * Gets the value of the contactNumberTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link ContactNumberTypeCode }
     *     
     */
    public ContactNumberTypeCode getContactNumberTypeCoded() {
        return contactNumberTypeCoded;
    }

    /**
     * Sets the value of the contactNumberTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactNumberTypeCode }
     *     
     */
    public void setContactNumberTypeCoded(ContactNumberTypeCode value) {
        this.contactNumberTypeCoded = value;
    }

    /**
     * Gets the value of the contactNumberTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumberTypeCodedOther() {
        return contactNumberTypeCodedOther;
    }

    /**
     * Sets the value of the contactNumberTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumberTypeCodedOther(String value) {
        this.contactNumberTypeCodedOther = value;
    }

}
