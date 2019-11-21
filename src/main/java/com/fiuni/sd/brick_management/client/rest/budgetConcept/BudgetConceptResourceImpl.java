package com.fiuni.sd.brick_management.client.rest.budgetConcept;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptDTO;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptResult;


public class BudgetConceptResourceImpl extends BaseResourceImpl<BudgetConceptDTO> implements IBudgetConceptResource {
    public BudgetConceptResourceImpl() {
        super(BudgetConceptDTO.class, "/budgetConcept");
    }
    @Override
    public BudgetConceptResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(BudgetConceptResult.class);
    }
    @Override
    public void delete(Integer id) {
        getWebResource().path("/" + id).delete();
    }
}
