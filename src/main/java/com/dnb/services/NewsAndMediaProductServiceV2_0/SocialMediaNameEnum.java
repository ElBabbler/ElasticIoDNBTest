/**
 * SocialMediaNameEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class SocialMediaNameEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SocialMediaNameEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Youtube = "Youtube";
    public static final java.lang.String _Facebook = "Facebook";
    public static final java.lang.String _Twitter = "Twitter";
    public static final java.lang.String _Wikipedia = "Wikipedia";
    public static final SocialMediaNameEnum Youtube = new SocialMediaNameEnum(_Youtube);
    public static final SocialMediaNameEnum Facebook = new SocialMediaNameEnum(_Facebook);
    public static final SocialMediaNameEnum Twitter = new SocialMediaNameEnum(_Twitter);
    public static final SocialMediaNameEnum Wikipedia = new SocialMediaNameEnum(_Wikipedia);
    public java.lang.String getValue() { return _value_;}
    public static SocialMediaNameEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SocialMediaNameEnum enumeration = (SocialMediaNameEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SocialMediaNameEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SocialMediaNameEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaNameEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
