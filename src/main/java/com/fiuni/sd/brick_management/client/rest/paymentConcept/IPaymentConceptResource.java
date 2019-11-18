package com.fiuni.sd.brick_management.client.rest.paymentConcept;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptDTO;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptResult;

public interface IPaymentConceptResource extends IBaseResource<PaymentConceptDTO> {
    public PaymentConceptResult getAll(Integer page);
}
