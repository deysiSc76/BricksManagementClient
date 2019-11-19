package com.fiuni.sd.brick_management.client.service.base;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import com.fiuni.sd.bricks_management.dto.base.BaseDTO;

import java.util.List;

public interface IBaseService<BEAN extends BaseBean, DTO extends BaseDTO> {
    public BEAN save(BEAN bean);

    public List<BEAN> getAll(Integer page);

    public BEAN getById(Integer id);
}

