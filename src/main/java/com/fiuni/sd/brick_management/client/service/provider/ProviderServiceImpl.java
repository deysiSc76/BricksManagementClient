package com.fiuni.sd.brick_management.client.service.provider;

import bricksmanagementclient.Provider;
import com.fiuni.sd.brick_management.client.beans.budget.BudgetB;
import com.fiuni.sd.brick_management.client.beans.charge.ChargeB;
import com.fiuni.sd.brick_management.client.beans.provider.ProviderB;
import com.fiuni.sd.brick_management.client.rest.provider.IProviderResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;
import com.fiuni.sd.brick_management.client.service.budget.IBudgetService;
import com.fiuni.sd.bricks_management.dto.budget.BudgetDTO;
import com.fiuni.sd.bricks_management.dto.charge.ChargeDTO;
import com.fiuni.sd.bricks_management.dto.provider.ProviderDTO;
import com.fiuni.sd.bricks_management.dto.provider.ProviderResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProviderServiceImpl  extends BaseServiceImpl<ProviderB, ProviderDTO> implements IProviderService {
    @Autowired
    private IProviderResource providerResource;

    @Override
    @Transactional
    public ProviderB save(ProviderB bean) {
        final ProviderDTO dto = convertBeanToDto(bean);
        final ProviderDTO providerDTO = providerResource.save(dto);
        return convertDtoToBean(providerDTO);
    }

    protected ProviderB convertDtoToBean(ProviderDTO dto) {
        final Map<String, String> params = new HashMap<String, String>();
        params.put("id", String.valueOf(dto.getId()));
        params.put("address", dto.getAddress());
        params.put("bussinessName", dto.getBusinessName());
        params.put("number", String.valueOf(dto.getNumber()));
        params.put("ruc", String.valueOf(dto.getRuc()));


        final ProviderB providerB = new ProviderB(params);

        return providerB;
    }
    @Override
    public List<ProviderB> getAll(Integer page) {
        final ProviderResult result = providerResource.getAll(page);
        final List<ProviderDTO> cList = null == result.getProviders() ? new ArrayList<ProviderDTO>()
                : result.getProviders();

        final List<ProviderB> providers = new ArrayList<ProviderB>();
        for (ProviderDTO dto : cList) {
            final ProviderB bean = convertDtoToBean(dto);
            providers.add(bean);
        }
        return providers;
    }

    @Override
    public ProviderB getById(Integer id) {
        final ProviderDTO dto = providerResource.getById(id);
        final ProviderB bean = convertDtoToBean(dto);

        return bean;
    }


    protected ProviderDTO convertBeanToDto(ProviderB bean) {
        final ProviderDTO dto = new ProviderDTO();
        dto.setId(bean.getId());
        dto.setAddress(bean.getAddress());
        dto.setBusinessName(bean.getBussinessName());
        dto.setNumber(bean.getNumber());
        dto.setRuc(bean.getRuc());
        return dto;
    }
}
