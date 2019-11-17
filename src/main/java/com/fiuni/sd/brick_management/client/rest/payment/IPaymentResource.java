package com.fiuni.sd.brick_management.client.rest.payment;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.payment.FullPaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;

public interface IPaymentResource extends IBaseResource<PaymentDTO> {
    public PaymentResult getAll(Integer page);
    public PaymentResult getPayment();
    public FullPaymentDTO save(FullPaymentDTO fullpayment);
}
