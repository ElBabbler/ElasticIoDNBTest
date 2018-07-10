package com.denys.utils;

import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest;
import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse;

public interface RequestSender {
     OrderProductResponse sendSoapRequest(OrderProductRequest request);
}
