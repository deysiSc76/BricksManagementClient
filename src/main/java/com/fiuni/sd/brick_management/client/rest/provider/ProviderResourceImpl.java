package com.fiuni.sd.brick_management.client.rest.provider;


import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.provider.ProviderDTO;
import com.fiuni.sd.bricks_management.dto.provider.ProviderResult;
import org.springframework.stereotype.Repository;

@Repository("providerResource")
public class ProviderResourceImpl extends BaseResourceImpl<ProviderDTO> implements IProviderResource {

    public ProviderResourceImpl() { super(ProviderDTO.class, "/provider");
    }

    @Override
    public ProviderResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(ProviderResult.class);
    }
    @Override
    public void delete(Integer id) {
        getWebResource().path("/" + id).delete();
    }


}

