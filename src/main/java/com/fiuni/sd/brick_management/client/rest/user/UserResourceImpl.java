package com.fiuni.sd.brick_management.client.rest.user;


import com.fiuni.sd.brick_management.client.rest.base.BaseResourceImpl;

import com.fiuni.sd.bricks_management.dto.user.UserDTO;
import com.fiuni.sd.bricks_management.dto.user.UserResult;
import org.springframework.stereotype.Repository;

@Repository("UserResource")
public class UserResourceImpl extends BaseResourceImpl<UserDTO> implements IUserResource {
    public UserResourceImpl() {
        super(UserDTO.class, "/user");
    }
    @Override
    public UserResult getAll(Integer page) {
        return getWebResource().path("/" + page + "/" + 20).get(UserResult.class);
    }
}
