//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:06:19 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityAllowanceOrCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityAllowanceOrCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Rate"/>
 *         &lt;element name="QuantityMonetaryValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}MonetaryValue"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAllowanceOrCharge", propOrder = {
    "quantity",
    "rate",
    "quantityMonetaryValue"
})
public class QuantityAllowanceOrCharge {

    @XmlElement(name = "Quantity", required = true)
    protected Quantity quantity;
    @XmlElement(name = "Rate", required = true)
    protected Rate rate;
    @XmlElement(name = "QuantityMonetaryValue")
    protected QuantityAllowanceOrCharge.QuantityMonetaryValue quantityMonetaryValue;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the quantityMonetaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAllowanceOrCharge.QuantityMonetaryValue }
     *     
     */
    public QuantityAllowanceOrCharge.QuantityMonetaryValue getQuantityMonetaryValue() {
        return quantityMonetaryValue;
    }

    /**
     * Sets the value of the quantityMonetaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAllowanceOrCharge.QuantityMonetaryValue }
     *     
     */
    public void setQuantityMonetaryValue(QuantityAllowanceOrCharge.QuantityMonetaryValue value) {
        this.quantityMonetaryValue = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}MonetaryValue"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "monetaryValue"
    })
    public static class QuantityMonetaryValue {

        @XmlElement(name = "MonetaryValue", required = true)
        protected MonetaryValue monetaryValue;

        /**
         * Gets the value of the monetaryValue property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryValue }
         *     
         */
        public MonetaryValue getMonetaryValue() {
            return monetaryValue;
        }

        /**
         * Sets the value of the monetaryValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryValue }
         *     
         */
        public void setMonetaryValue(MonetaryValue value) {
            this.monetaryValue = value;
        }

    }

}
