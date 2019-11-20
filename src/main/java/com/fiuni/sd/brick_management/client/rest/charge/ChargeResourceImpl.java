package com.fiuni.sd.brick_management.client.rest.charge;


import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import com.sun.jersey.api.client.WebResource;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
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
    public ChargeResult getByDate(String date, Integer page) {
        return getWebResource().path("/by-date/" + date + "/" + page + "/").get(ChargeResult.class);
    }
    @Override
    public void delete(Integer id) {
        getWebResource().path("/" + id).delete();
    }

    @Override
    public ChargeDTO getById(Integer id) {
        return getWebResource().path("/" + id).get(getDtoClass());
    }
}


