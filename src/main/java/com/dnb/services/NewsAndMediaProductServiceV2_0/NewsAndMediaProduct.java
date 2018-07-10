/**
 * NewsAndMediaProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dnb.services.NewsAndMediaProductServiceV2_0;

public interface NewsAndMediaProduct extends java.rmi.Remote {
    public com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse orderProduct(com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest parameter) throws java.rmi.RemoteException, com.dnb.services.TransactionFaultV2_0.TransactionResult;
    public com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductResponse retrieveProduct(com.dnb.services.NewsAndMediaProductServiceV2_0.RetrieveProductRequest parameter) throws java.rmi.RemoteException, com.dnb.services.TransactionFaultV2_0.TransactionResult;
}
