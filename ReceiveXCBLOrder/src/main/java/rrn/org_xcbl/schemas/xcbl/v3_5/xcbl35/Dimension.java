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
 * <p>Java class for Dimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dimension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Measurement"/>
 *         &lt;element name="DimensionCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}DimensionCode"/>
 *         &lt;element name="DimensionCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimension", propOrder = {
    "measurement",
    "dimensionCoded",
    "dimensionCodedOther"
})
public class Dimension {

    @XmlElement(name = "Measurement", required = true)
    protected Measurement measurement;
    @XmlElement(name = "DimensionCoded", required = true)
    protected DimensionCode dimensionCoded;
    @XmlElement(name = "DimensionCodedOther")
    protected String dimensionCodedOther;

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link Measurement }
     *     
     */
    public Measurement getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measurement }
     *     
     */
    public void setMeasurement(Measurement value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the dimensionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionCode }
     *     
     */
    public DimensionCode getDimensionCoded() {
        return dimensionCoded;
    }

    /**
     * Sets the value of the dimensionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionCode }
     *     
     */
    public void setDimensionCoded(DimensionCode value) {
        this.dimensionCoded = value;
    }

    /**
     * Gets the value of the dimensionCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionCodedOther() {
        return dimensionCodedOther;
    }

    /**
     * Sets the value of the dimensionCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionCodedOther(String value) {
        this.dimensionCodedOther = value;
    }

}
