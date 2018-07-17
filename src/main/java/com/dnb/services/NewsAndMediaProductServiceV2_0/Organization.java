/**
 * Organization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Organization")
@XmlAccessorType(XmlAccessType.FIELD)
public class Organization  extends com.dnb.services.NewsAndMediaProductServiceV2_0.Subject  implements java.io.Serializable {
    /* Records the different names of the organization by which it
     * is known as well as names of other organizations that have a similar
     * name to this organization. */
    @XmlElement(name = "OrganizationName")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationName organizationName;

    @XmlElement(name = "OrganizationDetail")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationDetail organizationDetail;

    /* Records the details on news publications collected for this
     * subject and the details of the online service, platform, or site that
     * focuses on facilitating the building of social networks or social
     * relations among people in which this subject is a participant. */
    @XmlElement(name = "News")
    private com.dnb.services.NewsAndMediaProductServiceV2_0.NewsDetails[] news;

    public Organization() {
    }

    public Organization(
           com.dnb.services.NewsAndMediaProductServiceV2_0.SubjectHeader subjectHeader,
           com.dnb.services.NewsAndMediaProductServiceV2_0.Telecommunication telecommunication,
           com.dnb.services.NewsAndMediaProductServiceV2_0.Location location,
           com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationName organizationName,
           com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationDetail organizationDetail,
           com.dnb.services.NewsAndMediaProductServiceV2_0.NewsDetails[] news) {
        super(
            subjectHeader,
            telecommunication,
            location);
        this.organizationName = organizationName;
        this.organizationDetail = organizationDetail;
        this.news = news;
    }


    /**
     * Gets the organizationName value for this Organization.
     * 
     * @return organizationName   * Records the different names of the organization by which it
     * is known as well as names of other organizations that have a similar
     * name to this organization.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationName getOrganizationName() {
        return organizationName;
    }


    /**
     * Sets the organizationName value for this Organization.
     * 
     * @param organizationName   * Records the different names of the organization by which it
     * is known as well as names of other organizations that have a similar
     * name to this organization.
     */
    public void setOrganizationName(com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationName organizationName) {
        this.organizationName = organizationName;
    }


    /**
     * Gets the organizationDetail value for this Organization.
     * 
     * @return organizationDetail
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationDetail getOrganizationDetail() {
        return organizationDetail;
    }


    /**
     * Sets the organizationDetail value for this Organization.
     * 
     * @param organizationDetail
     */
    public void setOrganizationDetail(com.dnb.services.NewsAndMediaProductServiceV2_0.OrganizationDetail organizationDetail) {
        this.organizationDetail = organizationDetail;
    }


    /**
     * Gets the news value for this Organization.
     * 
     * @return news   * Records the details on news publications collected for this
     * subject and the details of the online service, platform, or site that
     * focuses on facilitating the building of social networks or social
     * relations among people in which this subject is a participant.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.NewsDetails[] getNews() {
        return news;
    }


    /**
     * Sets the news value for this Organization.
     * 
     * @param news   * Records the details on news publications collected for this
     * subject and the details of the online service, platform, or site that
     * focuses on facilitating the building of social networks or social
     * relations among people in which this subject is a participant.
     */
    public void setNews(com.dnb.services.NewsAndMediaProductServiceV2_0.NewsDetails[] news) {
        this.news = news;
    }

    private transient java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Organization)) return false;
        Organization other = (Organization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.organizationName==null && other.getOrganizationName()==null) || 
             (this.organizationName!=null &&
              this.organizationName.equals(other.getOrganizationName()))) &&
            ((this.organizationDetail==null && other.getOrganizationDetail()==null) || 
             (this.organizationDetail!=null &&
              this.organizationDetail.equals(other.getOrganizationDetail()))) &&
            ((this.news==null && other.getNews()==null) || 
             (this.news!=null &&
              java.util.Arrays.equals(this.news, other.getNews())));
        __equalsCalc = null;
        return _equals;
    }

    private transient boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getOrganizationName() != null) {
            _hashCode += getOrganizationName().hashCode();
        }
        if (getOrganizationDetail() != null) {
            _hashCode += getOrganizationDetail().hashCode();
        }
        if (getNews() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNews());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNews(), i);
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
        new org.apache.axis.description.TypeDesc(Organization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "Organization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganizationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrganizationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "OrganizationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("news");
        elemField.setXmlName(new javax.xml.namespace.QName("", "News"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NewsDetails"));
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
