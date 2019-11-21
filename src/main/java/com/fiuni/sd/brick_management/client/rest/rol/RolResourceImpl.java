package com.fiuni.sd.brick_management.client.rest.rol;

import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;
import com.fiuni.sd.bricks_management.dto.provider.ProviderResult;
import com.fiuni.sd.bricks_management.dto.rol.RolDTO;
import com.fiuni.sd.bricks_management.dto.work.WorkDTO;

import javax.management.relation.RoleResult;

public class RolResourceImpl extends BaseResourceImpl<RolDTO> implements IRolResource {
    public RolResourceImpl() {
        super(RolDTO.class, "/rol");
    }

    @Override
    public RoleResult getAllFromUser(Integer userId) {
        return getWebResource().path("/from-user/" + userId).get(RoleResult.class);
    }
    @Override
    public RoleResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(RoleResult.class);
    }
    @Override
    public void delete(Integer id) {
        getWebResource().path("/" + id).delete();
    }
}
