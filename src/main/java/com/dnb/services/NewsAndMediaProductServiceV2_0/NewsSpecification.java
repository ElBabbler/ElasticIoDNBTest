/**
 * NewsSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * Records the parameters for refining the news information returned
 * in the product
 */
public class NewsSpecification  implements java.io.Serializable {
    /* The date from when the published news should be returned in
     * the response. */
    private java.util.Date publishedFromDate;

    /* The date till when the published news should be returned in
     * the response */
    private java.util.Date publishedToDate;

    /* Text that denotes the broader classification of the news based
     * on the type of information. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum[] categoryText;

    public NewsSpecification() {
    }

    public NewsSpecification(
           java.util.Date publishedFromDate,
           java.util.Date publishedToDate,
           com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum[] categoryText) {
           this.publishedFromDate = publishedFromDate;
           this.publishedToDate = publishedToDate;
           this.categoryText = categoryText;
    }


    /**
     * Gets the publishedFromDate value for this NewsSpecification.
     * 
     * @return publishedFromDate   * The date from when the published news should be returned in
     * the response.
     */
    public java.util.Date getPublishedFromDate() {
        return publishedFromDate;
    }


    /**
     * Sets the publishedFromDate value for this NewsSpecification.
     * 
     * @param publishedFromDate   * The date from when the published news should be returned in
     * the response.
     */
    public void setPublishedFromDate(java.util.Date publishedFromDate) {
        this.publishedFromDate = publishedFromDate;
    }


    /**
     * Gets the publishedToDate value for this NewsSpecification.
     * 
     * @return publishedToDate   * The date till when the published news should be returned in
     * the response
     */
    public java.util.Date getPublishedToDate() {
        return publishedToDate;
    }


    /**
     * Sets the publishedToDate value for this NewsSpecification.
     * 
     * @param publishedToDate   * The date till when the published news should be returned in
     * the response
     */
    public void setPublishedToDate(java.util.Date publishedToDate) {
        this.publishedToDate = publishedToDate;
    }


    /**
     * Gets the categoryText value for this NewsSpecification.
     * 
     * @return categoryText   * Text that denotes the broader classification of the news based
     * on the type of information.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum[] getCategoryText() {
        return categoryText;
    }


    /**
     * Sets the categoryText value for this NewsSpecification.
     * 
     * @param categoryText   * Text that denotes the broader classification of the news based
     * on the type of information.
     */
    public void setCategoryText(com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum[] categoryText) {
        this.categoryText = categoryText;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum getCategoryText(int i) {
        return this.categoryText[i];
    }

    public void setCategoryText(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.NewsCategoryTextEnum _value) {
        this.categoryText[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewsSpecification)) return false;
        NewsSpecification other = (NewsSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publishedFromDate==null && other.getPublishedFromDate()==null) || 
             (this.publishedFromDate!=null &&
              this.publishedFromDate.equals(other.getPublishedFromDate()))) &&
            ((this.publishedToDate==null && other.getPublishedToDate()==null) || 
             (this.publishedToDate!=null &&
              this.publishedToDate.equals(other.getPublishedToDate()))) &&
            ((this.categoryText==null && other.getCategoryText()==null) || 
             (this.categoryText!=null &&
              java.util.Arrays.equals(this.categoryText, other.getCategoryText())));
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
        if (getPublishedFromDate() != null) {
            _hashCode += getPublishedFromDate().hashCode();
        }
        if (getPublishedToDate() != null) {
            _hashCode += getPublishedToDate().hashCode();
        }
        if (getCategoryText() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategoryText());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategoryText(), i);
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
        new org.apache.axis.description.TypeDesc(NewsSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublishedFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublishedToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsCategoryTextEnum"));
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
