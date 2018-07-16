package com.denys.test;

import com.denys.utils.RequestManualSender;
import com.dnb.services.NewsAndMediaProductServiceV2_0.*;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReuqestTest {

    private static OrderProductRequest request;
    private static OrderProductResponse expected;

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

        expected = new OrderProductResponse();
        expected.setServiceVersionNumber("3.0");

        ResponseTransactionDetail responseTransactionDetail = new ResponseTransactionDetail();
        responseTransactionDetail.setApplicationTransactionID("3.0");
        responseTransactionDetail.setServiceTransactionID("Id-688b4c5b971aeb57900650fe");
        expected.setTransactionDetail(responseTransactionDetail);

        TransactionResult transactionResult = new TransactionResult();
        transactionResult.setResultID("CM004");
        transactionResult.setResultText("Internal D\u0026B system error. Please try again or contact your local Customer Service Center.");
        expected.setTransactionResult(transactionResult);
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

        OrderProductResponse result = new RequestManualSender().sendSoapRequest(request);
        assertEquals(new Gson().toJson(expected.getServiceVersionNumber()), new Gson().toJson(result.getServiceVersionNumber()));
        assertEquals(new Gson().toJson(expected.getTransactionResult()), new Gson().toJson(result.getTransactionResult()));
    }
}
