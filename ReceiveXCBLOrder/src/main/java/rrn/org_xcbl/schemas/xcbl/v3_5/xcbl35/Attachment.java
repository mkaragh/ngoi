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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentActionCoded" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}AttachmentActionCode" minOccurs="0"/>
 *         &lt;element name="AttachmentActionCodedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentPurpose" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}Language" minOccurs="0"/>
 *         &lt;element name="MIMEType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplacementFile" type="{rrn:org.xcbl:schemas/xcbl/v3_5/xcbl35.xsd}xcblBoolean" minOccurs="0"/>
 *         &lt;element name="AttachmentLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", propOrder = {
    "attachmentActionCoded",
    "attachmentActionCodedOther",
    "attachmentPurpose",
    "fileName",
    "attachmentTitle",
    "attachmentDescription",
    "language",
    "mimeType",
    "replacementFile",
    "attachmentLocation"
})
public class Attachment {

    @XmlElement(name = "AttachmentActionCoded")
    protected AttachmentActionCode attachmentActionCoded;
    @XmlElement(name = "AttachmentActionCodedOther")
    protected String attachmentActionCodedOther;
    @XmlElement(name = "AttachmentPurpose", required = true)
    protected String attachmentPurpose;
    @XmlElement(name = "FileName")
    protected String fileName;
    @XmlElement(name = "AttachmentTitle")
    protected String attachmentTitle;
    @XmlElement(name = "AttachmentDescription")
    protected String attachmentDescription;
    @XmlElement(name = "Language")
    protected Language language;
    @XmlElement(name = "MIMEType")
    protected String mimeType;
    @XmlElement(name = "ReplacementFile")
    protected Boolean replacementFile;
    @XmlElement(name = "AttachmentLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String attachmentLocation;

    /**
     * Gets the value of the attachmentActionCoded property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentActionCode }
     *     
     */
    public AttachmentActionCode getAttachmentActionCoded() {
        return attachmentActionCoded;
    }

    /**
     * Sets the value of the attachmentActionCoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentActionCode }
     *     
     */
    public void setAttachmentActionCoded(AttachmentActionCode value) {
        this.attachmentActionCoded = value;
    }

    /**
     * Gets the value of the attachmentActionCodedOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentActionCodedOther() {
        return attachmentActionCodedOther;
    }

    /**
     * Sets the value of the attachmentActionCodedOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentActionCodedOther(String value) {
        this.attachmentActionCodedOther = value;
    }

    /**
     * Gets the value of the attachmentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentPurpose() {
        return attachmentPurpose;
    }

    /**
     * Sets the value of the attachmentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentPurpose(String value) {
        this.attachmentPurpose = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the attachmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentTitle() {
        return attachmentTitle;
    }

    /**
     * Sets the value of the attachmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentTitle(String value) {
        this.attachmentTitle = value;
    }

    /**
     * Gets the value of the attachmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Sets the value of the attachmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentDescription(String value) {
        this.attachmentDescription = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the replacementFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplacementFile() {
        return replacementFile;
    }

    /**
     * Sets the value of the replacementFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplacementFile(Boolean value) {
        this.replacementFile = value;
    }

    /**
     * Gets the value of the attachmentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentLocation() {
        return attachmentLocation;
    }

    /**
     * Sets the value of the attachmentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentLocation(String value) {
        this.attachmentLocation = value;
    }

}
