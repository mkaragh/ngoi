//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 02:19:29 PM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentActionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AttachmentActionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="NoChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttachmentActionCode")
@XmlEnum
public enum AttachmentActionCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("NoChange")
    NO_CHANGE("NoChange");
    private final String value;

    AttachmentActionCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentActionCode fromValue(String v) {
        for (AttachmentActionCode c: AttachmentActionCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
