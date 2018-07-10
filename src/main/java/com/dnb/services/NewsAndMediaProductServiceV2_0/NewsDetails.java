/**
 * NewsDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;


/**
 * An entry loop which can repeat multiple times to allow the recording
 * of the news publications on this subject.
 */
public class NewsDetails  implements java.io.Serializable {
    /* The date and time when the news was published. */
    private java.util.Calendar publishedDateTimestamp;

    /* A textual description of the publication source for the news
     * item. */
    private java.lang.String sourceDescription;

    /* Text that denotes the broader classification of the news based
     * on the type of information. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] categoryText;

    /* Text that records the title of the news item. */
    private java.lang.String titleText;

    /* Text that records the body of the news item. */
    private java.lang.String contentText;

    /* Text identifying the internet URL of the published news. */
    private java.lang.String webPageURL;

    public NewsDetails() {
    }

    public NewsDetails(
           java.util.Calendar publishedDateTimestamp,
           java.lang.String sourceDescription,
           com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] categoryText,
           java.lang.String titleText,
           java.lang.String contentText,
           java.lang.String webPageURL) {
           this.publishedDateTimestamp = publishedDateTimestamp;
           this.sourceDescription = sourceDescription;
           this.categoryText = categoryText;
           this.titleText = titleText;
           this.contentText = contentText;
           this.webPageURL = webPageURL;
    }


    /**
     * Gets the publishedDateTimestamp value for this NewsDetails.
     * 
     * @return publishedDateTimestamp   * The date and time when the news was published.
     */
    public java.util.Calendar getPublishedDateTimestamp() {
        return publishedDateTimestamp;
    }


    /**
     * Sets the publishedDateTimestamp value for this NewsDetails.
     * 
     * @param publishedDateTimestamp   * The date and time when the news was published.
     */
    public void setPublishedDateTimestamp(java.util.Calendar publishedDateTimestamp) {
        this.publishedDateTimestamp = publishedDateTimestamp;
    }


    /**
     * Gets the sourceDescription value for this NewsDetails.
     * 
     * @return sourceDescription   * A textual description of the publication source for the news
     * item.
     */
    public java.lang.String getSourceDescription() {
        return sourceDescription;
    }


    /**
     * Sets the sourceDescription value for this NewsDetails.
     * 
     * @param sourceDescription   * A textual description of the publication source for the news
     * item.
     */
    public void setSourceDescription(java.lang.String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }


    /**
     * Gets the categoryText value for this NewsDetails.
     * 
     * @return categoryText   * Text that denotes the broader classification of the news based
     * on the type of information.
     */
    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] getCategoryText() {
        return categoryText;
    }


    /**
     * Sets the categoryText value for this NewsDetails.
     * 
     * @param categoryText   * Text that denotes the broader classification of the news based
     * on the type of information.
     */
    public void setCategoryText(com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType[] categoryText) {
        this.categoryText = categoryText;
    }

    public com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType getCategoryText(int i) {
        return this.categoryText[i];
    }

    public void setCategoryText(int i, com.dnb.services.NewsAndMediaProductServiceV2_0.DNBDecodedStringType _value) {
        this.categoryText[i] = _value;
    }


    /**
     * Gets the titleText value for this NewsDetails.
     * 
     * @return titleText   * Text that records the title of the news item.
     */
    public java.lang.String getTitleText() {
        return titleText;
    }


    /**
     * Sets the titleText value for this NewsDetails.
     * 
     * @param titleText   * Text that records the title of the news item.
     */
    public void setTitleText(java.lang.String titleText) {
        this.titleText = titleText;
    }


    /**
     * Gets the contentText value for this NewsDetails.
     * 
     * @return contentText   * Text that records the body of the news item.
     */
    public java.lang.String getContentText() {
        return contentText;
    }


    /**
     * Sets the contentText value for this NewsDetails.
     * 
     * @param contentText   * Text that records the body of the news item.
     */
    public void setContentText(java.lang.String contentText) {
        this.contentText = contentText;
    }


    /**
     * Gets the webPageURL value for this NewsDetails.
     * 
     * @return webPageURL   * Text identifying the internet URL of the published news.
     */
    public java.lang.String getWebPageURL() {
        return webPageURL;
    }


    /**
     * Sets the webPageURL value for this NewsDetails.
     * 
     * @param webPageURL   * Text identifying the internet URL of the published news.
     */
    public void setWebPageURL(java.lang.String webPageURL) {
        this.webPageURL = webPageURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewsDetails)) return false;
        NewsDetails other = (NewsDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publishedDateTimestamp==null && other.getPublishedDateTimestamp()==null) || 
             (this.publishedDateTimestamp!=null &&
              this.publishedDateTimestamp.equals(other.getPublishedDateTimestamp()))) &&
            ((this.sourceDescription==null && other.getSourceDescription()==null) || 
             (this.sourceDescription!=null &&
              this.sourceDescription.equals(other.getSourceDescription()))) &&
            ((this.categoryText==null && other.getCategoryText()==null) || 
             (this.categoryText!=null &&
              java.util.Arrays.equals(this.categoryText, other.getCategoryText()))) &&
            ((this.titleText==null && other.getTitleText()==null) || 
             (this.titleText!=null &&
              this.titleText.equals(other.getTitleText()))) &&
            ((this.contentText==null && other.getContentText()==null) || 
             (this.contentText!=null &&
              this.contentText.equals(other.getContentText()))) &&
            ((this.webPageURL==null && other.getWebPageURL()==null) || 
             (this.webPageURL!=null &&
              this.webPageURL.equals(other.getWebPageURL())));
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
        if (getPublishedDateTimestamp() != null) {
            _hashCode += getPublishedDateTimestamp().hashCode();
        }
        if (getSourceDescription() != null) {
            _hashCode += getSourceDescription().hashCode();
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
        if (getTitleText() != null) {
            _hashCode += getTitleText().hashCode();
        }
        if (getContentText() != null) {
            _hashCode += getContentText().hashCode();
        }
        if (getWebPageURL() != null) {
            _hashCode += getWebPageURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewsDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "NewsDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedDateTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublishedDateTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SourceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CategoryText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.dnb.com/NewsAndMediaProductServiceV2.0", "DNBDecodedStringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TitleText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContentText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WebPageURL"));
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
