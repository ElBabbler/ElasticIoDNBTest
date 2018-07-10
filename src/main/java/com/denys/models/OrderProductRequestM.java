package com.denys.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductRequestM implements java.io.Serializable {
    private OrderProductRequestDetailM orderProductRequestDetail;

    private com.dnb.services.NewsAndMediaProductServiceV2_0.RequestTransactionDetail transactionDetail;

    private String serviceVersionNumber;
}
