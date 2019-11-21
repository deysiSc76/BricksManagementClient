package com.fiuni.sd.brick_management.client.service.rol;

import com.fiuni.sd.brick_management.client.beans.rol.RolB;

import com.fiuni.sd.brick_management.client.rest.rol.IRolResource;
import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;

import com.fiuni.sd.bricks_management.dto.rol.RolDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.RoleResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("rolService")

public class RolServiceImpl  extends BaseServiceImpl<RolB, RolDTO> implements IRolService {
        @Autowired
        IRolResource rolResource;

        @Override
        protected RolB convertDtoToBean(RolDTO dto) {
            HashMap<String, String> props = new HashMap<>();
            if (dto.getId() != null){
                props.put("id", dto.getId().toString());
            }
            props.put("type", dto.getType() + "");

            return new RolB(props);
        }
    @Override
    protected RolDTO convertBeanToDto(RolB bean) {
        RolDTO dto = new RolDTO();
        dto.setId(bean.getId());
        dto.setType(bean.getType());

        return dto;
    }

    @Override
    public void delete(int id) {
        rolResource.delete(id);
    }

    @Override
    public RolB save(RolB bean) {
        RolDTO dto = rolResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<RolB> getAll(Integer page) {
        RoleResult rols = rolResource.getAll(page);
        List<RolB> rolBeans = new ArrayList<>();
        rols.getRoles().forEach(rolDTO -> rolBeans.add(convertDtoToBean(rolDTO)));
        return rolBeans;
    }

    @Override
    public RolB getById(Integer id) {
        RolDTO dto = rolResource.getById(id);
        return convertDtoToBean(dto);
    }

}
