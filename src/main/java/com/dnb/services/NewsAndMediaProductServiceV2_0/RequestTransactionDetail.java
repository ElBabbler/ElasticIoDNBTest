/**
 * RequestTransactionDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class RequestTransactionDetail  implements java.io.Serializable {
    /* A number assigned by the calling application to uniquely identify
     * this request. */
    private java.lang.String applicationTransactionID;

    /* The date and time when this request was created. When the request
     * is from an intermediary, such as a workflow manager or service bus,
     * this is the date and time when the message was sent to the D&B function,
     * i.e., the date and time when the xml document was created by the requesting
     * intermediary. */
    private java.util.Calendar transactionTimestamp;

    /* A number that identifies the system or the software application
     * from where this request originated. / A number used to uniquely identfy
     * the D&amp;B business segment or delivery channel from where this request
     * originated. */
    private java.lang.String submittingOfficeID;

    public RequestTransactionDetail() {
    }

    public RequestTransactionDetail(
           java.lang.String applicationTransactionID,
           java.util.Calendar transactionTimestamp,
           java.lang.String submittingOfficeID) {
           this.applicationTransactionID = applicationTransactionID;
           this.transactionTimestamp = transactionTimestamp;
           this.submittingOfficeID = submittingOfficeID;
    }


    /**
     * Gets the applicationTransactionID value for this RequestTransactionDetail.
     * 
     * @return applicationTransactionID   * A number assigned by the calling application to uniquely identify
     * this request.
     */
    public java.lang.String getApplicationTransactionID() {
        return applicationTransactionID;
    }


    /**
     * Sets the applicationTransactionID value for this RequestTransactionDetail.
     * 
     * @param applicationTransactionID   * A number assigned by the calling application to uniquely identify
     * this request.
     */
    public void setApplicationTransactionID(java.lang.String applicationTransactionID) {
        this.applicationTransactionID = applicationTransactionID;
    }


    /**
     * Gets the transactionTimestamp value for this RequestTransactionDetail.
     * 
     * @return transactionTimestamp   * The date and time when this request was created. When the request
     * is from an intermediary, such as a workflow manager or service bus,
     * this is the date and time when the message was sent to the D&B function,
     * i.e., the date and time when the xml document was created by the requesting
     * intermediary.
     */
    public java.util.Calendar getTransactionTimestamp() {
        return transactionTimestamp;
    }


    /**
     * Sets the transactionTimestamp value for this RequestTransactionDetail.
     * 
     * @param transactionTimestamp   * The date and time when this request was created. When the request
     * is from an intermediary, such as a workflow manager or service bus,
     * this is the date and time when the message was sent to the D&B function,
     * i.e., the date and time when the xml document was created by the requesting
     * intermediary.
     */
    public void setTransactionTimestamp(java.util.Calendar transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }


    /**
     * Gets the submittingOfficeID value for this RequestTransactionDetail.
     * 
     * @return submittingOfficeID   * A number that identifies the system or the software application
     * from where this request originated. / A number used to uniquely identfy
     * the D&amp;B business segment or delivery channel from where this request
     * originated.
     */
    public java.lang.String getSubmittingOfficeID() {
        return submittingOfficeID;
    }


    /**
     * Sets the submittingOfficeID value for this RequestTransactionDetail.
     * 
     * @param submittingOfficeID   * A number that identifies the system or the software application
     * from where this request originated. / A number used to uniquely identfy
     * the D&amp;B business segment or delivery channel from where this request
     * originated.
     */
    public void setSubmittingOfficeID(java.lang.String submittingOfficeID) {
        this.submittingOfficeID = submittingOfficeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTransactionDetail)) return false;
        RequestTransactionDetail other = (RequestTransactionDetail) obj;
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
            ((this.transactionTimestamp==null && other.getTransactionTimestamp()==null) || 
             (this.transactionTimestamp!=null &&
              this.transactionTimestamp.equals(other.getTransactionTimestamp()))) &&
            ((this.submittingOfficeID==null && other.getSubmittingOfficeID()==null) || 
             (this.submittingOfficeID!=null &&
              this.submittingOfficeID.equals(other.getSubmittingOfficeID())));
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
        if (getApplicationTransactionID() != null) {
            _hashCode += getApplicationTransactionID().hashCode();
        }
        if (getTransactionTimestamp() != null) {
            _hashCode += getTransactionTimestamp().hashCode();
        }
        if (getSubmittingOfficeID() != null) {
            _hashCode += getSubmittingOfficeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTransactionDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RequestTransactionDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApplicationTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submittingOfficeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubmittingOfficeID"));
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
