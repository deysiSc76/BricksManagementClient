package com.fiuni.sd.brick_management.client.rest.budgetConcept;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.brick_management.client.rest.budgetDetail.IBudgetDetailResource;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptDTO;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptResult;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailDTO;
import com.fiuni.sd.bricks_management.dto.budgetDetail.BudgetDetailResult;

public class BudgetConceptResourceImpl extends BaseResourceImpl<BudgetConceptDTO> implements IBudgetConceptResource {
    public BudgetConceptResourceImpl() {
        super(BudgetConceptDTO.class, "/budgetConcept");
    }
    @Override
    public BudgetConceptResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(BudgetConceptResult.class);
    }
}
