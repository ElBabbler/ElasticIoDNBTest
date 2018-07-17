/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product  implements java.io.Serializable {
    /* An alphanumeric string that uniquely identifies this product. */
    @XmlElement(name = "DNBProductID")
    private java.lang.String DNBProductID;

    /* A D&B code value that defines the language in which the requested
     * product is fulfilled. */
    @XmlElement(name = "LanguageCode")
    private java.math.BigInteger languageCode;

    /* Records data about an organization, a legal or commercial entity
     * established to provide products and/or services in the marketplace
     * or to the community. */
    @XmlElement(name = "Organization")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.Organization organization;

    /* Records data about the archival details of the product requested. */
    @XmlElement(name = "ResponseArchiveDetail")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseArchiveDetail archiveDetail;

    /* Text that specifies the underlying claim to copyright ownership
     * of this product. */
    @XmlElement(name = "CopyrightNoticeText")
    private java.lang.String copyrightNoticeText;

    public Product() {
    }

    public Product(
           java.lang.String DNBProductID,
           java.math.BigInteger languageCode,
           com.dnb.services.NewsAndMediaProductServiceV2_0.Organization organization,
           com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseArchiveDetail archiveDetail,
           java.lang.String copyrightNoticeText) {
           this.DNBProductID = DNBProductID;
           this.languageCode = languageCode;
           this.organization = organization;
           this.archiveDetail = archiveDetail;
           this.copyrightNoticeText = copyrightNoticeText;
    }


    /**
     * Gets the DNBProductID value for this Product.
     * 
     * @return DNBProductID   * An alphanumeric string that uniquely identifies this product.
     */
    public java.lang.String getDNBProductID() {
        return DNBProductID;
    }


    /**
     * Sets the DNBProductID value for this Product.
     * 
     * @param DNBProductID   * An alphanumeric string that uniquely identifies this product.
     */
    public void setDNBProductID(java.lang.String DNBProductID) {
        this.DNBProductID = DNBProductID;
    }


    /**
     * Gets the languageCode value for this Product.
     * 
     * @return languageCode   * A D&B code value that defines the language in which the requested
     * product is fulfilled.
     */
    public java.math.BigInteger getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this Product.
     * 
     * @param languageCode   * A D&B code value that defines the language in which the requested
     * product is fulfilled.
     */
    public void setLanguageCode(java.math.BigInteger languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the organization value for this Product.
     * 
     * @return organization   * Records data about an organization, a legal or commercial entity
     * established to provide products and/or services in the marketplace
     * or to the community.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.Organization getOrganization() {
        return organization;
    }


    /**
     * Sets the organization value for this Product.
     * 
     * @param organization   * Records data about an organization, a legal or commercial entity
     * established to provide products and/or services in the marketplace
     * or to the community.
     */
    public void setOrganization(com.dnb.services.NewsAndMediaProductServiceV2_0.Organization organization) {
        this.organization = organization;
    }


    /**
     * Gets the archiveDetail value for this Product.
     * 
     * @return archiveDetail   * Records data about the archival details of the product requested.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }


    /**
     * Sets the archiveDetail value for this Product.
     * 
     * @param archiveDetail   * Records data about the archival details of the product requested.
     */
    public void setArchiveDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.ResponseArchiveDetail archiveDetail) {
        this.archiveDetail = archiveDetail;
    }


    /**
     * Gets the copyrightNoticeText value for this Product.
     * 
     * @return copyrightNoticeText   * Text that specifies the underlying claim to copyright ownership
     * of this product.
     */
    public java.lang.String getCopyrightNoticeText() {
        return copyrightNoticeText;
    }


    /**
     * Sets the copyrightNoticeText value for this Product.
     * 
     * @param copyrightNoticeText   * Text that specifies the underlying claim to copyright ownership
     * of this product.
     */
    public void setCopyrightNoticeText(java.lang.String copyrightNoticeText) {
        this.copyrightNoticeText = copyrightNoticeText;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DNBProductID==null && other.getDNBProductID()==null) || 
             (this.DNBProductID!=null &&
              this.DNBProductID.equals(other.getDNBProductID()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.organization==null && other.getOrganization()==null) || 
             (this.organization!=null &&
              this.organization.equals(other.getOrganization()))) &&
            ((this.archiveDetail==null && other.getArchiveDetail()==null) || 
             (this.archiveDetail!=null &&
              this.archiveDetail.equals(other.getArchiveDetail()))) &&
            ((this.copyrightNoticeText==null && other.getCopyrightNoticeText()==null) || 
             (this.copyrightNoticeText!=null &&
              this.copyrightNoticeText.equals(other.getCopyrightNoticeText())));
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
        if (getDNBProductID() != null) {
            _hashCode += getDNBProductID().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getOrganization() != null) {
            _hashCode += getOrganization().hashCode();
        }
        if (getArchiveDetail() != null) {
            _hashCode += getArchiveDetail().hashCode();
        }
        if (getCopyrightNoticeText() != null) {
            _hashCode += getCopyrightNoticeText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Product.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Product"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNBProductID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DNBProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Organization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Organization"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "ResponseArchiveDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightNoticeText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CopyrightNoticeText"));
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
