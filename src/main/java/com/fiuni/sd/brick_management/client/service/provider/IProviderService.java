package com.fiuni.sd.brick_management.client.service.provider;

import com.fiuni.sd.brick_management.client.beans.provider.ProviderB;
import com.fiuni.sd.brick_management.client.service.base.IBaseService;
import com.fiuni.sd.bricks_management.dto.provider.ProviderDTO;
import com.fiuni.sd.bricks_management.dto.provider.ProviderResult;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

public interface IProviderService extends IBaseService<ProviderB, ProviderDTO> {
    public void delete(int id);


}
