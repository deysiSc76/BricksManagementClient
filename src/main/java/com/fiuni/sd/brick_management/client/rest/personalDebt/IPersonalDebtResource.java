package com.fiuni.sd.brick_management.client.rest.personalDebt;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.personalDebt.PersonalDebtDTO;
import com.fiuni.sd.bricks_management.dto.personalDebt.PersonalDebtResult;


public interface IPersonalDebtResource extends IBaseResource<PersonalDebtDTO> {
    public PersonalDebtResult getAll(Integer page);

}
