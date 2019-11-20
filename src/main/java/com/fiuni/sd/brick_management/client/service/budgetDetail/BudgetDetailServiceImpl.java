package com.fiuni.sd.brick_management.client.service.budgetDetail;

import com.fiuni.sd.brick_management.client.beans.budgetDetail.BudgetDetailB;
import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.rest.budget.IBudgetResource;
import com.fiuni.sd.brick_management.client.rest.budgetConcept.IBudgetConceptResource;
import com.fiuni.sd.brick_management.client.rest.budgetDetail.IBudgetDetailResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailResult;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("budgetDetailService")
public class BudgetDetailServiceImpl extends BaseServiceImpl<BudgetDetailB, BudgetDetailDTO> implements IBudgetDetailService {
    @Autowired
    IBudgetDetailResource budgetDetailResource;
    IBudgetResource budgetResource;
    IBudgetConceptResource budgetConceptResource;

    @Override
    protected BudgetDetailB convertDtoToBean(BudgetDetailDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("amount", dto.getAmount() + "");
        props.put("quantity", dto.getQuantity() + "");
        props.put("budgetId", dto.getBudgetId() + "");
        props.put("budgetConceptId", dto.getBudgetConceptId()+ "");
        return new BudgetDetailB(props);
    }
    @Override
    protected BudgetDetailDTO convertBeanToDto(BudgetDetailB bean) {
        BudgetDetailDTO dto = new BudgetDetailDTO();
        dto.setId(bean.getId());
        dto.setAmount(bean.getAmount());
        dto.setQuantity(bean.getQuantity());
        dto.setBudgetId(bean.getBudget_id());
        dto.setBudgetConceptId(bean.getBudget_concept_id());
        return dto;
    }
    @Override
    public void delete(int id) {
        budgetDetailResource.delete(id);
    }

    @Override
    public BudgetDetailB save(BudgetDetailB bean) {
        BudgetDetailDTO dto = budgetDetailResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<BudgetDetailB> getAll(Integer page) {
        BudgetDetailResult budgetDetails = budgetDetailResource.getAll(page);
        List<BudgetDetailB> budgetDetailBeans = new ArrayList<>();
        budgetDetails.getBudgetDetails().forEach(budgetDetailDTO -> budgetDetailBeans.add(convertDtoToBean(budgetDetailDTO)));
        return budgetDetailBeans;
    }
    @Override
    public BudgetDetailB getById(Integer id) {
        BudgetDetailDTO dto = budgetDetailResource.getById(id);
        return convertDtoToBean(dto);
    }
}
