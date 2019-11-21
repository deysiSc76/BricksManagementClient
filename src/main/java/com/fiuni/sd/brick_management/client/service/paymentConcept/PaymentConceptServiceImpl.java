package com.fiuni.sd.brick_management.client.service.paymentConcept;

import com.fiuni.sd.brick_management.client.beans.paymentConcept.PaymentConceptB;
import com.fiuni.sd.brick_management.client.rest.paymentConcept.IPaymentConceptResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptDTO;
import com.fiuni.sd.bricks_management.dto.paymentConcept.PaymentConceptResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("paymentConceptService")
public class PaymentConceptServiceImpl extends BaseServiceImpl<PaymentConceptB, PaymentConceptDTO> implements IPaymentConceptService {
    @Autowired
    IPaymentConceptResource paymentConceptResource;

    @Override
    protected PaymentConceptB convertDtoToBean(PaymentConceptDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null) {
            props.put("id", dto.getId().toString());
        }
        props.put("name", dto.getName() + "");
        props.put("description", dto.getDescription() + "");
        props.put("cost", dto.getCost() + "");
        props.put("dudgetConceptId", dto.getBudgetConceptId() + "");
        props.put("provierId", dto.getProviderId() + "");
        props.put("paymentDetails", dto.getPaymentDetails() + "");
        props.put("isMaterial", dto.isMaterial() + "");
        return new PaymentConceptB(props);
    }

    @Override
    protected PaymentConceptDTO convertBeanToDto(PaymentConceptB bean) {
        PaymentConceptDTO dto = new PaymentConceptDTO();
        dto.setId(bean.getId());
        dto.setName(bean.getName());
        dto.setCost(bean.getCost());
        dto.setBudgetConceptId(bean.getBudgetConceptId());
        dto.setDescription(bean.getDescription());
        dto.setMaterial(bean.getMaterial());
        dto.setProvider(bean.getProviderId());
        return dto;
    }

    @Override
    public void delete(int id) {
        paymentConceptResource.delete(id);
    }

    @Override
    public PaymentConceptB save(PaymentConceptB bean) {
        PaymentConceptDTO dto = paymentConceptResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<PaymentConceptB> getAll(Integer page) {
        PaymentConceptResult paymentConcepts = paymentConceptResource.getAll(page);
        List<PaymentConceptB> paymentConceptBeans = new ArrayList<>();
        paymentConcepts.getList().forEach(paymentConceptDTO -> paymentConceptBeans.add(convertDtoToBean(paymentConceptDTO)));
        return paymentConceptBeans;
    }
    @Override
    public PaymentConceptB getById(Integer id) {
        PaymentConceptDTO dto = paymentConceptResource.getById(id);
        return convertDtoToBean(dto);
    }
}


