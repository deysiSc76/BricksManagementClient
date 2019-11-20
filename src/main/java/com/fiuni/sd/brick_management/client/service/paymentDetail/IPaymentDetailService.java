package com.fiuni.sd.brick_management.client.service.paymentDetail;

import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;

public interface IPaymentDetailService extends IBaseService<PaymentDetailB, PaymentDetailDTO> {
    public void delete(int id);
}
