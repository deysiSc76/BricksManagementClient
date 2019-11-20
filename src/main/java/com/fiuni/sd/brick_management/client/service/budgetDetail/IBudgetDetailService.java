package com.fiuni.sd.brick_management.client.service.budgetDetail;

import com.fiuni.sd.brick_management.client.beans.budgetDetail.BudgetDetailB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;

public interface IBudgetDetailService extends IBaseService<BudgetDetailB, BudgetDetailDTO> {
    public void delete(int id);

}
