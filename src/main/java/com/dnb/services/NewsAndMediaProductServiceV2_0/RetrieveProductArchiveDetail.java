/**
 * RetrieveProductArchiveDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class RetrieveProductArchiveDetail  implements java.io.Serializable {
    /* A number used to uniquely identify the location where this
     * product is to be stored. */
    private java.lang.Long portfolioAssetContainerID;

    /* An identifier which unqiuely identifies a report in the users
     * portfolio. */
    private long portfolioAssetID;

    public RetrieveProductArchiveDetail() {
    }

    public RetrieveProductArchiveDetail(
           java.lang.Long portfolioAssetContainerID,
           long portfolioAssetID) {
           this.portfolioAssetContainerID = portfolioAssetContainerID;
           this.portfolioAssetID = portfolioAssetID;
    }


    /**
     * Gets the portfolioAssetContainerID value for this RetrieveProductArchiveDetail.
     * 
     * @return portfolioAssetContainerID   * A number used to uniquely identify the location where this
     * product is to be stored.
     */
    public java.lang.Long getPortfolioAssetContainerID() {
        return portfolioAssetContainerID;
    }


    /**
     * Sets the portfolioAssetContainerID value for this RetrieveProductArchiveDetail.
     * 
     * @param portfolioAssetContainerID   * A number used to uniquely identify the location where this
     * product is to be stored.
     */
    public void setPortfolioAssetContainerID(java.lang.Long portfolioAssetContainerID) {
        this.portfolioAssetContainerID = portfolioAssetContainerID;
    }


    /**
     * Gets the portfolioAssetID value for this RetrieveProductArchiveDetail.
     * 
     * @return portfolioAssetID   * An identifier which unqiuely identifies a report in the users
     * portfolio.
     */
    public long getPortfolioAssetID() {
        return portfolioAssetID;
    }


    /**
     * Sets the portfolioAssetID value for this RetrieveProductArchiveDetail.
     * 
     * @param portfolioAssetID   * An identifier which unqiuely identifies a report in the users
     * portfolio.
     */
    public void setPortfolioAssetID(long portfolioAssetID) {
        this.portfolioAssetID = portfolioAssetID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveProductArchiveDetail)) return false;
        RetrieveProductArchiveDetail other = (RetrieveProductArchiveDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.portfolioAssetContainerID==null && other.getPortfolioAssetContainerID()==null) || 
             (this.portfolioAssetContainerID!=null &&
              this.portfolioAssetContainerID.equals(other.getPortfolioAssetContainerID()))) &&
            this.portfolioAssetID == other.getPortfolioAssetID();
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
        if (getPortfolioAssetContainerID() != null) {
            _hashCode += getPortfolioAssetContainerID().hashCode();
        }
        _hashCode += new Long(getPortfolioAssetID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveProductArchiveDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "RetrieveProductArchiveDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioAssetContainerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortfolioAssetContainerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolioAssetID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortfolioAssetID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
