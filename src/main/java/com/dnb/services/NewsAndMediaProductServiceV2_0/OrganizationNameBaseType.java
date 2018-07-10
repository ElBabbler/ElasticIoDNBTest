/**
 * OrganizationNameBaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class OrganizationNameBaseType  implements java.io.Serializable {
    /* Text recording a name of this organization in the specified
     * language and/or writing script. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.DNBStringType256 organizationName;

    public OrganizationNameBaseType() {
    }

    public OrganizationNameBaseType(
           com.dnb.services.NewsAndMediaProductServiceV2_0.DNBStringType256 organizationName) {
           this.organizationName = organizationName;
    }


    /**
     * Gets the organizationName value for this OrganizationNameBaseType.
     * 
     * @return organizationName   * Text recording a name of this organization in the specified
     * language and/or writing script.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBStringType256 getOrganizationName() {
        return organizationName;
    }


    /**
     * Sets the organizationName value for this OrganizationNameBaseType.
     * 
     * @param organizationName   * Text recording a name of this organization in the specified
     * language and/or writing script.
     */
    public void setOrganizationName(com.dnb.services.NewsAndMediaProductServiceV2_0.DNBStringType256 organizationName) {
        this.organizationName = organizationName;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationNameBaseType)) return false;
        OrganizationNameBaseType other = (OrganizationNameBaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.organizationName==null && other.getOrganizationName()==null) || 
             (this.organizationName!=null &&
              this.organizationName.equals(other.getOrganizationName())));
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
        if (getOrganizationName() != null) {
            _hashCode += getOrganizationName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationNameBaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationNameBaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBStringType256"));
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
