//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContactFunction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactFunctionCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ContactFunctionCode"/>
 *         &lt;element name="ContactFunctionCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactFunction", propOrder = {
    "contactFunctionCoded",
    "contactFunctionCodedOther"
})
public class ContactFunction {

    @XmlElement(name = "ContactFunctionCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactFunctionCoded;
    @XmlElement(name = "ContactFunctionCodedOther")
    protected String contactFunctionCodedOther;

    /**
     * Gets the value of the contactFunctionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFunctionCoded() {
        return contactFunctionCoded;
    }

    /**
     * Sets the value of the contactFunctionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFunctionCoded(String value) {
        this.contactFunctionCoded = value;
    }

    /**
     * Gets the value of the contactFunctionCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFunctionCodedOther() {
        return contactFunctionCodedOther;
    }

    /**
     * Sets the value of the contactFunctionCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFunctionCodedOther(String value) {
        this.contactFunctionCodedOther = value;
    }

}