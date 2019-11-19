package com.fiuni.sd.brick_management.client.service.charge;

import com.fiuni.sd.brick_management.client.beans.charge.ChargeB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeResult;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

public interface IChargeService extends IBaseService<ChargeB, ChargeDTO> {
    public ChargeDTO update(ChargeDTO dto, Integer id);

    public ChargeResult getByDate(String date, SpringDataWebProperties.Pageable pageable);
}

