/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * Records the address details for a subject. An address is the designation
 * of a place where a subject can be located or may be communicated with,
 * e.g., primary address, registered address, mailing address.
 */
public class Location  implements java.io.Serializable {
    /* An entry loop to allow the recording of a single primary or
     * physical address of the subject in multiple languages and/or writing
     * scripts. For an organization this is the principal address at which
     * the organization is located. For an individual, this is the home address. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType[] primaryAddress;

    /* An entry loop which can repeat multiple times to allow the
     * recording of address which is mainly utilized for the purpose of mail
     * delivery. This usually includes a Post Office Box number or similar
     * mailing details. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType[] mailingAddress;

    public Location() {
    }

    public Location(
           com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType[] primaryAddress,
           com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType[] mailingAddress) {
           this.primaryAddress = primaryAddress;
           this.mailingAddress = mailingAddress;
    }


    /**
     * Gets the primaryAddress value for this Location.
     * 
     * @return primaryAddress   * An entry loop to allow the recording of a single primary or
     * physical address of the subject in multiple languages and/or writing
     * scripts. For an organization this is the principal address at which
     * the organization is located. For an individual, this is the home address.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType[] getPrimaryAddress() {
        return primaryAddress;
    }


    /**
     * Sets the primaryAddress value for this Location.
     * 
     * @param primaryAddress   * An entry loop to allow the recording of a single primary or
     * physical address of the subject in multiple languages and/or writing
     * scripts. For an organization this is the principal address at which
     * the organization is located. For an individual, this is the home address.
     */
    public void setPrimaryAddress(com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType[] primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType getPrimaryAddress(int i) {
        return this.primaryAddress[i];
    }

    public void setPrimaryAddress(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.PrimaryAddressType _value) {
        this.primaryAddress[i] = _value;
    }


    /**
     * Gets the mailingAddress value for this Location.
     * 
     * @return mailingAddress   * An entry loop which can repeat multiple times to allow the
     * recording of address which is mainly utilized for the purpose of mail
     * delivery. This usually includes a Post Office Box number or similar
     * mailing details.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType[] getMailingAddress() {
        return mailingAddress;
    }


    /**
     * Sets the mailingAddress value for this Location.
     * 
     * @param mailingAddress   * An entry loop which can repeat multiple times to allow the
     * recording of address which is mainly utilized for the purpose of mail
     * delivery. This usually includes a Post Office Box number or similar
     * mailing details.
     */
    public void setMailingAddress(com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType[] mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType getMailingAddress(int i) {
        return this.mailingAddress[i];
    }

    public void setMailingAddress(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.MailAddressType _value) {
        this.mailingAddress[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primaryAddress==null && other.getPrimaryAddress()==null) || 
             (this.primaryAddress!=null &&
              java.util.Arrays.equals(this.primaryAddress, other.getPrimaryAddress()))) &&
            ((this.mailingAddress==null && other.getMailingAddress()==null) || 
             (this.mailingAddress!=null &&
              java.util.Arrays.equals(this.mailingAddress, other.getMailingAddress())));
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
        if (getPrimaryAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMailingAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMailingAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMailingAddress(), i);
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
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "PrimaryAddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MailingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "MailAddressType"));
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
