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
 * <p>Java class for Currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Currency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}CurrencyCode"/>
 *         &lt;element name="CurrencyCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
    "currencyCoded",
    "currencyCodedOther"
})
public class Currency {

    @XmlElement(name = "CurrencyCoded", required = true)
    protected CurrencyCode currencyCoded;
    @XmlElement(name = "CurrencyCodedOther")
    protected String currencyCodedOther;

    /**
     * Gets the value of the currencyCoded property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCoded() {
        return currencyCoded;
    }

    /**
     * Sets the value of the currencyCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCoded(CurrencyCode value) {
        this.currencyCoded = value;
    }

    /**
     * Gets the value of the currencyCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodedOther() {
        return currencyCodedOther;
    }

    /**
     * Sets the value of the currencyCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodedOther(String value) {
        this.currencyCodedOther = value;
    }

}
