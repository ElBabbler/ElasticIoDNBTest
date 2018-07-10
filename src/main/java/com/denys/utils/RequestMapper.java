package com.denys.utils;

import com.denys.models.OrderProductRequestM;
import com.denys.models.PartOfStringListM;
import com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryReferenceDetail;
import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest;
import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequestDetail;

import java.util.stream.Collectors;

public class RequestMapper {
    public static OrderProductRequest mapRequest(OrderProductRequestM requestM) {
        OrderProductRequest orderProductRequest = new OrderProductRequest();
        orderProductRequest.setTransactionDetail(requestM.getTransactionDetail());
        orderProductRequest.setServiceVersionNumber(requestM.getServiceVersionNumber());


        String[] customerReferenceText = new String[requestM
                .getOrderProductRequestDetail()
                .getInquiryReferenceDetail()
                .getCustomerReferenceText()
                .size()];
        customerReferenceText = requestM
                .getOrderProductRequestDetail()
                .getInquiryReferenceDetail()
                .getCustomerReferenceText()
                .stream().map(PartOfStringListM::getStr).collect(Collectors.toList())
                .toArray(customerReferenceText);

        InquiryReferenceDetail inquiryReferenceDetail = new InquiryReferenceDetail();
        inquiryReferenceDetail.setCustomerBillingEndorsementText(requestM.getOrderProductRequestDetail()
                .getInquiryReferenceDetail().getCustomerBillingEndorsementText());
        inquiryReferenceDetail.setCustomerReferenceText(customerReferenceText);

        OrderProductRequestDetail orderProductRequestDetail = new OrderProductRequestDetail();
        orderProductRequestDetail.setArchiveDetail(requestM.getOrderProductRequestDetail().getArchiveDetail());
        orderProductRequestDetail.setInquiryReferenceDetail(inquiryReferenceDetail);
        orderProductRequestDetail.setProductSpecification(requestM.getOrderProductRequestDetail().getProductSpecification());
        orderProductRequestDetail.setInquiryDetail(requestM.getOrderProductRequestDetail().getInquiryDetail());

        orderProductRequest.setOrderProductRequestDetail(orderProductRequestDetail);

        return orderProductRequest;
    }
}
