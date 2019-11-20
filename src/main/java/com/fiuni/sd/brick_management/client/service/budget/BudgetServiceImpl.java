package com.fiuni.sd.brick_management.client.service.budget;

import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.beans.budgetDetail.BudgetDetailB;

import com.fiuni.sd.brick_management.client.beans.payment.PaymentB;
import com.fiuni.sd.brick_management.client.rest.budget.IBudgetResource;

import com.fiuni.sd.brick_management.client.rest.budgetDetail.IBudgetDetailResource;

import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import com.fiuni.sd.bricks_management.dto.budget.BudgetResult;
import com.fiuni.sd.bricks_management.dto.budget.FullBudgetDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;

import com.fiuni.sd.bricks_management.dto.payment.FullPaymentDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BudgetServiceImpl extends BaseServiceImpl<BudgetB, BudgetDTO> implements IBudgetService {
    @Autowired
    IBudgetResource budgetResource;
    @Autowired
    IBudgetDetailResource budgetDetailResource;
    @Override
    protected BudgetB convertDtoToBean(BudgetDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("details", dto.getDetails() + "");
        props.put("totalAmount", dto.getTotalAmount() + "");
        props.put("workId", dto.getWorkId() + "");
        return new BudgetB(props);
    }
    @Override
    protected BudgetDTO convertBeanToDto(BudgetB bean) {
        BudgetDTO dto = new BudgetDTO();
        dto.setId(bean.getId());
        dto.setWorkId(bean.getWorkId());
        dto.setTotalAmount(bean.getTotalAmount());

        return dto;
    }
    protected BudgetDetailDTO convertBeanToDto(BudgetDetailB detail) {
        BudgetDetailDTO dto = new BudgetDetailDTO();
        dto.setId(detail.getId());
        dto.setQuantity(detail.getQuantity());
        dto.setAmount(detail.getAmount());
        dto.setBudgetId(detail.getBudget_id());
        dto.setBudgetConceptId(detail.getBudget_concept_id());
        return dto;
    }
    protected BudgetDetailB convertDtoToBean(BudgetDetailDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("amount", dto.getAmount() + "");
        props.put("quantity", dto.getQuantity() + "");
        props.put("budget_id", dto.getBudgetId() + "");
        props.put("budgetConceptId", dto.getBudgetConceptId() + "");
        return new BudgetDetailB(props);
    }
    protected FullBudgetDTO convertBeanToDto(BudgetB bean, List<BudgetDetailB> details) {
        // creo el full dto
        FullBudgetDTO dto = new FullBudgetDTO();
        // le agrego el payment
        dto.setBudget(convertBeanToDto(bean));
        // le agrego los detalles
        List<BudgetDetailDTO> detailsDto = new ArrayList<>();
        details.forEach(detail -> detailsDto.add(convertBeanToDto(detail)));
        dto.setDetails(detailsDto);
        return dto;
    }
    @Override
    public BudgetB save(BudgetB bean) {
        BudgetDTO dto = budgetResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<BudgetB> getAll(Integer page) {
        BudgetResult budgets = budgetResource.getAll(page);
        List<BudgetB> budgetBeans = new ArrayList<>();
        budgets.getBudgets().forEach(budget -> budgetBeans.add(convertDtoToBean(budget)));
        return budgetBeans;
    }
    @Override
    public BudgetB save(BudgetB bean, List<BudgetDetailB> details) {
        FullBudgetDTO dto = convertBeanToDto(bean, details);
        FullBudgetDTO fullBudgetDTO = budgetResource.save(dto);
        return convertDtoToBean(fullBudgetDTO.getBudget());
    }
    @Override
    public List<BudgetDetailB> getDetails(int budgetId){
        FullBudgetDTO dto = budgetResource.getFullById(budgetId);
        List<BudgetDetailB> details = new ArrayList<>();
        dto.getDetais().forEach(detail -> convertDtoToBean(detail));
        return details;
    }
    @Override
    public BudgetB getById(Integer id) {
        FullBudgetDTO dto = budgetResource.getFullById(id);
        return convertDtoToBean(dto.getBudget());
    }

}
