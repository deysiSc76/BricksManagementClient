package com.fiuni.sd.brick_management.client.rest.paymentConcept;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptDTO;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptResult;
import org.springframework.stereotype.Repository;

@Repository("paymentConceptResource")
public class PaymentConceptResourceImpl extends BaseResourceImpl<PaymentConceptDTO> implements IPaymentConceptResource {
    public PaymentConceptResourceImpl() {
        super(PaymentConceptDTO.class, "/paymentConcept");
    }
    @Override
    public PaymentConceptResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(PaymentConceptResult.class);
    }
}
