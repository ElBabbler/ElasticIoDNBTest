/**
 * OrganizationName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class OrganizationName  extends com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectName  implements java.io.Serializable {
    /* An entry loop which can repeat multiple times to allow the
     * recording of a single name by which the organization is primarily
     * known / identified in different languages and/or writing scripts. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType[] organizationPrimaryName;

    /* An entry loop which can repeat multiple times to allow the
     * recording of a name which an organization trades under for commercial
     * purposes, although its registered, legal name, used for contracts
     * and other formal situations, may be another. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType[] tradeStyleName;

    public OrganizationName() {
    }

    public OrganizationName(
           com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType[] organizationPrimaryName,
           com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType[] tradeStyleName) {
        this.organizationPrimaryName = organizationPrimaryName;
        this.tradeStyleName = tradeStyleName;
    }


    /**
     * Gets the organizationPrimaryName value for this OrganizationName.
     * 
     * @return organizationPrimaryName   * An entry loop which can repeat multiple times to allow the
     * recording of a single name by which the organization is primarily
     * known / identified in different languages and/or writing scripts.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType[] getOrganizationPrimaryName() {
        return organizationPrimaryName;
    }


    /**
     * Sets the organizationPrimaryName value for this OrganizationName.
     * 
     * @param organizationPrimaryName   * An entry loop which can repeat multiple times to allow the
     * recording of a single name by which the organization is primarily
     * known / identified in different languages and/or writing scripts.
     */
    public void setOrganizationPrimaryName(com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType[] organizationPrimaryName) {
        this.organizationPrimaryName = organizationPrimaryName;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType getOrganizationPrimaryName(int i) {
        return this.organizationPrimaryName[i];
    }

    public void setOrganizationPrimaryName(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationPrimaryNameType _value) {
        this.organizationPrimaryName[i] = _value;
    }


    /**
     * Gets the tradeStyleName value for this OrganizationName.
     * 
     * @return tradeStyleName   * An entry loop which can repeat multiple times to allow the
     * recording of a name which an organization trades under for commercial
     * purposes, although its registered, legal name, used for contracts
     * and other formal situations, may be another.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType[] getTradeStyleName() {
        return tradeStyleName;
    }


    /**
     * Sets the tradeStyleName value for this OrganizationName.
     * 
     * @param tradeStyleName   * An entry loop which can repeat multiple times to allow the
     * recording of a name which an organization trades under for commercial
     * purposes, although its registered, legal name, used for contracts
     * and other formal situations, may be another.
     */
    public void setTradeStyleName(com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType[] tradeStyleName) {
        this.tradeStyleName = tradeStyleName;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType getTradeStyleName(int i) {
        return this.tradeStyleName[i];
    }

    public void setTradeStyleName(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationNameBaseType _value) {
        this.tradeStyleName[i] = _value;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationName)) return false;
        OrganizationName other = (OrganizationName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.organizationPrimaryName==null && other.getOrganizationPrimaryName()==null) || 
             (this.organizationPrimaryName!=null &&
              java.util.Arrays.equals(this.organizationPrimaryName, other.getOrganizationPrimaryName()))) &&
            ((this.tradeStyleName==null && other.getTradeStyleName()==null) || 
             (this.tradeStyleName!=null &&
              java.util.Arrays.equals(this.tradeStyleName, other.getTradeStyleName())));
        __equalsCalc = null;
        return _equals;
    }

    private transient boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOrganizationPrimaryName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizationPrimaryName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizationPrimaryName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTradeStyleName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTradeStyleName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTradeStyleName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationPrimaryName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganizationPrimaryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationPrimaryNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeStyleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TradeStyleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationNameBaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
