package com.fiuni.sd.brick_management.client.rest.personalDebt;


import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.personalDebt.PersonalDebtDTO;
import com.fiuni.sd.bricks_management.dto.personalDebt.PersonalDebtResult;
import org.springframework.stereotype.Repository;

@Repository("personalDebtResource")
public class PersonalDebtResourceImpl extends BaseResourceImpl<PersonalDebtDTO> implements IPersonalDebtResource {
    public PersonalDebtResourceImpl() {
        super(PersonalDebtDTO.class, "/personalDebt");
    }
    @Override
    public PersonalDebtResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(PersonalDebtResult.class);
    }
    @Override
    public void delete(Integer id) {
        getWebResource().path("/" + id).delete();
    }
}
