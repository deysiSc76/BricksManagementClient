package com.fiuni.sd.brick_management.client.service.rol;

import com.fiuni.sd.brick_management.client.beans.paymentDetail.PaymentDetailB;
import com.fiuni.sd.brick_management.client.beans.rol.RolB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.paymentDetail.PaymentDetailDTO;
import com.fiuni.sd.bricks_management.dto.rol.RolDTO;

public interface IRolService extends IBaseService<RolB, RolDTO> {
    public void delete(int id);
}
