package com.fiuni.sd.brick_management.client.service.payment;

import com.fiuni.sd.brick_management.client.beans.payment.PaymentB;
import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.rest.payment.IPaymentResource;
import com.fiuni.sd.brick_management.client.rest.paymentDetail.IPaymentDetailResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.bricks_management.dto.payment.FullPaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("paymentService")
public class PaymentServiceImpl extends BaseServiceImpl<PaymentB, PaymentDTO> implements IPaymentService {
    @Autowired
    IPaymentResource paymentResource;
    @Autowired
    IPaymentDetailResource paymentDetailResource;

    @Override
    protected PaymentB convertDtoToBean(PaymentDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("workId", dto.getWorkId() + "");
        props.put("debtId", dto.getDebtId() + "");
        props.put("providerId", dto.getProviderId() + "");
        props.put("total", dto.getTotal() + "");
        props.put("date", dto.getDate());
        props.put("documentType", dto.getDocumentType());
        props.put("number", dto.getNumber() + "");
        props.put("stamping", dto.getStamping() + "");
        props.put("billType", dto.getBillType() + "");
        return new PaymentB(props);
    }

    @Override
    protected PaymentDTO convertBeanToDto(PaymentB bean) {
        PaymentDTO dto = new PaymentDTO();
        dto.setId(bean.getId());
        dto.setWorkId(bean.getWorkId());
        dto.setDebtId(bean.getDebtId());
        dto.setProviderId(bean.getProviderId());
        dto.setTotal(bean.getTotal());
        dto.setDate(bean.getDate());
        dto.setDocumentType(bean.getDocumentType());
        dto.setNumber(bean.getNumber());
        dto.setStamping(bean.getStamping());
        dto.setBillType(bean.getBillType());
        return dto;
    }

    // para los details
    protected PaymentDetailDTO convertBeanToDto(PaymentDetailB detail) {
        PaymentDetailDTO dto = new PaymentDetailDTO();
        dto.setId(detail.getId());
        dto.setUnitPrice(detail.getUnitPrice());
        dto.setQuantity(detail.getQuantity());
        dto.setPaymentId(detail.getPayment_id());
        dto.setPaymentConcept(detail.getPaymentConceptId());
        dto.setPaymentRelatedId(detail.getPaymentRealatedId());
        return dto;
    }

    // para los details
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

    protected FullPaymentDTO convertBeanToDto(PaymentB bean, List<PaymentDetailB> details) {
        // creo el full dto
        FullPaymentDTO dto = new FullPaymentDTO();
        // le agrego el payment
        dto.setPayment(convertBeanToDto(bean));
        // le agrego los detalles
        List<PaymentDetailDTO> detailsDto = new ArrayList<>();
        details.forEach(detail -> detailsDto.add(convertBeanToDto(detail)));
        dto.setDetails(detailsDto);

        return dto;
    }

    @Override
    public PaymentB save(PaymentB bean) {
        PaymentDTO dto = paymentResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }

    @Override
    public List<PaymentB> getAll(Integer page) {
        PaymentResult payments = paymentResource.getAll(page);
        List<PaymentB> paymentBeans = new ArrayList<>();
        payments.getPayments().forEach(payment -> paymentBeans.add(convertDtoToBean(payment)));
        return paymentBeans;
    }

    @Override
    public PaymentB getById(Integer id) {
        FullPaymentDTO dto = paymentResource.getFullById(id);
        return convertDtoToBean(dto.getPayment());
    }

    @Override
    public PaymentB save(PaymentB bean, List<PaymentDetailB> details) {
        FullPaymentDTO dto = convertBeanToDto(bean, details);
        FullPaymentDTO fullPaymentDTO = paymentResource.save(dto);
        return convertDtoToBean(fullPaymentDTO.getPayment());
    }

    @Override
    public List<PaymentDetailB> getDetails(int paymentId){
        FullPaymentDTO dto = paymentResource.getFullById(paymentId);
        List<PaymentDetailB> details = new ArrayList<>();
        dto.getDetails().forEach(detail -> convertDtoToBean(detail));
        return details;
    }
}
