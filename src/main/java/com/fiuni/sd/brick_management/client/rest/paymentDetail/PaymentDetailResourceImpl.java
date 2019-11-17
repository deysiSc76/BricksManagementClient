package com.fiuni.sd.brick_management.client.rest.paymentDetail;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailResult;
import org.springframework.stereotype.Repository;

@Repository("paymentDetailResource")
public class PaymentDetailResourceImpl extends BaseResourceImpl<PaymentDetailDTO> implements IPaymentDetailResource {
    public PaymentDetailResourceImpl() {
        super(PaymentDetailDTO.class, "/paymentDetail");
    }
    @Override
    public PaymentDetailResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(PaymentDetailResult.class);
    }
    @Override
    public PaymentDetailResult getPaymentDetail() {
        return getWebResource().path("/" + 1 + "/" + 200).get(PaymentDetailResult.class);
    }
}
