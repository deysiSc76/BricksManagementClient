package com.fiuni.sd.brick_management.client.service.budget;

import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import com.fiuni.sd.bricks_management.dto.budget.FullBudgetDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;

public interface IBudgetService extends IBaseService<BudgetB, BudgetDTO> {
    public void delete(Integer id);

    public void deleteDetail(Integer id);
    public FullBudgetDTO save(FullBudgetDTO fullBudget);
    public FullBudgetDTO getFullBudget(Integer id);
    public BudgetDTO update(BudgetDTO dto, Integer id);
    public BudgetDetailDTO updateDetail(Integer id, BudgetDetailDTO detail);
}
