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
 * <p>Java class for Timezone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Timezone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimezoneCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TimezoneCode"/>
 *         &lt;element name="TimezoneCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timezone", propOrder = {
    "timezoneCoded",
    "timezoneCodedOther"
})
public class Timezone {

    @XmlElement(name = "TimezoneCoded", required = true)
    protected String timezoneCoded;
    @XmlElement(name = "TimezoneCodedOther")
    protected String timezoneCodedOther;

    /**
     * Gets the value of the timezoneCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneCoded() {
        return timezoneCoded;
    }

    /**
     * Sets the value of the timezoneCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneCoded(String value) {
        this.timezoneCoded = value;
    }

    /**
     * Gets the value of the timezoneCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneCodedOther() {
        return timezoneCodedOther;
    }

    /**
     * Sets the value of the timezoneCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneCodedOther(String value) {
        this.timezoneCodedOther = value;
    }

}
