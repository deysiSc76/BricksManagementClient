package com.fiuni.sd.brick_management.client.rest.base;


import com.fiuni.sd.bricks_management.dto.base.BaseDTO;

public interface IBaseResource<DTO extends BaseDTO> {

    public DTO save(DTO dto);

    public DTO getById(Integer id);

}