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
 * <p>Java class for PackageIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PackageIdentifierCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}PackageIdentifierCode"/>
 *         &lt;element name="PackageIdentifierCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageIdentifierValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageIdentifier", propOrder = {
    "packageIdentifierCoded",
    "packageIdentifierCodedOther",
    "packageIdentifierValue"
})
public class PackageIdentifier {

    @XmlElement(name = "PackageIdentifierCoded", required = true)
    protected PackageIdentifierCode packageIdentifierCoded;
    @XmlElement(name = "PackageIdentifierCodedOther")
    protected String packageIdentifierCodedOther;
    @XmlElement(name = "PackageIdentifierValue")
    protected String packageIdentifierValue;

    /**
     * Gets the value of the packageIdentifierCoded property.
     * 
     * @return
     *     possible object is
     *     {@link PackageIdentifierCode }
     *     
     */
    public PackageIdentifierCode getPackageIdentifierCoded() {
        return packageIdentifierCoded;
    }

    /**
     * Sets the value of the packageIdentifierCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageIdentifierCode }
     *     
     */
    public void setPackageIdentifierCoded(PackageIdentifierCode value) {
        this.packageIdentifierCoded = value;
    }

    /**
     * Gets the value of the packageIdentifierCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageIdentifierCodedOther() {
        return packageIdentifierCodedOther;
    }

    /**
     * Sets the value of the packageIdentifierCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageIdentifierCodedOther(String value) {
        this.packageIdentifierCodedOther = value;
    }

    /**
     * Gets the value of the packageIdentifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageIdentifierValue() {
        return packageIdentifierValue;
    }

    /**
     * Sets the value of the packageIdentifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageIdentifierValue(String value) {
        this.packageIdentifierValue = value;
    }

}