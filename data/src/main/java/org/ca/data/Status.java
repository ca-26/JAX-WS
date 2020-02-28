package org.ca.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

//@XmlType
//@XmlEnum(Integer.class)
//public enum Status {
//    @XmlEnumValue("1")
//    ACTIVE,
//    @XmlEnumValue("2")
//    STANDBY,
//    @XmlEnumValue("3")
//    EXIT;
//}

@XmlType
@XmlEnum(String.class)
public enum Status {
//    @XmlEnumValue("1")
    ACTIVE,
//    @XmlEnumValue("2")
    STANDBY,
//    @XmlEnumValue("3")
    EXIT;
}