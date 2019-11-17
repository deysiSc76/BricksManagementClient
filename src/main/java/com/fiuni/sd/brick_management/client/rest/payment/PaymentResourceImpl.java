package com.fiuni.sd.brick_management.client.rest.payment;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.brick_management.client.rest.charge.IChargeResource;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.payment.FullPaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;
import com.fiuni.sd.bricks_management.dto.provider.ProviderResult;
import org.springframework.stereotype.Repository;

@Repository("paymentResource")
public class PaymentResourceImpl extends BaseResourceImpl<PaymentDTO> implements IPaymentResource {
    public PaymentResourceImpl() {
        super(PaymentDTO.class, "/payment");
    }
    @Override
    public PaymentResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(PaymentResult.class);
    }
    @Override
    public PaymentResult getPayment() {
        return getWebResource().path("/" + 1 + "/" + 200).get(PaymentResult.class);
    }
    @Override
    public FullPaymentDTO save(FullPaymentDTO fullpayment){
        return getWebResource().entity(fullpayment).post(FullPaymentDTO.class);
    }

}
