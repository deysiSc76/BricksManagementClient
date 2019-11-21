package com.fiuni.sd.brick_management.client.rest.user;

import com.fiuni.sd.brick_management.client.rest.base.IBaseResource;
import com.fiuni.sd.bricks_management.dto.user.UserDTO;
import com.fiuni.sd.bricks_management.dto.user.UserResult;
import org.springframework.stereotype.Repository;

@Repository("userResource")
public interface IUserResource  extends IBaseResource<UserDTO> {
    public UserResult getAll(Integer page);
    public void delete(Integer id);
}
