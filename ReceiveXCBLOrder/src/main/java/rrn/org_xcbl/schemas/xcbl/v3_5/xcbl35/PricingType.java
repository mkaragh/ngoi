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


/**
 * <p>Java class for PricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceTypeCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PriceTypeCode"/>
 *         &lt;element name="PriceTypeCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingType", propOrder = {
    "priceTypeCoded",
    "priceTypeCodedOther"
})
public class PricingType {

    @XmlElement(name = "PriceTypeCoded", required = true)
    protected PriceTypeCode priceTypeCoded;
    @XmlElement(name = "PriceTypeCodedOther")
    protected String priceTypeCodedOther;

    /**
     * Gets the value of the priceTypeCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeCode }
     *     
     */
    public PriceTypeCode getPriceTypeCoded() {
        return priceTypeCoded;
    }

    /**
     * Sets the value of the priceTypeCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeCode }
     *     
     */
    public void setPriceTypeCoded(PriceTypeCode value) {
        this.priceTypeCoded = value;
    }

    /**
     * Gets the value of the priceTypeCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTypeCodedOther() {
        return priceTypeCodedOther;
    }

    /**
     * Sets the value of the priceTypeCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTypeCodedOther(String value) {
        this.priceTypeCodedOther = value;
    }

}
