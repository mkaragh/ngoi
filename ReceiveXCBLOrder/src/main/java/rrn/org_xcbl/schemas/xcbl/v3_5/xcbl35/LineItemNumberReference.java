//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for LineItemNumberReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemNumberReference">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *       &lt;attribute name="LineItemNumTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}LineItemNumTypeCode" default="Buyer" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemNumberReference", propOrder = {
    "value"
})
public class LineItemNumberReference {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "LineItemNumTypeCoded")
    protected LineItemNumTypeCode lineItemNumTypeCoded;

    /**
     * Gets the value of the value property.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the lineItemNumTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemNumTypeCode }
     *     
     */
    public LineItemNumTypeCode getLineItemNumTypeCoded() {
        if (lineItemNumTypeCoded == null) {
            return LineItemNumTypeCode.BUYER;
        } else {
            return lineItemNumTypeCoded;
        }
    }

    /**
     * Sets the value of the lineItemNumTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemNumTypeCode }
     *     
     */
    public void setLineItemNumTypeCoded(LineItemNumTypeCode value) {
        this.lineItemNumTypeCoded = value;
    }

}
