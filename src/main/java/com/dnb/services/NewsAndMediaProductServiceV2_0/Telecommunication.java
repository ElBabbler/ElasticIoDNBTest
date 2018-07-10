/**
 * Telecommunication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * Records information about the different modes of Telecommunication
 * addresses used by a subject for external contact purposes. The modes
 * of communication include telephone, fax, e-mail, web address.
 */
public class Telecommunication  implements java.io.Serializable {
    /* An entry loop which can allow multiple Telephone contact information
     * used for voice communication with the subject. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] telephoneNumber;

    /* An entry loop which can allow multiple Facsimile contact information
     * used for data communication with the subject. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] facsimileNumber;

    /* An entry loop which can repeat multiple times to allow the
     * recording of the details of the interactive platforms via which subject
     * creates and shares user-generated content; e.g., Internet forums,
     * weblogs, social blogs, wikis, social networks. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail[] socialMediaDetail;

    public Telecommunication() {
    }

    public Telecommunication(
           com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] telephoneNumber,
           com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] facsimileNumber,
           com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail[] socialMediaDetail) {
           this.telephoneNumber = telephoneNumber;
           this.facsimileNumber = facsimileNumber;
           this.socialMediaDetail = socialMediaDetail;
    }


    /**
     * Gets the telephoneNumber value for this Telecommunication.
     * 
     * @return telephoneNumber   * An entry loop which can allow multiple Telephone contact information
     * used for voice communication with the subject.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this Telecommunication.
     * 
     * @param telephoneNumber   * An entry loop which can allow multiple Telephone contact information
     * used for voice communication with the subject.
     */
    public void setTelephoneNumber(com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType getTelephoneNumber(int i) {
        return this.telephoneNumber[i];
    }

    public void setTelephoneNumber(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType _value) {
        this.telephoneNumber[i] = _value;
    }


    /**
     * Gets the facsimileNumber value for this Telecommunication.
     * 
     * @return facsimileNumber   * An entry loop which can allow multiple Facsimile contact information
     * used for data communication with the subject.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] getFacsimileNumber() {
        return facsimileNumber;
    }


    /**
     * Sets the facsimileNumber value for this Telecommunication.
     * 
     * @param facsimileNumber   * An entry loop which can allow multiple Facsimile contact information
     * used for data communication with the subject.
     */
    public void setFacsimileNumber(com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType[] facsimileNumber) {
        this.facsimileNumber = facsimileNumber;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType getFacsimileNumber(int i) {
        return this.facsimileNumber[i];
    }

    public void setFacsimileNumber(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.TelecommunicationNumberType _value) {
        this.facsimileNumber[i] = _value;
    }


    /**
     * Gets the socialMediaDetail value for this Telecommunication.
     * 
     * @return socialMediaDetail   * An entry loop which can repeat multiple times to allow the
     * recording of the details of the interactive platforms via which subject
     * creates and shares user-generated content; e.g., Internet forums,
     * weblogs, social blogs, wikis, social networks.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail[] getSocialMediaDetail() {
        return socialMediaDetail;
    }


    /**
     * Sets the socialMediaDetail value for this Telecommunication.
     * 
     * @param socialMediaDetail   * An entry loop which can repeat multiple times to allow the
     * recording of the details of the interactive platforms via which subject
     * creates and shares user-generated content; e.g., Internet forums,
     * weblogs, social blogs, wikis, social networks.
     */
    public void setSocialMediaDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail[] socialMediaDetail) {
        this.socialMediaDetail = socialMediaDetail;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail getSocialMediaDetail(int i) {
        return this.socialMediaDetail[i];
    }

    public void setSocialMediaDetail(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.SocialMediaDetail _value) {
        this.socialMediaDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Telecommunication)) return false;
        Telecommunication other = (Telecommunication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.telephoneNumber==null && other.getTelephoneNumber()==null) || 
             (this.telephoneNumber!=null &&
              java.util.Arrays.equals(this.telephoneNumber, other.getTelephoneNumber()))) &&
            ((this.facsimileNumber==null && other.getFacsimileNumber()==null) || 
             (this.facsimileNumber!=null &&
              java.util.Arrays.equals(this.facsimileNumber, other.getFacsimileNumber()))) &&
            ((this.socialMediaDetail==null && other.getSocialMediaDetail()==null) || 
             (this.socialMediaDetail!=null &&
              java.util.Arrays.equals(this.socialMediaDetail, other.getSocialMediaDetail())));
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
        if (getTelephoneNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelephoneNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelephoneNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFacsimileNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFacsimileNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFacsimileNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSocialMediaDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSocialMediaDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSocialMediaDetail(), i);
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
        new org.apache.axis.description.TypeDesc(Telecommunication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Telecommunication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TelephoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TelecommunicationNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facsimileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FacsimileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "TelecommunicationNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socialMediaDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SocialMediaDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SocialMediaDetail"));
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
