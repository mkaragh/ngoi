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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ItemCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemCharacteristicCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ItemCharacteristicCode" minOccurs="0"/>
 *         &lt;element name="ItemCharacteristicCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SurfaceLayerPositionCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}SurfaceLayerPositionCode" minOccurs="0"/>
 *         &lt;element name="SurfaceLayerPositionCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Identifier" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}UnitOfMeasurement" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ListOfDimension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCharacteristic", propOrder = {
    "itemCharacteristicCoded",
    "itemCharacteristicCodedOther",
    "surfaceLayerPositionCoded",
    "surfaceLayerPositionCodedOther",
    "itemCharacteristicValue",
    "identifier",
    "unitOfMeasurement",
    "listOfDimension"
})
public class ItemCharacteristic {

    @XmlElement(name = "ItemCharacteristicCoded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String itemCharacteristicCoded;
    @XmlElement(name = "ItemCharacteristicCodedOther")
    protected String itemCharacteristicCodedOther;
    @XmlElement(name = "SurfaceLayerPositionCoded")
    protected SurfaceLayerPositionCode surfaceLayerPositionCoded;
    @XmlElement(name = "SurfaceLayerPositionCodedOther")
    protected String surfaceLayerPositionCodedOther;
    @XmlElement(name = "ItemCharacteristicValue", required = true)
    protected String itemCharacteristicValue;
    @XmlElement(name = "Identifier")
    protected Identifier identifier;
    @XmlElement(name = "UnitOfMeasurement")
    protected UnitOfMeasurement unitOfMeasurement;
    @XmlElement(name = "ListOfDimension")
    protected ListOfDimension listOfDimension;

    /**
     * Gets the value of the itemCharacteristicCoded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCharacteristicCoded() {
        return itemCharacteristicCoded;
    }

    /**
     * Sets the value of the itemCharacteristicCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCharacteristicCoded(String value) {
        this.itemCharacteristicCoded = value;
    }

    /**
     * Gets the value of the itemCharacteristicCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCharacteristicCodedOther() {
        return itemCharacteristicCodedOther;
    }

    /**
     * Sets the value of the itemCharacteristicCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCharacteristicCodedOther(String value) {
        this.itemCharacteristicCodedOther = value;
    }

    /**
     * Gets the value of the surfaceLayerPositionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceLayerPositionCode }
     *     
     */
    public SurfaceLayerPositionCode getSurfaceLayerPositionCoded() {
        return surfaceLayerPositionCoded;
    }

    /**
     * Sets the value of the surfaceLayerPositionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceLayerPositionCode }
     *     
     */
    public void setSurfaceLayerPositionCoded(SurfaceLayerPositionCode value) {
        this.surfaceLayerPositionCoded = value;
    }

    /**
     * Gets the value of the surfaceLayerPositionCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceLayerPositionCodedOther() {
        return surfaceLayerPositionCodedOther;
    }

    /**
     * Sets the value of the surfaceLayerPositionCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceLayerPositionCodedOther(String value) {
        this.surfaceLayerPositionCodedOther = value;
    }

    /**
     * Gets the value of the itemCharacteristicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCharacteristicValue() {
        return itemCharacteristicValue;
    }

    /**
     * Sets the value of the itemCharacteristicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCharacteristicValue(String value) {
        this.itemCharacteristicValue = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the unitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     * Sets the value of the unitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setUnitOfMeasurement(UnitOfMeasurement value) {
        this.unitOfMeasurement = value;
    }

    /**
     * Gets the value of the listOfDimension property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfDimension }
     *     
     */
    public ListOfDimension getListOfDimension() {
        return listOfDimension;
    }

    /**
     * Sets the value of the listOfDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfDimension }
     *     
     */
    public void setListOfDimension(ListOfDimension value) {
        this.listOfDimension = value;
    }

}