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
 * <p>Java class for Rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePerUnit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}UnitPrice"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnitPriceBasis" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Decimal18_3"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}UnitOfMeasurement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate", propOrder = {
    "ratePerUnit",
    "unitPriceBasis",
    "unitOfMeasurement"
})
public class Rate {

    @XmlElement(name = "RatePerUnit", required = true)
    protected Rate.RatePerUnit ratePerUnit;
    @XmlElement(name = "UnitPriceBasis", required = true)
    protected BigDecimal unitPriceBasis;
    @XmlElement(name = "UnitOfMeasurement")
    protected UnitOfMeasurement unitOfMeasurement;

    /**
     * Gets the value of the ratePerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Rate.RatePerUnit }
     *     
     */
    public Rate.RatePerUnit getRatePerUnit() {
        return ratePerUnit;
    }

    /**
     * Sets the value of the ratePerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate.RatePerUnit }
     *     
     */
    public void setRatePerUnit(Rate.RatePerUnit value) {
        this.ratePerUnit = value;
    }

    /**
     * Gets the value of the unitPriceBasis property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPriceBasis() {
        return unitPriceBasis;
    }

    /**
     * Sets the value of the unitPriceBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPriceBasis(BigDecimal value) {
        this.unitPriceBasis = value;
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setUnitOfMeasurement(UnitOfMeasurement value) {
        this.unitOfMeasurement = value;
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
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}UnitPrice"/>
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
        "unitPrice"
    })
    public static class RatePerUnit {

        @XmlElement(name = "UnitPrice", required = true)
        protected UnitPrice unitPrice;

        /**
         * Gets the value of the unitPrice property.
         * 
         * @return
         *     possible object is
         *     {@link UnitPrice }
         *     
         */
        public UnitPrice getUnitPrice() {
            return unitPrice;
        }

        /**
         * Sets the value of the unitPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link UnitPrice }
         *     
         */
        public void setUnitPrice(UnitPrice value) {
            this.unitPrice = value;
        }

    }

}