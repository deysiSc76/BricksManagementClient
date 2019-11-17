package com.fiuni.sd.brick_management.client.rest.budgetDetail;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailResult;


public interface IBudgetDetailResource extends IBaseResource<BudgetDetailDTO> {
    public BudgetDetailResult getAll(Integer page);
    public BudgetDetailResult getBudgetDetail();
}

