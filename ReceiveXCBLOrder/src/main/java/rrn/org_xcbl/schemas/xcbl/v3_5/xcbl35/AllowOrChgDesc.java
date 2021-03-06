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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AllowOrChgDesc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowOrChgDesc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDescription" minOccurs="0"/>
 *         &lt;element name="ServiceCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ServiceCode"/>
 *         &lt;element name="ServiceCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowOrChgDesc", propOrder = {
    "refID",
    "listOfDescription",
    "serviceCoded",
    "serviceCodedOther"
})
public class AllowOrChgDesc {

    @XmlElement(name = "RefID")
    protected String refID;
    @XmlElement(name = "ListOfDescription")
    protected ListOfDescription listOfDescription;
    @XmlElement(name = "ServiceCoded", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String serviceCoded;
    @XmlElement(name = "ServiceCodedOther")
    protected String serviceCodedOther;

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }

    /**
     * Gets the value of the listOfDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDescription }
     *     
     */
    public ListOfDescription getListOfDescription() {
        return listOfDescription;
    }

    /**
     * Sets the value of the listOfDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDescription }
     *     
     */
    public void setListOfDescription(ListOfDescription value) {
        this.listOfDescription = value;
    }

    /**
     * Gets the value of the serviceCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCoded() {
        return serviceCoded;
    }

    /**
     * Sets the value of the serviceCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCoded(String value) {
        this.serviceCoded = value;
    }

    /**
     * Gets the value of the serviceCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCodedOther() {
        return serviceCodedOther;
    }

    /**
     * Sets the value of the serviceCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCodedOther(String value) {
        this.serviceCodedOther = value;
    }

}
