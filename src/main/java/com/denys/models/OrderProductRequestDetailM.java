package com.denys.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductRequestDetailM {
    /* Records data that allows the customer to specify identifying
     * information about the subject being inquired, e.g., the DUNS Number,
     * the CountryCode etc. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.InquiryDetail inquiryDetail;

    /* Records data that allows the customer to specify the details
     * of the requested product. This may include details such as the identifier
     * of the product, the language in which the product needs to be rendered,
     * the format in which the product needs to be rendered. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ProductSpecification productSpecification;

    /* Records data that allows the customer to specify details about
     * the archival of the product being requested. */
    private com.dnb.services.NewsAndMediaProductServiceV2_0.ArchiveDetail archiveDetail;

    /* Records data that allows the customer to specify information
     * to be linked to this request in order to support subsequent order
     * reconciliation. */
    private InquiryReferenceDetailM inquiryReferenceDetail;

}
