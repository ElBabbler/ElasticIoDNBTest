/**
 * NewsCategoryTextEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class NewsCategoryTextEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NewsCategoryTextEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Awards";
    public static final java.lang.String _value2 = "Bankruptcy";
    public static final java.lang.String _value3 = "Earnings Release";
    public static final java.lang.String _value4 = "Executive Activity";
    public static final java.lang.String _value5 = "Executive Announcement";
    public static final java.lang.String _value6 = "Executive Quote";
    public static final java.lang.String _value7 = "Expansion";
    public static final java.lang.String _value8 = "Financial News";
    public static final java.lang.String _value9 = "Funding";
    public static final java.lang.String _value10 = "Management Change";
    public static final java.lang.String _value11 = "Merger and Acquisition";
    public static final java.lang.String _value12 = "New Alliance";
    public static final java.lang.String _value13 = "New Product";
    public static final java.lang.String _value14 = "Reduction";
    public static final java.lang.String _value15 = "Regulation or Litigation";
    public static final java.lang.String _value16 = "Restructure";
    public static final java.lang.String _value17 = "Wins";
    public static final NewsCategoryTextEnum value1 = new NewsCategoryTextEnum(_value1);
    public static final NewsCategoryTextEnum value2 = new NewsCategoryTextEnum(_value2);
    public static final NewsCategoryTextEnum value3 = new NewsCategoryTextEnum(_value3);
    public static final NewsCategoryTextEnum value4 = new NewsCategoryTextEnum(_value4);
    public static final NewsCategoryTextEnum value5 = new NewsCategoryTextEnum(_value5);
    public static final NewsCategoryTextEnum value6 = new NewsCategoryTextEnum(_value6);
    public static final NewsCategoryTextEnum value7 = new NewsCategoryTextEnum(_value7);
    public static final NewsCategoryTextEnum value8 = new NewsCategoryTextEnum(_value8);
    public static final NewsCategoryTextEnum value9 = new NewsCategoryTextEnum(_value9);
    public static final NewsCategoryTextEnum value10 = new NewsCategoryTextEnum(_value10);
    public static final NewsCategoryTextEnum value11 = new NewsCategoryTextEnum(_value11);
    public static final NewsCategoryTextEnum value12 = new NewsCategoryTextEnum(_value12);
    public static final NewsCategoryTextEnum value13 = new NewsCategoryTextEnum(_value13);
    public static final NewsCategoryTextEnum value14 = new NewsCategoryTextEnum(_value14);
    public static final NewsCategoryTextEnum value15 = new NewsCategoryTextEnum(_value15);
    public static final NewsCategoryTextEnum value16 = new NewsCategoryTextEnum(_value16);
    public static final NewsCategoryTextEnum value17 = new NewsCategoryTextEnum(_value17);
    public java.lang.String getValue() { return _value_;}
    public static NewsCategoryTextEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NewsCategoryTextEnum enumeration = (NewsCategoryTextEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NewsCategoryTextEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NewsCategoryTextEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsCategoryTextEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
