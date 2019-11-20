package com.fiuni.sd.brick_management.client.service.budget;

import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.beans.budgetDetail.BudgetDetailB;

import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("budgetService")
public interface IBudgetService extends IBaseService<BudgetB, BudgetDTO> {
    public BudgetB save(BudgetB bean, List<BudgetDetailB> details);
    public List<BudgetDetailB> getDetails(int budgetId);
}
