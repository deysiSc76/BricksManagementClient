package com.fiuni.sd.brick_management.client.rest.budget;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;

import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import com.fiuni.sd.bricks_management.dto.budget.BudgetResult;


public class BudgetResourceImpl extends BaseResourceImpl<BudgetDTO> implements IBudgetResource {

    public BudgetResourceImpl() { super(BudgetDTO.class, "/budget");

    }

    @Override
    public BudgetResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(BudgetResult.class);
    }

    @Override
    public BudgetResult getBudget() {
        return getWebResource().path("/" + 1 + "/" + 200).get(BudgetResult.class);
    }
}
