/**
 * TelecommunicationNumberSimpleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class TelecommunicationNumberSimpleType  implements java.io.Serializable {
    /* A sequence of digits used by the subject for voice communication
     * in a public switched telephone network.
     * This sequence of digits includes the area code or city code.
     * Note: This number does not include the International Dialing Code
     * and Domestic Dialing Code. */
    private java.lang.String telecommunicationNumber;

    /* The country calling code assigned by the International Telecommunication
     * Union (ITU) required to connect to this Telecommunication Number of
     * the subject country when dialing from outside the subject country;
     * e.g., '1' for the US, '44' for the UK, '91' for India. */
    private java.lang.String internationalDialingCode;

    public TelecommunicationNumberSimpleType() {
    }

    public TelecommunicationNumberSimpleType(
           java.lang.String telecommunicationNumber,
           java.lang.String internationalDialingCode) {
           this.telecommunicationNumber = telecommunicationNumber;
           this.internationalDialingCode = internationalDialingCode;
    }


    /**
     * Gets the telecommunicationNumber value for this TelecommunicationNumberSimpleType.
     * 
     * @return telecommunicationNumber   * A sequence of digits used by the subject for voice communication
     * in a public switched telephone network.
     * This sequence of digits includes the area code or city code.
     * Note: This number does not include the International Dialing Code
     * and Domestic Dialing Code.
     */
    public java.lang.String getTelecommunicationNumber() {
        return telecommunicationNumber;
    }


    /**
     * Sets the telecommunicationNumber value for this TelecommunicationNumberSimpleType.
     * 
     * @param telecommunicationNumber   * A sequence of digits used by the subject for voice communication
     * in a public switched telephone network.
     * This sequence of digits includes the area code or city code.
     * Note: This number does not include the International Dialing Code
     * and Domestic Dialing Code.
     */
    public void setTelecommunicationNumber(java.lang.String telecommunicationNumber) {
        this.telecommunicationNumber = telecommunicationNumber;
    }


    /**
     * Gets the internationalDialingCode value for this TelecommunicationNumberSimpleType.
     * 
     * @return internationalDialingCode   * The country calling code assigned by the International Telecommunication
     * Union (ITU) required to connect to this Telecommunication Number of
     * the subject country when dialing from outside the subject country;
     * e.g., '1' for the US, '44' for the UK, '91' for India.
     */
    public java.lang.String getInternationalDialingCode() {
        return internationalDialingCode;
    }


    /**
     * Sets the internationalDialingCode value for this TelecommunicationNumberSimpleType.
     * 
     * @param internationalDialingCode   * The country calling code assigned by the International Telecommunication
     * Union (ITU) required to connect to this Telecommunication Number of
     * the subject country when dialing from outside the subject country;
     * e.g., '1' for the US, '44' for the UK, '91' for India.
     */
    public void setInternationalDialingCode(java.lang.String internationalDialingCode) {
        this.internationalDialingCode = internationalDialingCode;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelecommunicationNumberSimpleType)) return false;
        TelecommunicationNumberSimpleType other = (TelecommunicationNumberSimpleType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.telecommunicationNumber==null && other.getTelecommunicationNumber()==null) || 
             (this.telecommunicationNumber!=null &&
              this.telecommunicationNumber.equals(other.getTelecommunicationNumber()))) &&
            ((this.internationalDialingCode==null && other.getInternationalDialingCode()==null) || 
             (this.internationalDialingCode!=null &&
              this.internationalDialingCode.equals(other.getInternationalDialingCode())));
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
        if (getTelecommunicationNumber() != null) {
            _hashCode += getTelecommunicationNumber().hashCode();
        }
        if (getInternationalDialingCode() != null) {
            _hashCode += getInternationalDialingCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelecommunicationNumberSimpleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TelecommunicationNumberSimpleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telecommunicationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TelecommunicationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalDialingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InternationalDialingCode"));
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
