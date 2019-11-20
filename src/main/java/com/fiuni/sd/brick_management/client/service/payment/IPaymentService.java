package com.fiuni.sd.brick_management.client.service.payment;

import com.fiuni.sd.brick_management.client.beans.payment.PaymentB;
import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;

import java.util.List;

public interface IPaymentService extends IBaseService<PaymentB, PaymentDTO> {
    public PaymentB save(PaymentB bean, List<PaymentDetailB> details);
    public List<PaymentDetailB> getDetails(int paymentId);
}
