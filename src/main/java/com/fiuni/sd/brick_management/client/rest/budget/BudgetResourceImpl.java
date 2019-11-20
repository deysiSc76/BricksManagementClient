package com.fiuni.sd.brick_management.client.rest.budget;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;

import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import com.fiuni.sd.bricks_management.dto.budget.BudgetResult;
import com.fiuni.sd.bricks_management.dto.budget.FullBudgetDTO;
import com.fiuni.sd.bricks_management.dto.payment.FullPaymentDTO;
import com.fiuni.sd.bricks_management.dto.payment.PaymentResult;


public class BudgetResourceImpl extends BaseResourceImpl<BudgetDTO> implements IBudgetResource {

    public BudgetResourceImpl() { super(BudgetDTO.class, "/budget");

    }

    @Override
    public BudgetResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(BudgetResult.class);
    }
    @Override
    public FullBudgetDTO save(FullBudgetDTO fullbudget){
        return getWebResource().entity(fullbudget).post(FullBudgetDTO.class);
    }
    @Override
    public FullBudgetDTO getFullById(Integer id) {
        return getWebResource().path("/" + id).get(FullBudgetDTO.class);
    }

    @Override
    public BudgetResult getBudget() {
        return getWebResource().path("/" + 1 + "/" + 200).get(BudgetResult.class);
    }
}
