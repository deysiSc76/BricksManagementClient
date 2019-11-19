package com.fiuni.sd.brick_management.client.service.base;

import com.fiuni.sd.brick_management.client.beans.base.BaseBean;
import com.fiuni.sd.bricks_management.dto.base.BaseDTO;

public abstract class BaseServiceImpl<BEAN extends BaseBean, DTO extends BaseDTO> implements IBaseService<BEAN, DTO> {

    public BaseServiceImpl() {

    }
        protected abstract BEAN convertDtoToBean(DTO dto);

        protected abstract DTO convertBeanToDto(BEAN bean);

    }
