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
 * <p>Java class for MonetaryValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonetaryAmount" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Decimal21_6"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}RateOfExchangeDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryValue", propOrder = {
    "monetaryAmount",
    "currency",
    "rateOfExchangeDetail"
})
public class MonetaryValue {

    @XmlElement(name = "MonetaryAmount", required = true)
    protected BigDecimal monetaryAmount;
    @XmlElement(name = "Currency")
    protected Currency currency;
    @XmlElement(name = "RateOfExchangeDetail")
    protected RateOfExchangeDetail rateOfExchangeDetail;

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryAmount(BigDecimal value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the rateOfExchangeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RateOfExchangeDetail }
     *     
     */
    public RateOfExchangeDetail getRateOfExchangeDetail() {
        return rateOfExchangeDetail;
    }

    /**
     * Sets the value of the rateOfExchangeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOfExchangeDetail }
     *     
     */
    public void setRateOfExchangeDetail(RateOfExchangeDetail value) {
        this.rateOfExchangeDetail = value;
    }

}
