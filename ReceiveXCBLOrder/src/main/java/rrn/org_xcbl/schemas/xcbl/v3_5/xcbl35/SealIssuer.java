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
 * <p>Java class for SealIssuer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SealIssuer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SealIssuerCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SealIssuerCode"/>
 *         &lt;element name="SealIssuerCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SealIssuer", propOrder = {
    "sealIssuerCoded",
    "sealIssuerCodedOther"
})
public class SealIssuer {

    @XmlElement(name = "SealIssuerCoded", required = true)
    protected SealIssuerCode sealIssuerCoded;
    @XmlElement(name = "SealIssuerCodedOther")
    protected String sealIssuerCodedOther;

    /**
     * Gets the value of the sealIssuerCoded property.
     * 
     * @return
     *     possible object is
     *     {@link SealIssuerCode }
     *     
     */
    public SealIssuerCode getSealIssuerCoded() {
        return sealIssuerCoded;
    }

    /**
     * Sets the value of the sealIssuerCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealIssuerCode }
     *     
     */
    public void setSealIssuerCoded(SealIssuerCode value) {
        this.sealIssuerCoded = value;
    }

    /**
     * Gets the value of the sealIssuerCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealIssuerCodedOther() {
        return sealIssuerCodedOther;
    }

    /**
     * Sets the value of the sealIssuerCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealIssuerCodedOther(String value) {
        this.sealIssuerCodedOther = value;
    }

}