/**
 * SimpleAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SimpleAddress")
@XmlAccessorType(XmlAccessType.FIELD)
public class SimpleAddress  implements java.io.Serializable {
    /* An entry loop which can repeat multiple times to allow the
     * recording of  several lines where each address line contains one or
     * more named address elements. Examples of named address elements are
     * Street Name, Street Number, Building Name, Estate Name. They are called
     * “lines” because an addres can be divided into multiple lines. When
     * there are multiple lines the sequence of the lines must be preserved. */
    @XmlElement(name = "StreetAddressLine")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine[] streetAddressLine;

    /* The name of the town or city recognized by the Postal Authority
     * for delivering mail. */
    @XmlElement(name = "PrimaryTownName")
    private java.lang.String primaryTownName;

    /* The two-letter country code, defined in the ISO 3166-1 scheme
     * published by International Organization for Standardization (ISO),
     * identifying the country for this address. */
    @XmlElement(name = "CountryISOAlpha2Code")
    private java.lang.String countryISOAlpha2Code;

    public SimpleAddress() {
    }

    public SimpleAddress(
           com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine[] streetAddressLine,
           java.lang.String primaryTownName,
           java.lang.String countryISOAlpha2Code) {
           this.streetAddressLine = streetAddressLine;
           this.primaryTownName = primaryTownName;
           this.countryISOAlpha2Code = countryISOAlpha2Code;
    }


    /**
     * Gets the streetAddressLine value for this SimpleAddress.
     * 
     * @return streetAddressLine   * An entry loop which can repeat multiple times to allow the
     * recording of  several lines where each address line contains one or
     * more named address elements. Examples of named address elements are
     * Street Name, Street Number, Building Name, Estate Name. They are called
     * “lines” because an addres can be divided into multiple lines. When
     * there are multiple lines the sequence of the lines must be preserved.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine[] getStreetAddressLine() {
        return streetAddressLine;
    }


    /**
     * Sets the streetAddressLine value for this SimpleAddress.
     * 
     * @param streetAddressLine   * An entry loop which can repeat multiple times to allow the
     * recording of  several lines where each address line contains one or
     * more named address elements. Examples of named address elements are
     * Street Name, Street Number, Building Name, Estate Name. They are called
     * “lines” because an addres can be divided into multiple lines. When
     * there are multiple lines the sequence of the lines must be preserved.
     */
    public void setStreetAddressLine(com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine[] streetAddressLine) {
        this.streetAddressLine = streetAddressLine;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine getStreetAddressLine(int i) {
        return this.streetAddressLine[i];
    }

    public void setStreetAddressLine(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.StreetAddressLine _value) {
        this.streetAddressLine[i] = _value;
    }


    /**
     * Gets the primaryTownName value for this SimpleAddress.
     * 
     * @return primaryTownName   * The name of the town or city recognized by the Postal Authority
     * for delivering mail.
     */
    public java.lang.String getPrimaryTownName() {
        return primaryTownName;
    }


    /**
     * Sets the primaryTownName value for this SimpleAddress.
     * 
     * @param primaryTownName   * The name of the town or city recognized by the Postal Authority
     * for delivering mail.
     */
    public void setPrimaryTownName(java.lang.String primaryTownName) {
        this.primaryTownName = primaryTownName;
    }


    /**
     * Gets the countryISOAlpha2Code value for this SimpleAddress.
     * 
     * @return countryISOAlpha2Code   * The two-letter country code, defined in the ISO 3166-1 scheme
     * published by International Organization for Standardization (ISO),
     * identifying the country for this address.
     */
    public java.lang.String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }


    /**
     * Sets the countryISOAlpha2Code value for this SimpleAddress.
     * 
     * @param countryISOAlpha2Code   * The two-letter country code, defined in the ISO 3166-1 scheme
     * published by International Organization for Standardization (ISO),
     * identifying the country for this address.
     */
    public void setCountryISOAlpha2Code(java.lang.String countryISOAlpha2Code) {
        this.countryISOAlpha2Code = countryISOAlpha2Code;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleAddress)) return false;
        SimpleAddress other = (SimpleAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.streetAddressLine==null && other.getStreetAddressLine()==null) || 
             (this.streetAddressLine!=null &&
              java.util.Arrays.equals(this.streetAddressLine, other.getStreetAddressLine()))) &&
            ((this.primaryTownName==null && other.getPrimaryTownName()==null) || 
             (this.primaryTownName!=null &&
              this.primaryTownName.equals(other.getPrimaryTownName()))) &&
            ((this.countryISOAlpha2Code==null && other.getCountryISOAlpha2Code()==null) || 
             (this.countryISOAlpha2Code!=null &&
              this.countryISOAlpha2Code.equals(other.getCountryISOAlpha2Code())));
        __equalsCalc = null;
        return _equals;
    }

    private transient boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStreetAddressLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStreetAddressLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStreetAddressLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryTownName() != null) {
            _hashCode += getPrimaryTownName().hashCode();
        }
        if (getCountryISOAlpha2Code() != null) {
            _hashCode += getCountryISOAlpha2Code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimpleAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SimpleAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddressLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StreetAddressLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "StreetAddressLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryTownName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryTownName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryISOAlpha2Code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountryISOAlpha2Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
