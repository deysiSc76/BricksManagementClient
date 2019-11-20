package com.fiuni.sd.brick_management.client.service.paymentDetail;

import com.fiuni.sd.brick_management.client.beans.payment.PaymentB;
import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.rest.paymentDetail.IPaymentDetailResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.brick_management.client.service.payment.IPaymentService;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("paymentDetailService")
public class PaymentDetailServiceImpl  extends BaseServiceImpl<PaymentDetailB, PaymentDetailDTO> implements IPaymentDetailService {
    @Autowired
    IPaymentDetailResource paymentDetailResource;

    @Override
    protected PaymentDetailB convertDtoToBean(PaymentDetailDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("unitPrice", dto.getUnitPrice() + "");
        props.put("quantity", dto.getQuantity() + "");
        props.put("payment_id", dto.getPaymentId() + "");
        props.put("paymentConceptId", dto.getPaymentConceptId() + "");
        props.put("paymentRealatedId", dto.getPaymentRelatedId() + "");
        return new PaymentDetailB(props);
    }

    @Override
    protected PaymentDetailDTO convertBeanToDto(PaymentDetailB bean) {
        PaymentDetailDTO dto = new PaymentDetailDTO();
        dto.setId(bean.getId());
        dto.setUnitPrice(bean.getUnitPrice());
        dto.setQuantity(bean.getQuantity());
        dto.setPaymentId(bean.getPayment_id());
        dto.setPaymentConcept(bean.getPaymentConceptId());
        dto.setPaymentRelatedId(bean.getPaymentRealatedId());
        return dto;
    }

    @Override
    public void delete(int id) {
        paymentDetailResource.delete(id);
    }

    @Override
    public PaymentDetailB save(PaymentDetailB bean) {
        PaymentDetailDTO dto = paymentDetailResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }

    @Override
    public List<PaymentDetailB> getAll(Integer page) {
        PaymentDetailResult paymentDetails = paymentDetailResource.getAll(page);
        List<PaymentDetailB> paymentDetailBeans = new ArrayList<>();
        paymentDetails.getPaymentDetails().forEach(paymentDetailDTO -> paymentDetailBeans.add(convertDtoToBean(paymentDetailDTO)));
        return paymentDetailBeans;
    }

    @Override
    public PaymentDetailB getById(Integer id) {
        PaymentDetailDTO dto = paymentDetailResource.getById(id);
        return convertDtoToBean(dto);
    }
}
