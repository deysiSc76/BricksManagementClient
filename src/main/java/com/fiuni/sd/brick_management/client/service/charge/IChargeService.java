package com.fiuni.sd.brick_management.client.service.charge;

import com.fiuni.sd.brick_management.client.beans.charge.ChargeB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.util.List;

public interface IChargeService extends IBaseService<ChargeB, ChargeDTO> {
    public List<ChargeB> getByDate(String date, Integer page);
}

