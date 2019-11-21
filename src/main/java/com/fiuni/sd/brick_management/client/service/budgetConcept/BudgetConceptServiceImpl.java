package com.fiuni.sd.brick_management.client.service.budgetConcept;

import com.fiuni.sd.brick_management.client.beans.budgetConcept.BudgetConceptB;

import com.fiuni.sd.brick_management.client.rest.budgetConcept.IBudgetConceptResource;

import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;

import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptDTO;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptResult;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BudgetConceptServiceImpl extends BaseServiceImpl<BudgetConceptB, BudgetConceptDTO> implements IBudgetConceptService {
    @Autowired
    IBudgetConceptResource budgetConceptResource;
    @Override
    protected BudgetConceptB convertDtoToBean(BudgetConceptDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null) {
            props.put("id", dto.getId().toString());
        }
        props.put("description", dto.getDescription() + "");
        props.put("budgetDetail", dto.getBudgetDetails() + "");
        props.put("paymentConcept", dto.getPaymentConcepts() + "");

        return new BudgetConceptB(props);
    }
    @Override
    protected BudgetConceptDTO convertBeanToDto(BudgetConceptB bean) {
        BudgetConceptDTO dto = new BudgetConceptDTO();
        dto.setId(bean.getId());
        dto.setDescription(bean.getDescription());
        return dto;
    }
    @Override
    public void delete(int id) {
        budgetConceptResource.delete(id);
    }

    @Override
    public BudgetConceptB save(BudgetConceptB bean) {
        BudgetConceptDTO dto = budgetConceptResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<BudgetConceptB> getAll(Integer page) {
        BudgetConceptResult budgetConcepts = budgetConceptResource.getAll(page);
        List<BudgetConceptB> budgetConceptBeans = new ArrayList<>();
        budgetConcepts.getList().forEach(budgetConceptDTO -> budgetConceptBeans.add(convertDtoToBean(budgetConceptDTO)));
        return budgetConceptBeans;
    }
    @Override
    public BudgetConceptB getById(Integer id) {
        BudgetConceptDTO dto = budgetConceptResource.getById(id);
        return convertDtoToBean(dto);
    }

}
