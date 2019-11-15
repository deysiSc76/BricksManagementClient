package com.fiuni.sd.brick_management.client.rest.charge;


import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import org.springframework.stereotype.Repository;

@Repository("chargeResource")
public class ChargeResourceImpl extends BaseResourceImpl<ChargeDTO> implements IChargeResource {

    public ChargeResourceImpl() { super(ChargeDTO.class, "/charge");
    }
    @Override
    public ChargeDTO save(ChargeDTO dto) {
        return getWebResource().entity(dto).post(getDtoClass());
    }


    @Override
    public ChargeResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(ChargeResult.class);
    }

    @Override
    public ChargeResult getCharges() {
        return getWebResource().path("/" + 1 + "/" + 200).get(ChargeResult.class);
    }
    @Override
    public ChargeDTO getById(Integer id) {
        return getWebResource().path("/" + id).get(getDtoClass());
    }


}

