/**
 * OrganizationDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class OrganizationDetail  implements java.io.Serializable {
    private com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole[] familyTreeMemberRole;

    private java.lang.Boolean standaloneOrganizationIndicator;

    public OrganizationDetail() {
    }

    public OrganizationDetail(
           com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole[] familyTreeMemberRole,
           java.lang.Boolean standaloneOrganizationIndicator) {
           this.familyTreeMemberRole = familyTreeMemberRole;
           this.standaloneOrganizationIndicator = standaloneOrganizationIndicator;
    }


    /**
     * Gets the familyTreeMemberRole value for this OrganizationDetail.
     * 
     * @return familyTreeMemberRole
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole[] getFamilyTreeMemberRole() {
        return familyTreeMemberRole;
    }


    /**
     * Sets the familyTreeMemberRole value for this OrganizationDetail.
     * 
     * @param familyTreeMemberRole
     */
    public void setFamilyTreeMemberRole(com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole[] familyTreeMemberRole) {
        this.familyTreeMemberRole = familyTreeMemberRole;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole getFamilyTreeMemberRole(int i) {
        return this.familyTreeMemberRole[i];
    }

    public void setFamilyTreeMemberRole(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.FamilyTreeMemberRole _value) {
        this.familyTreeMemberRole[i] = _value;
    }


    /**
     * Gets the standaloneOrganizationIndicator value for this OrganizationDetail.
     * 
     * @return standaloneOrganizationIndicator
     */
    public java.lang.Boolean getStandaloneOrganizationIndicator() {
        return standaloneOrganizationIndicator;
    }


    /**
     * Sets the standaloneOrganizationIndicator value for this OrganizationDetail.
     * 
     * @param standaloneOrganizationIndicator
     */
    public void setStandaloneOrganizationIndicator(java.lang.Boolean standaloneOrganizationIndicator) {
        this.standaloneOrganizationIndicator = standaloneOrganizationIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrganizationDetail)) return false;
        OrganizationDetail other = (OrganizationDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.familyTreeMemberRole==null && other.getFamilyTreeMemberRole()==null) || 
             (this.familyTreeMemberRole!=null &&
              java.util.Arrays.equals(this.familyTreeMemberRole, other.getFamilyTreeMemberRole()))) &&
            ((this.standaloneOrganizationIndicator==null && other.getStandaloneOrganizationIndicator()==null) || 
             (this.standaloneOrganizationIndicator!=null &&
              this.standaloneOrganizationIndicator.equals(other.getStandaloneOrganizationIndicator())));
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
        if (getFamilyTreeMemberRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamilyTreeMemberRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamilyTreeMemberRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStandaloneOrganizationIndicator() != null) {
            _hashCode += getStandaloneOrganizationIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyTreeMemberRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FamilyTreeMemberRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "FamilyTreeMemberRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standaloneOrganizationIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StandaloneOrganizationIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
