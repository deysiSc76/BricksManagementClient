package com.fiuni.sd.brick_management.client.service.budgetConcept;

import com.fiuni.sd.brick_management.client.beans.budgetConcept.BudgetConceptB;

import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.budgetConcept.BudgetConceptDTO;


public interface IBudgetConceptService extends IBaseService<BudgetConceptB, BudgetConceptDTO> {
    public void delete(int id);
}
