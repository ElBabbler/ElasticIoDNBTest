package com.denys.utils;

import com.dnb.services.NewsAndMediaProductServiceV2_0.*;
import com.dnb.services.TransactionFaultV2_0.TransactionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RequestWSSender implements RequestSender {

    private static final Logger logger = LoggerFactory.getLogger(RequestWSSender.class);

    @Override
    public OrderProductResponse sendSoapRequest(OrderProductRequest request) {
        try {
            NewsAndMediaProductService newsAndMediaProductService = new NewsAndMediaProductServiceLocator();
            QName portQname = new QName("http://services.dnb.com/", "NewsAndMediaProductServiceV2.0");
            NewsAndMediaProduct sq = (NewsAndMediaProduct) newsAndMediaProductService.getPort(portQname, NewsAndMediaProduct.class);

            ((javax.xml.rpc.Stub) sq)._setProperty(javax.xml.rpc.Stub.USERNAME_PROPERTY, "P2000003D5720D6CA744D0E9EA844AA3");
            ((javax.xml.rpc.Stub) sq)._setProperty(javax.xml.rpc.Stub.PASSWORD_PROPERTY, "do5veta0k");

            return sq.orderProduct(request);
        } catch (ServiceException e) {
            logger.error(e.getMessage());
            return null;
        } catch (TransactionResult transactionResult) {
            logger.error(transactionResult.getResultText());
            return null;
        } catch (RemoteException e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
