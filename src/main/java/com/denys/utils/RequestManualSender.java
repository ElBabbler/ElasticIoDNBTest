package com.denys.utils;

import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest;
import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import java.io.*;

public class RequestManualSender implements RequestSender {

    private static final Logger logger = LoggerFactory.getLogger(RequestManualSender.class);

    @Override
    public OrderProductResponse sendSoapRequest(OrderProductRequest request) {
        String soapEndpointUrl = "https://direct.dnb.com/NewsAndMediaProduct/V3.0";
        String soapAction = "NewsAndMediaProduct";

        return this.callSoapWebService(soapEndpointUrl, soapAction, request);
    }


    private void createSoapEnvelope(SOAPMessage soapMessage, OrderProductRequest request) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "new";
        String myNamespaceURI = "http://services.dnb.com/NewsAndMediaProductServiceV2.0";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

        // SOAP Header
        if (envelope.getHeader() != null) {
            envelope.getHeader().detachNode();
        }
        SOAPHeader header = envelope.addHeader();
        SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        SOAPElement usernameToken =
                security.addChildElement("UsernameToken", "wsse");
        usernameToken.addAttribute(new QName("wsu:Id"), "UsernameToken-3");
        usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");

        SOAPElement username =
                usernameToken.addChildElement("Username", "wsse");
        username.addTextNode("P2000003D5720D6CA744D0E9EA844AA3");

        SOAPElement password =
                usernameToken.addChildElement("Password", "wsse");
        password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        password.addTextNode("do5veta0k");


        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        SOAPElement order = soapBody.addChildElement("OrderProductRequest", "new");
        SOAPElement serviceVersionNumber = order.addChildElement("ServiceVersionNumber");
        serviceVersionNumber.addTextNode("3.0");

        SOAPElement transactionDetail = order.addChildElement("TransactionDetail");
        SOAPElement applicationTransactionID = transactionDetail.addChildElement("ApplicationTransactionID");
        applicationTransactionID.addTextNode(request.getTransactionDetail().getApplicationTransactionID());

        SOAPElement orderProductRequestDetail = order.addChildElement("OrderProductRequestDetail");

        SOAPElement inquiryDetail = orderProductRequestDetail.addChildElement("InquiryDetail");
        SOAPElement dunsNumber = inquiryDetail.addChildElement("DUNSNumber");
        dunsNumber.addTextNode(request.getOrderProductRequestDetail().getInquiryDetail().getDUNSNumber());

        SOAPElement productSpecification = orderProductRequestDetail.addChildElement("ProductSpecification");
        SOAPElement dnbProductID = productSpecification.addChildElement("DNBProductID");
        dnbProductID.addTextNode(request.getOrderProductRequestDetail().getProductSpecification().getDNBProductID());

        SOAPElement archiveDetail = orderProductRequestDetail.addChildElement("ArchiveDetail");
        SOAPElement archiveProductOptOutIndicator = archiveDetail.addChildElement("ArchiveProductOptOutIndicator");
        archiveProductOptOutIndicator.addTextNode(Boolean.toString(request.getOrderProductRequestDetail().getArchiveDetail().getArchiveProductOptOutIndicator()));

        SOAPElement inquiryReferenceDetail = orderProductRequestDetail.addChildElement("InquiryReferenceDetail");
        SOAPElement customerReferenceText = inquiryReferenceDetail.addChildElement("CustomerReferenceText");
        customerReferenceText.addTextNode(request.getOrderProductRequestDetail().getInquiryReferenceDetail().getCustomerReferenceText()[0]);
        SOAPElement customerBillingEndorsementText = inquiryReferenceDetail.addChildElement("CustomerBillingEndorsementText");
        customerBillingEndorsementText.addTextNode(request.getOrderProductRequestDetail().getInquiryReferenceDetail().getCustomerBillingEndorsementText());

    }

    private OrderProductResponse callSoapWebService(String soapEndpointUrl, String soapAction, OrderProductRequest request) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction, request), soapEndpointUrl);

            ByteArrayOutputStream baos = new ByteArrayOutputStream(2048);

            soapResponse.writeTo(baos);
            soapConnection.close();

            JAXBContext jaxbContext = JAXBContext.newInstance(OrderProductResponse.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            OrderProductResponse result = (OrderProductResponse) jaxbUnmarshaller.unmarshal(
                    new StringReader(
                            new String(baos.toByteArray())
                                    .replaceAll("[\n\r]", "")
                                    .replaceAll("^.*<soapenv:Body>", "")
                                    .replaceAll("<\\/soapenv:Body>.*$", "")
                                    .replaceAll("com:", "")
                                    .replaceAll("xmlns:com=\"null\"", "")
                    )
            );

            return result;
        } catch (Exception e) {
            logger.error("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n" + e);
            return null;
        }
    }

    private SOAPMessage createSOAPRequest(String soapAction, OrderProductRequest request) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        this.createSoapEnvelope(soapMessage, request);

        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", soapAction);

        soapMessage.saveChanges();

        return soapMessage;
    }

}
