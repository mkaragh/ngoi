//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductIdentifierCoded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentifierCoded">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductIdentifierQualifierCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ProductIdentifierQualifierCode"/>
 *         &lt;element name="ProductIdentifierQualifierCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductIdentifierExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifierCoded", propOrder = {
    "productIdentifierQualifierCoded",
    "productIdentifierQualifierCodedOther",
    "productIdentifier",
    "productIdentifierExt"
})
public class ProductIdentifierCoded {

    @XmlElement(name = "ProductIdentifierQualifierCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String productIdentifierQualifierCoded;
    @XmlElement(name = "ProductIdentifierQualifierCodedOther")
    protected String productIdentifierQualifierCodedOther;
    @XmlElement(name = "ProductIdentifier", required = true)
    protected String productIdentifier;
    @XmlElement(name = "ProductIdentifierExt")
    protected String productIdentifierExt;

    /**
     * Gets the value of the productIdentifierQualifierCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifierQualifierCoded() {
        return productIdentifierQualifierCoded;
    }

    /**
     * Sets the value of the productIdentifierQualifierCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifierQualifierCoded(String value) {
        this.productIdentifierQualifierCoded = value;
    }

    /**
     * Gets the value of the productIdentifierQualifierCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifierQualifierCodedOther() {
        return productIdentifierQualifierCodedOther;
    }

    /**
     * Sets the value of the productIdentifierQualifierCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifierQualifierCodedOther(String value) {
        this.productIdentifierQualifierCodedOther = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifier(String value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the productIdentifierExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifierExt() {
        return productIdentifierExt;
    }

    /**
     * Sets the value of the productIdentifierExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifierExt(String value) {
        this.productIdentifierExt = value;
    }

}
