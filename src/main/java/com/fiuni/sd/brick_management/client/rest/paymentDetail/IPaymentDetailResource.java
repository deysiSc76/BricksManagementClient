package com.fiuni.sd.brick_management.client.rest.paymentDetail;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailResult;

import javax.validation.constraints.NotNull;

public interface IPaymentDetailResource extends IBaseResource<PaymentDetailDTO> {
    public PaymentDetailResult getAll(Integer page);
    public void delete(Integer id);
}

