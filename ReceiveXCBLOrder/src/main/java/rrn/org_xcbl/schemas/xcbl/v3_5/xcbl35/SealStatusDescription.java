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
 * <p>Java class for SealStatusDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SealStatusDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SealStatusCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SealStatusCode" minOccurs="0"/>
 *         &lt;element name="SealStatusCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SealStatusInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SealStatusDescription", propOrder = {
    "sealStatusCoded",
    "sealStatusCodedOther",
    "sealStatusInfo"
})
public class SealStatusDescription {

    @XmlElement(name = "SealStatusCoded")
    protected SealStatusCode sealStatusCoded;
    @XmlElement(name = "SealStatusCodedOther")
    protected String sealStatusCodedOther;
    @XmlElement(name = "SealStatusInfo")
    protected String sealStatusInfo;

    /**
     * Gets the value of the sealStatusCoded property.
     * 
     * @return
     *     possible object is
     *     {@link SealStatusCode }
     *     
     */
    public SealStatusCode getSealStatusCoded() {
        return sealStatusCoded;
    }

    /**
     * Sets the value of the sealStatusCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealStatusCode }
     *     
     */
    public void setSealStatusCoded(SealStatusCode value) {
        this.sealStatusCoded = value;
    }

    /**
     * Gets the value of the sealStatusCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealStatusCodedOther() {
        return sealStatusCodedOther;
    }

    /**
     * Sets the value of the sealStatusCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealStatusCodedOther(String value) {
        this.sealStatusCodedOther = value;
    }

    /**
     * Gets the value of the sealStatusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSealStatusInfo() {
        return sealStatusInfo;
    }

    /**
     * Sets the value of the sealStatusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSealStatusInfo(String value) {
        this.sealStatusInfo = value;
    }

}