package com.fiuni.sd.brick_management.client.rest.charge;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

public interface IChargeResource extends IBaseResource<ChargeDTO> {

    public ChargeResult getAll(Integer page);
    public ChargeResult getByDate(String date, Integer page);
    public void delete(Integer id);
}
