package com.fiuni.sd.brick_management.client.service.paymentConcept;

import com.fiuni.sd.brick_management.client.beans.paymentConcept.PaymentConceptB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptDTO;

public interface IPaymentConceptService extends IBaseService<PaymentConceptB, PaymentConceptDTO> {
    public void delete(int id);
}
