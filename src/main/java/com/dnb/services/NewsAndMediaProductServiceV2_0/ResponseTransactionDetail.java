/**
 * ResponseTransactionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseTransactionDetail  implements java.io.Serializable {
    /* A number assigned by the calling application to uniquely identify
     * this request. */
    @XmlElement(name="ApplicationTransactionID")
    private java.lang.String applicationTransactionID;

    /* A number assigned by the D&B service to uniquely identify this
     * transaction. */
    @XmlElement(name="ServiceTransactionID")
    private java.lang.String serviceTransactionID;

    /* The date and time when this request was submitted or the date
     * and time when the requesting intermediary, such as a workflow manager
     * or service bus, sent the message to the D&B function, i.e., the date
     * and time when the xml document was created by the requesting intermediary. */
    @XmlElement(name="TransactionTimestamp")
    private java.util.Calendar transactionTimestamp;

    public ResponseTransactionDetail() {
    }

    public ResponseTransactionDetail(
           java.lang.String applicationTransactionID,
           java.lang.String serviceTransactionID,
           java.util.Calendar transactionTimestamp) {
           this.applicationTransactionID = applicationTransactionID;
           this.serviceTransactionID = serviceTransactionID;
           this.transactionTimestamp = transactionTimestamp;
    }


    /**
     * Gets the applicationTransactionID value for this ResponseTransactionDetail.
     * 
     * @return applicationTransactionID   * A number assigned by the calling application to uniquely identify
     * this request.
     */
    public java.lang.String getApplicationTransactionID() {
        return applicationTransactionID;
    }


    /**
     * Sets the applicationTransactionID value for this ResponseTransactionDetail.
     * 
     * @param applicationTransactionID   * A number assigned by the calling application to uniquely identify
     * this request.
     */
    public void setApplicationTransactionID(java.lang.String applicationTransactionID) {
        this.applicationTransactionID = applicationTransactionID;
    }


    /**
     * Gets the serviceTransactionID value for this ResponseTransactionDetail.
     * 
     * @return serviceTransactionID   * A number assigned by the D&B service to uniquely identify this
     * transaction.
     */
    public java.lang.String getServiceTransactionID() {
        return serviceTransactionID;
    }


    /**
     * Sets the serviceTransactionID value for this ResponseTransactionDetail.
     * 
     * @param serviceTransactionID   * A number assigned by the D&B service to uniquely identify this
     * transaction.
     */
    public void setServiceTransactionID(java.lang.String serviceTransactionID) {
        this.serviceTransactionID = serviceTransactionID;
    }


    /**
     * Gets the transactionTimestamp value for this ResponseTransactionDetail.
     * 
     * @return transactionTimestamp   * The date and time when this request was submitted or the date
     * and time when the requesting intermediary, such as a workflow manager
     * or service bus, sent the message to the D&B function, i.e., the date
     * and time when the xml document was created by the requesting intermediary.
     */
    public java.util.Calendar getTransactionTimestamp() {
        return transactionTimestamp;
    }


    /**
     * Sets the transactionTimestamp value for this ResponseTransactionDetail.
     * 
     * @param transactionTimestamp   * The date and time when this request was submitted or the date
     * and time when the requesting intermediary, such as a workflow manager
     * or service bus, sent the message to the D&B function, i.e., the date
     * and time when the xml document was created by the requesting intermediary.
     */
    public void setTransactionTimestamp(java.util.Calendar transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseTransactionDetail)) return false;
        ResponseTransactionDetail other = (ResponseTransactionDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationTransactionID==null && other.getApplicationTransactionID()==null) || 
             (this.applicationTransactionID!=null &&
              this.applicationTransactionID.equals(other.getApplicationTransactionID()))) &&
            ((this.serviceTransactionID==null && other.getServiceTransactionID()==null) || 
             (this.serviceTransactionID!=null &&
              this.serviceTransactionID.equals(other.getServiceTransactionID()))) &&
            ((this.transactionTimestamp==null && other.getTransactionTimestamp()==null) || 
             (this.transactionTimestamp!=null &&
              this.transactionTimestamp.equals(other.getTransactionTimestamp())));
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
        if (getApplicationTransactionID() != null) {
            _hashCode += getApplicationTransactionID().hashCode();
        }
        if (getServiceTransactionID() != null) {
            _hashCode += getServiceTransactionID().hashCode();
        }
        if (getTransactionTimestamp() != null) {
            _hashCode += getTransactionTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseTransactionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResponseTransactionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
