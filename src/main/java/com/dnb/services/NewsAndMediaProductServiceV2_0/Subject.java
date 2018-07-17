/**
 * Subject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Subject")
@XmlAccessorType(XmlAccessType.FIELD)
public class Subject  implements java.io.Serializable {
    /* Records high level information about the subject such as the
     * primary language of the subject and the primary currency in which
     * this subject trades. When the subject is an organizantion, this may
     * also include details such as DUNS Number. */
    @XmlElement(name = "SubjectHeader")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectHeader subjectHeader;

    /* Records information about the different modes of Telecommunication
     * addresses used by a subject for external contact purposes. The modes
     * of communication include telephone, fax, e-mail, web address. */
    @XmlElement(name = "Telecommunication")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.Telecommunication telecommunication;

    /* Records the address details for a subject. An address is the
     * designation of a place where a subject can be located or may be communicated
     * with, e.g., primary address, registered address, mailing address. */
    @XmlElement(name = "Location")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.Location location;

    public Subject() {
    }

    public Subject(
           com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectHeader subjectHeader,
           com.dnb.services.NewsAndMediaProductServiceV2_0.Telecommunication telecommunication,
           com.dnb.services.NewsAndMediaProductServiceV2_0.Location location) {
           this.subjectHeader = subjectHeader;
           this.telecommunication = telecommunication;
           this.location = location;
    }


    /**
     * Gets the subjectHeader value for this Subject.
     * 
     * @return subjectHeader   * Records high level information about the subject such as the
     * primary language of the subject and the primary currency in which
     * this subject trades. When the subject is an organizantion, this may
     * also include details such as DUNS Number.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectHeader getSubjectHeader() {
        return subjectHeader;
    }


    /**
     * Sets the subjectHeader value for this Subject.
     * 
     * @param subjectHeader   * Records high level information about the subject such as the
     * primary language of the subject and the primary currency in which
     * this subject trades. When the subject is an organizantion, this may
     * also include details such as DUNS Number.
     */
    public void setSubjectHeader(com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectHeader subjectHeader) {
        this.subjectHeader = subjectHeader;
    }


    /**
     * Gets the telecommunication value for this Subject.
     * 
     * @return telecommunication   * Records information about the different modes of Telecommunication
     * addresses used by a subject for external contact purposes. The modes
     * of communication include telephone, fax, e-mail, web address.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.Telecommunication getTelecommunication() {
        return telecommunication;
    }


    /**
     * Sets the telecommunication value for this Subject.
     * 
     * @param telecommunication   * Records information about the different modes of Telecommunication
     * addresses used by a subject for external contact purposes. The modes
     * of communication include telephone, fax, e-mail, web address.
     */
    public void setTelecommunication(com.dnb.services.NewsAndMediaProductServiceV2_0.Telecommunication telecommunication) {
        this.telecommunication = telecommunication;
    }


    /**
     * Gets the location value for this Subject.
     * 
     * @return location   * Records the address details for a subject. An address is the
     * designation of a place where a subject can be located or may be communicated
     * with, e.g., primary address, registered address, mailing address.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.Location getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Subject.
     * 
     * @param location   * Records the address details for a subject. An address is the
     * designation of a place where a subject can be located or may be communicated
     * with, e.g., primary address, registered address, mailing address.
     */
    public void setLocation(com.dnb.services.NewsAndMediaProductServiceV2_0.Location location) {
        this.location = location;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subject)) return false;
        Subject other = (Subject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subjectHeader==null && other.getSubjectHeader()==null) || 
             (this.subjectHeader!=null &&
              this.subjectHeader.equals(other.getSubjectHeader()))) &&
            ((this.telecommunication==null && other.getTelecommunication()==null) || 
             (this.telecommunication!=null &&
              this.telecommunication.equals(other.getTelecommunication()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
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
        if (getSubjectHeader() != null) {
            _hashCode += getSubjectHeader().hashCode();
        }
        if (getTelecommunication() != null) {
            _hashCode += getTelecommunication().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Subject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjectHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubjectHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "SubjectHeader"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telecommunication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Telecommunication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Telecommunication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Location"));
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
