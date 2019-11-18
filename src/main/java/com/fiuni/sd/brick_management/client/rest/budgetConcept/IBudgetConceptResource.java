package com.fiuni.sd.brick_management.client.rest.budgetConcept;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptDTO;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptResult;

public interface IBudgetConceptResource extends IBaseResource<BudgetConceptDTO> {
    public BudgetConceptResult getAll(Integer page);
}
