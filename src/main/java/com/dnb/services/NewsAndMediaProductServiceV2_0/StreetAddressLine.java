/**
 * StreetAddressLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * An entry loop which can repeat multiple times to allow the recording
 * of several street address lines of this address. This includes address
 * line details prior to the Suburb or Town/City region address line.
 * This includes the portion of the address lines which deal with the
 * street address components, such as street name, street number, building
 * name, estate name.
 */
public class StreetAddressLine  implements java.io.Serializable {
    /* Text that records the street address components as it would
     * be presented on an address label. This includes, but is not limited
     * to, details such as street name, street number, building name, estate
     * name. */
    private java.lang.String lineText;

    public StreetAddressLine() {
    }

    public StreetAddressLine(
           java.lang.String lineText) {
           this.lineText = lineText;
    }


    /**
     * Gets the lineText value for this StreetAddressLine.
     * 
     * @return lineText   * Text that records the street address components as it would
     * be presented on an address label. This includes, but is not limited
     * to, details such as street name, street number, building name, estate
     * name.
     */
    public java.lang.String getLineText() {
        return lineText;
    }


    /**
     * Sets the lineText value for this StreetAddressLine.
     * 
     * @param lineText   * Text that records the street address components as it would
     * be presented on an address label. This includes, but is not limited
     * to, details such as street name, street number, building name, estate
     * name.
     */
    public void setLineText(java.lang.String lineText) {
        this.lineText = lineText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StreetAddressLine)) return false;
        StreetAddressLine other = (StreetAddressLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineText==null && other.getLineText()==null) || 
             (this.lineText!=null &&
              this.lineText.equals(other.getLineText())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLineText() != null) {
            _hashCode += getLineText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StreetAddressLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "StreetAddressLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
