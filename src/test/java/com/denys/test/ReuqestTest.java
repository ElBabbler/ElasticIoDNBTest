package com.denys.test;

import com.denys.utils.RequestManualSender;
import com.dnb.services.NewsAndMediaProductServiceV2_0.*;
import com.google.gson.Gson;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReuqestTest {

    public static OrderProductRequest request;

    @BeforeClass
    public static void init() {
        request = new OrderProductRequest();

        RequestTransactionDetail requestTransactionDetail = new RequestTransactionDetail();
        requestTransactionDetail.setApplicationTransactionID("3.0");
        request.setTransactionDetail(requestTransactionDetail);


        OrderProductRequestDetail orderProductRequestDetail = new OrderProductRequestDetail();

        InquiryDetail inquiryDetail = new InquiryDetail();
        inquiryDetail.setDUNSNumber("884114609");
        orderProductRequestDetail.setInquiryDetail(inquiryDetail);

        ProductSpecification productSpecification = new ProductSpecification();
        productSpecification.setDNBProductID("NEWS_MDA");
        orderProductRequestDetail.setProductSpecification(productSpecification);

        ArchiveDetail archiveDetail = new ArchiveDetail();
        archiveDetail.setArchiveProductOptOutIndicator(false);
        orderProductRequestDetail.setArchiveDetail(archiveDetail);

        InquiryReferenceDetail inquiryReferenceDetail = new InquiryReferenceDetail();
        String[] str = new String[1];
        str[0] = "sample";
        inquiryReferenceDetail.setCustomerReferenceText(str);
        inquiryReferenceDetail.setCustomerBillingEndorsementText("sample");
        orderProductRequestDetail.setInquiryReferenceDetail(inquiryReferenceDetail);

        request.setOrderProductRequestDetail(orderProductRequestDetail);
    }


    @Test
    public void RequestManualSenderTest() {
        OrderProductRequest request = new OrderProductRequest();

        RequestTransactionDetail requestTransactionDetail = new RequestTransactionDetail();
        requestTransactionDetail.setApplicationTransactionID("3.0");
        request.setTransactionDetail(requestTransactionDetail);


        OrderProductRequestDetail orderProductRequestDetail = new OrderProductRequestDetail();

        InquiryDetail inquiryDetail = new InquiryDetail();
        inquiryDetail.setDUNSNumber("884114609");
        orderProductRequestDetail.setInquiryDetail(inquiryDetail);

        ProductSpecification productSpecification= new ProductSpecification();
        productSpecification.setDNBProductID("NEWS_MDA");
        orderProductRequestDetail.setProductSpecification(productSpecification);

        ArchiveDetail archiveDetail = new ArchiveDetail();
        archiveDetail.setArchiveProductOptOutIndicator(false);
        orderProductRequestDetail.setArchiveDetail(archiveDetail);

        InquiryReferenceDetail inquiryReferenceDetail = new InquiryReferenceDetail();
        String[] str = new String[1];
        str[0] = "sample";
        inquiryReferenceDetail.setCustomerReferenceText(str);
        inquiryReferenceDetail.setCustomerBillingEndorsementText("sample");
        orderProductRequestDetail.setInquiryReferenceDetail(inquiryReferenceDetail);

        request.setOrderProductRequestDetail(orderProductRequestDetail);

        assertEquals(expected, new Gson().toJson(new RequestManualSender().sendSoapRequest(request)));
    }

    private static String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> \n" +
            "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" >\n" +
            "   <soapenv:Header/>\n" +
            "<soapenv:Body>\n" +
            "      <com:NewsAndMediaProductResponse ServiceVersionNumber=\"3.0\" xmlns:com=\"null\">\n" +
            "         <TransactionDetail>\n" +
            "            <ApplicationTransactionID>3.0</ApplicationTransactionID>\n" +
            "            <ServiceTransactionID>Id-83ed445b154a35f5d8c18462</ServiceTransactionID>\n" +
            "            <TransactionTimestamp>2018-07-10T13:31:47.486-04:00</TransactionTimestamp>\n" +
            "         </TransactionDetail>\n" +
            "         <TransactionResult>\n" +
            "            <SeverityText>Error</SeverityText>\n" +
            "            <ResultID>CM004</ResultID>\n" +
            "            <ResultText>Internal D&amp;B system error. Please try again or contact your local Customer Service Center.</ResultText>\n" +
            "         </TransactionResult>\n" +
            "</com:NewsAndMediaProductResponse>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";
}
