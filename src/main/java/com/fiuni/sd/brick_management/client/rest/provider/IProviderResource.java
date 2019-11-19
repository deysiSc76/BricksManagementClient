package com.fiuni.sd.brick_management.client.rest.provider;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;

import com.fiuni.sd.bricks_management.dto.provider.ProviderDTO;
import com.fiuni.sd.bricks_management.dto.provider.ProviderResult;

public interface IProviderResource extends IBaseResource<ProviderDTO> {

    public ProviderResult getAll(Integer page);
}
