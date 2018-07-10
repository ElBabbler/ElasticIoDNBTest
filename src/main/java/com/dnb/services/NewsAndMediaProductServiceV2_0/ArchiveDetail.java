/**
 * ArchiveDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public class ArchiveDetail  implements java.io.Serializable {
    /* When turned ON (set to TRUE), it indicates that the product
     * being ordered is not to be stored. 
     * When turned OFF (set to FALSE), it indicates that the product being
     * ordered is to be stored; however as this is the assumed condition
     * there is no requirement to create this tag to represent this fact. */
    private java.lang.Boolean archiveProductOptOutIndicator;

    /* When turned ON (set to true), the duration to archive the data
     * is to be extended. Note: There is an additional cost for extending
     * the archival period of the data purchased. 
     * When turned OFF (set to false), the duration to archive the data is
     * not to be extended. */
    private java.lang.Boolean extendArchivePeriodIndicator;

    /* A number used to uniquely identify the location where this
     * product is to be stored. */
    private java.lang.Long portfolioAssetContainerID;

    public ArchiveDetail() {
    }

    public ArchiveDetail(
           java.lang.Boolean archiveProductOptOutIndicator,
           java.lang.Boolean extendArchivePeriodIndicator,
           java.lang.Long portfolioAssetContainerID) {
           this.archiveProductOptOutIndicator = archiveProductOptOutIndicator;
           this.extendArchivePeriodIndicator = extendArchivePeriodIndicator;
           this.portfolioAssetContainerID = portfolioAssetContainerID;
    }


    /**
     * Gets the archiveProductOptOutIndicator value for this ArchiveDetail.
     * 
     * @return archiveProductOptOutIndicator   * When turned ON (set to TRUE), it indicates that the product
     * being ordered is not to be stored. 
     * When turned OFF (set to FALSE), it indicates that the product being
     * ordered is to be stored; however as this is the assumed condition
     * there is no requirement to create this tag to represent this fact.
     */
    public java.lang.Boolean getArchiveProductOptOutIndicator() {
        return archiveProductOptOutIndicator;
    }


    /**
     * Sets the archiveProductOptOutIndicator value for this ArchiveDetail.
     * 
     * @param archiveProductOptOutIndicator   * When turned ON (set to TRUE), it indicates that the product
     * being ordered is not to be stored. 
     * When turned OFF (set to FALSE), it indicates that the product being
     * ordered is to be stored; however as this is the assumed condition
     * there is no requirement to create this tag to represent this fact.
     */
    public void setArchiveProductOptOutIndicator(java.lang.Boolean archiveProductOptOutIndicator) {
        this.archiveProductOptOutIndicator = archiveProductOptOutIndicator;
    }


    /**
     * Gets the extendArchivePeriodIndicator value for this ArchiveDetail.
     * 
     * @return extendArchivePeriodIndicator   * When turned ON (set to true), the duration to archive the data
     * is to be extended. Note: There is an additional cost for extending
     * the archival period of the data purchased. 
     * When turned OFF (set to false), the duration to archive the data is
     * not to be extended.
     */
    public java.lang.Boolean getExtendArchivePeriodIndicator() {
        return extendArchivePeriodIndicator;
    }


    /**
     * Sets the extendArchivePeriodIndicator value for this ArchiveDetail.
     * 
     * @param extendArchivePeriodIndicator   * When turned ON (set to true), the duration to archive the data
     * is to be extended. Note: There is an additional cost for extending
     * the archival period of the data purchased. 
     * When turned OFF (set to false), the duration to archive the data is
     * not to be extended.
     */
    public void setExtendArchivePeriodIndicator(java.lang.Boolean extendArchivePeriodIndicator) {
        this.extendArchivePeriodIndicator = extendArchivePeriodIndicator;
    }


    /**
     * Gets the portfolioAssetContainerID value for this ArchiveDetail.
     * 
     * @return portfolioAssetContainerID   * A number used to uniquely identify the location where this
     * product is to be stored.
     */
    public java.lang.Long getPortfolioAssetContainerID() {
        return portfolioAssetContainerID;
    }


    /**
     * Sets the portfolioAssetContainerID value for this ArchiveDetail.
     * 
     * @param portfolioAssetContainerID   * A number used to uniquely identify the location where this
     * product is to be stored.
     */
    public void setPortfolioAssetContainerID(java.lang.Long portfolioAssetContainerID) {
        this.portfolioAssetContainerID = portfolioAssetContainerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchiveDetail)) return false;
        ArchiveDetail other = (ArchiveDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.archiveProductOptOutIndicator==null && other.getArchiveProductOptOutIndicator()==null) || 
             (this.archiveProductOptOutIndicator!=null &&
              this.archiveProductOptOutIndicator.equals(other.getArchiveProductOptOutIndicator()))) &&
            ((this.extendArchivePeriodIndicator==null && other.getExtendArchivePeriodIndicator()==null) || 
             (this.extendArchivePeriodIndicator!=null &&
              this.extendArchivePeriodIndicator.equals(other.getExtendArchivePeriodIndicator()))) &&
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
        if (getArchiveProductOptOutIndicator() != null) {
            _hashCode += getArchiveProductOptOutIndicator().hashCode();
        }
        if (getExtendArchivePeriodIndicator() != null) {
            _hashCode += getExtendArchivePeriodIndicator().hashCode();
        }
        if (getPortfolioAssetContainerID() != null) {
            _hashCode += getPortfolioAssetContainerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchiveDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ArchiveDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveProductOptOutIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveProductOptOutIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendArchivePeriodIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtendArchivePeriodIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
