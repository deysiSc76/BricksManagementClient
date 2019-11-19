package com.fiuni.sd.brick_management.client.rest.rol;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.rol.RolDTO;
import org.springframework.stereotype.Repository;

import javax.management.relation.RoleResult;

@Repository("rolResource")
public interface IRolResource extends IBaseResource<RolDTO> {
    public RoleResult getAllFromUser(Integer userId);
}
