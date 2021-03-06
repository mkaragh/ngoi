//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:06:19 AM IST 
//


package rrn.org_xcbl.schemas.xcbl.v3_5.xcbl35;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactNumberTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactNumberTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="TelephoneNumber"/>
 *     &lt;enumeration value="FaxNumber"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="MobileNumber"/>
 *     &lt;enumeration value="TelexNumber"/>
 *     &lt;enumeration value="PagerNumber"/>
 *     &lt;enumeration value="HomePage"/>
 *     &lt;enumeration value="WWW"/>
 *     &lt;enumeration value="FTP"/>
 *     &lt;enumeration value="URLOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactNumberTypeCode")
@XmlEnum
public enum ContactNumberTypeCode {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("TelephoneNumber")
    TELEPHONE_NUMBER("TelephoneNumber"),
    @XmlEnumValue("FaxNumber")
    FAX_NUMBER("FaxNumber"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("MobileNumber")
    MOBILE_NUMBER("MobileNumber"),
    @XmlEnumValue("TelexNumber")
    TELEX_NUMBER("TelexNumber"),
    @XmlEnumValue("PagerNumber")
    PAGER_NUMBER("PagerNumber"),
    @XmlEnumValue("HomePage")
    HOME_PAGE("HomePage"),
    WWW("WWW"),
    FTP("FTP"),
    @XmlEnumValue("URLOther")
    URL_OTHER("URLOther");
    private final String value;

    ContactNumberTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactNumberTypeCode fromValue(String v) {
        for (ContactNumberTypeCode c: ContactNumberTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
