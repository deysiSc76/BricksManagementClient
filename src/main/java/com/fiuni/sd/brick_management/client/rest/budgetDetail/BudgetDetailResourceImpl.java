package com.fiuni.sd.brick_management.client.rest.budgetDetail;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailResult;
import org.springframework.stereotype.Repository;

@Repository("budgetDetailResource")
public class BudgetDetailResourceImpl extends BaseResourceImpl<BudgetDetailDTO> implements IBudgetDetailResource {
    public BudgetDetailResourceImpl() {
        super(BudgetDetailDTO.class, "/budgetDetail");
    }
    @Override

    public BudgetDetailResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(BudgetDetailResult.class);
    }
    @Override

    public BudgetDetailResult getBudgetDetail() {
        return getWebResource().path("/" + 1 + "/" + 200).get(BudgetDetailResult.class);
    }
}
