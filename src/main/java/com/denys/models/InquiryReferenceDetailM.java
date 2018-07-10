package com.denys.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InquiryReferenceDetailM implements java.io.Serializable {
    /* A freeform reference string provided by the customer to be
     * linked to the product in order to support subsequent order reconciliation. */
    private List<PartOfStringListM> customerReferenceText;

    /* Text that is filled in by customer and commonly contains requesting
     * individual or department name, or customer's own account/reference
     * number and/or name for the case on which the product was provided.This
     * text is a reference used during the billing process. */
    private String customerBillingEndorsementText;
}
