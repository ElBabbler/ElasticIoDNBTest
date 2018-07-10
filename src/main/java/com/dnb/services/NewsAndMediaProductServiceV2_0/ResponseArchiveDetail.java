/**
 * ResponseArchiveDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class ResponseArchiveDetail  implements java.io.Serializable {
    /* A number used to uniquely identify this product in the location
     * where it is stored. */
    private long portfolioAssetID;

    /* A number used to uniquely identify the location where this
     * product is stored. */
    private java.lang.Long portfolioAssetContainerID;

    public ResponseArchiveDetail() {
    }

    public ResponseArchiveDetail(
           long portfolioAssetID,
           java.lang.Long portfolioAssetContainerID) {
           this.portfolioAssetID = portfolioAssetID;
           this.portfolioAssetContainerID = portfolioAssetContainerID;
    }


    /**
     * Gets the portfolioAssetID value for this ResponseArchiveDetail.
     * 
     * @return portfolioAssetID   * A number used to uniquely identify this product in the location
     * where it is stored.
     */
    public long getPortfolioAssetID() {
        return portfolioAssetID;
    }


    /**
     * Sets the portfolioAssetID value for this ResponseArchiveDetail.
     * 
     * @param portfolioAssetID   * A number used to uniquely identify this product in the location
     * where it is stored.
     */
    public void setPortfolioAssetID(long portfolioAssetID) {
        this.portfolioAssetID = portfolioAssetID;
    }


    /**
     * Gets the portfolioAssetContainerID value for this ResponseArchiveDetail.
     * 
     * @return portfolioAssetContainerID   * A number used to uniquely identify the location where this
     * product is stored.
     */
    public java.lang.Long getPortfolioAssetContainerID() {
        return portfolioAssetContainerID;
    }


    /**
     * Sets the portfolioAssetContainerID value for this ResponseArchiveDetail.
     * 
     * @param portfolioAssetContainerID   * A number used to uniquely identify the location where this
     * product is stored.
     */
    public void setPortfolioAssetContainerID(java.lang.Long portfolioAssetContainerID) {
        this.portfolioAssetContainerID = portfolioAssetContainerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseArchiveDetail)) return false;
        ResponseArchiveDetail other = (ResponseArchiveDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.portfolioAssetID == other.getPortfolioAssetID() &&
            ((this.portfolioAssetContainerID==null && other.getPortfolioAssetContainerID()==null) || 
             (this.portfolioAssetContainerID!=null &&
              this.portfolioAssetContainerID.equals(other.getPortfolioAssetContainerID())));
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
        _hashCode += new Long(getPortfolioAssetID()).hashCode();
        if (getPortfolioAssetContainerID() != null) {
            _hashCode += getPortfolioAssetContainerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseArchiveDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResponseArchiveDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioAssetID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortfolioAssetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioAssetContainerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortfolioAssetContainerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
