package com.fiuni.sd.brick_management.client.rest.budget;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import com.fiuni.sd.bricks_management.dto.budget.BudgetResult;
import com.fiuni.sd.bricks_management.dto.payment.PaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;

public interface IBudgetResource extends IBaseResource<BudgetDTO> {
    public BudgetResult getAll(Integer page);
    public BudgetResult getBudget();

}
