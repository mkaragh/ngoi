//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceMultiplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceMultiplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceMultiplierCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PriceMultiplierCode"/>
 *         &lt;element name="PriceMultiplierCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Multiplier" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceMultiplier", propOrder = {
    "priceMultiplierCoded",
    "priceMultiplierCodedOther",
    "multiplier"
})
public class PriceMultiplier {

    @XmlElement(name = "PriceMultiplierCoded", required = true)
    protected PriceMultiplierCode priceMultiplierCoded;
    @XmlElement(name = "PriceMultiplierCodedOther")
    protected String priceMultiplierCodedOther;
    @XmlElement(name = "Multiplier", required = true)
    protected BigDecimal multiplier;

    /**
     * Gets the value of the priceMultiplierCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMultiplierCode }
     *     
     */
    public PriceMultiplierCode getPriceMultiplierCoded() {
        return priceMultiplierCoded;
    }

    /**
     * Sets the value of the priceMultiplierCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMultiplierCode }
     *     
     */
    public void setPriceMultiplierCoded(PriceMultiplierCode value) {
        this.priceMultiplierCoded = value;
    }

    /**
     * Gets the value of the priceMultiplierCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceMultiplierCodedOther() {
        return priceMultiplierCodedOther;
    }

    /**
     * Sets the value of the priceMultiplierCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMultiplierCodedOther(String value) {
        this.priceMultiplierCodedOther = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

}
