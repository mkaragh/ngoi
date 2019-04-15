//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:06:19 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryLimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MonetaryLimitValue" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Decimal21_6"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Currency"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SignificanceCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SignificanceCode" />
 *       &lt;attribute name="SignificanceCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryLimit", propOrder = {
    "monetaryLimitValue",
    "currency"
})
public class MonetaryLimit {

    @XmlElement(name = "MonetaryLimitValue", required = true)
    protected BigDecimal monetaryLimitValue;
    @XmlElement(name = "Currency", required = true)
    protected Currency currency;
    @XmlAttribute(name = "SignificanceCoded")
    protected SignificanceCode significanceCoded;
    @XmlAttribute(name = "SignificanceCodedOther")
    protected String significanceCodedOther;

    /**
     * Gets the value of the monetaryLimitValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonetaryLimitValue() {
        return monetaryLimitValue;
    }

    /**
     * Sets the value of the monetaryLimitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonetaryLimitValue(BigDecimal value) {
        this.monetaryLimitValue = value;
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
     * Gets the value of the significanceCoded property.
     * 
     * @return
     *     possible object is
     *     {@link SignificanceCode }
     *     
     */
    public SignificanceCode getSignificanceCoded() {
        return significanceCoded;
    }

    /**
     * Sets the value of the significanceCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificanceCode }
     *     
     */
    public void setSignificanceCoded(SignificanceCode value) {
        this.significanceCoded = value;
    }

    /**
     * Gets the value of the significanceCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignificanceCodedOther() {
        return significanceCodedOther;
    }

    /**
     * Sets the value of the significanceCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignificanceCodedOther(String value) {
        this.significanceCodedOther = value;
    }

}
