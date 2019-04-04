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
 * <p>Java class for TaxReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxReference">
 *   &lt;complexContent>
 *     &lt;extension base="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Tax">
 *       &lt;sequence>
 *         &lt;element name="TaxTreatmentCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}TaxTreatmentCode"/>
 *         &lt;element name="TaxTreatmentCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxReference", propOrder = {
    "taxTreatmentCoded",
    "taxTreatmentCodedOther"
})
public class TaxReference
    extends Tax
{

    @XmlElement(name = "TaxTreatmentCoded", required = true)
    protected TaxTreatmentCode taxTreatmentCoded;
    @XmlElement(name = "TaxTreatmentCodedOther")
    protected String taxTreatmentCodedOther;

    /**
     * Gets the value of the taxTreatmentCoded property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTreatmentCode }
     *     
     */
    public TaxTreatmentCode getTaxTreatmentCoded() {
        return taxTreatmentCoded;
    }

    /**
     * Sets the value of the taxTreatmentCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTreatmentCode }
     *     
     */
    public void setTaxTreatmentCoded(TaxTreatmentCode value) {
        this.taxTreatmentCoded = value;
    }

    /**
     * Gets the value of the taxTreatmentCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTreatmentCodedOther() {
        return taxTreatmentCodedOther;
    }

    /**
     * Sets the value of the taxTreatmentCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTreatmentCodedOther(String value) {
        this.taxTreatmentCodedOther = value;
    }

}
