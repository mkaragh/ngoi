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
 * <p>Java class for ShipToSubInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipToSubInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipToSubLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Location"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipToSubQuantity">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SubLocationItemPackagingReference" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ItemPackagingReference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipToSubInformation", propOrder = {
    "shipToSubLocation",
    "shipToSubQuantity",
    "subLocationItemPackagingReference"
})
public class ShipToSubInformation {

    @XmlElement(name = "ShipToSubLocation", required = true)
    protected ShipToSubInformation.ShipToSubLocation shipToSubLocation;
    @XmlElement(name = "ShipToSubQuantity", required = true)
    protected ShipToSubInformation.ShipToSubQuantity shipToSubQuantity;
    @XmlElement(name = "SubLocationItemPackagingReference")
    protected ShipToSubInformation.SubLocationItemPackagingReference subLocationItemPackagingReference;

    /**
     * Gets the value of the shipToSubLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToSubInformation.ShipToSubLocation }
     *     
     */
    public ShipToSubInformation.ShipToSubLocation getShipToSubLocation() {
        return shipToSubLocation;
    }

    /**
     * Sets the value of the shipToSubLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToSubInformation.ShipToSubLocation }
     *     
     */
    public void setShipToSubLocation(ShipToSubInformation.ShipToSubLocation value) {
        this.shipToSubLocation = value;
    }

    /**
     * Gets the value of the shipToSubQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToSubInformation.ShipToSubQuantity }
     *     
     */
    public ShipToSubInformation.ShipToSubQuantity getShipToSubQuantity() {
        return shipToSubQuantity;
    }

    /**
     * Sets the value of the shipToSubQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToSubInformation.ShipToSubQuantity }
     *     
     */
    public void setShipToSubQuantity(ShipToSubInformation.ShipToSubQuantity value) {
        this.shipToSubQuantity = value;
    }

    /**
     * Gets the value of the subLocationItemPackagingReference property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToSubInformation.SubLocationItemPackagingReference }
     *     
     */
    public ShipToSubInformation.SubLocationItemPackagingReference getSubLocationItemPackagingReference() {
        return subLocationItemPackagingReference;
    }

    /**
     * Sets the value of the subLocationItemPackagingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToSubInformation.SubLocationItemPackagingReference }
     *     
     */
    public void setSubLocationItemPackagingReference(ShipToSubInformation.SubLocationItemPackagingReference value) {
        this.subLocationItemPackagingReference = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Location"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location"
    })
    public static class ShipToSubLocation {

        @XmlElement(name = "Location", required = true)
        protected Location location;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link Location }
         *     
         */
        public Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link Location }
         *     
         */
        public void setLocation(Location value) {
            this.location = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Quantity"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "quantity"
    })
    public static class ShipToSubQuantity {

        @XmlElement(name = "Quantity", required = true)
        protected Quantity quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Quantity }
         *     
         */
        public Quantity getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Quantity }
         *     
         */
        public void setQuantity(Quantity value) {
            this.quantity = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}ItemPackagingReference"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemPackagingReference"
    })
    public static class SubLocationItemPackagingReference {

        @XmlElement(name = "ItemPackagingReference", required = true)
        protected ItemPackagingReference itemPackagingReference;

        /**
         * Gets the value of the itemPackagingReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemPackagingReference }
         *     
         */
        public ItemPackagingReference getItemPackagingReference() {
            return itemPackagingReference;
        }

        /**
         * Sets the value of the itemPackagingReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemPackagingReference }
         *     
         */
        public void setItemPackagingReference(ItemPackagingReference value) {
            this.itemPackagingReference = value;
        }

    }

}
