//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.04 at 03:22:36 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageAllowanceOrCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageAllowanceOrCharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PercentQualifier"/>
 *         &lt;element name="Percent" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Decimal10_4"/>
 *         &lt;element name="PercentageMonetaryValue" minOccurs="0">
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
@XmlType(name = "PercentageAllowanceOrCharge", propOrder = {
    "percentQualifier",
    "percent",
    "percentageMonetaryValue"
})
public class PercentageAllowanceOrCharge {

    @XmlElement(name = "PercentQualifier", required = true)
    protected PercentQualifier percentQualifier;
    @XmlElement(name = "Percent", required = true)
    protected BigDecimal percent;
    @XmlElement(name = "PercentageMonetaryValue")
    protected PercentageAllowanceOrCharge.PercentageMonetaryValue percentageMonetaryValue;

    /**
     * Gets the value of the percentQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link PercentQualifier }
     *     
     */
    public PercentQualifier getPercentQualifier() {
        return percentQualifier;
    }

    /**
     * Sets the value of the percentQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentQualifier }
     *     
     */
    public void setPercentQualifier(PercentQualifier value) {
        this.percentQualifier = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the percentageMonetaryValue property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageAllowanceOrCharge.PercentageMonetaryValue }
     *     
     */
    public PercentageAllowanceOrCharge.PercentageMonetaryValue getPercentageMonetaryValue() {
        return percentageMonetaryValue;
    }

    /**
     * Sets the value of the percentageMonetaryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageAllowanceOrCharge.PercentageMonetaryValue }
     *     
     */
    public void setPercentageMonetaryValue(PercentageAllowanceOrCharge.PercentageMonetaryValue value) {
        this.percentageMonetaryValue = value;
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
    public static class PercentageMonetaryValue {

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
