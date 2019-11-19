package com.fiuni.sd.brick_management.client.service.budget;

import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.rest.budget.IBudgetResource;
import com.fiuni.sd.brick_management.client.rest.budgetConcept.IBudgetConceptResource;
import com.fiuni.sd.brick_management.client.rest.budgetDetail.IBudgetDetailResource;
import com.fiuni.sd.brick_management.client.rest.work.IWorkResource;
import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class BudgetServiceImpl extends BaseServiceImpl<BudgetB, BudgetDTO> implements IBudgetService {
    @Autowired
    private IBudgetResource budgetResource;
    @Autowired
    private IBudgetDetailResource budgetDetailResource;
    @Autowired
    private IBudgetDetailService budgetDetailService;
    @Autowired
    private IWorkResource workResource;
    @Autowired
    private IBudgetConceptResource budgetConceptResource;
    @Autowired
    private ChargeServiceImpl chargeService;

    @Override
    @Transactional
    public BudgetDTO save(BudgetDTO dto) {
        final BudgetDomain domain = convertDtoToDomain(dto);
        final BudgetDomain paymentDomain = budgetDao.save(domain);
        return convertDomainToDto(paymentDomain);
    }
}
