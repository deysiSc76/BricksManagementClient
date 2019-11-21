package com.fiuni.sd.brick_management.client.service.user;



import com.fiuni.sd.brick_management.client.beans.user.UserB;

import com.fiuni.sd.brick_management.client.rest.user.IUserResource;

import com.fiuni.sd.brick_management.client.service.base.BaseServiceImpl;

import com.fiuni.sd.bricks_management.dto.user.UserDTO;
import com.fiuni.sd.bricks_management.dto.user.UserResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("UserService")
public class UserServiceImpl extends BaseServiceImpl<UserB, UserDTO> implements IUserService {
    @Autowired
    IUserResource userResource;
    @Override
    protected UserB convertDtoToBean(UserDTO dto) {
        HashMap<String, String> props = new HashMap<>();
        if (dto.getId() != null){
            props.put("id", dto.getId().toString());
        }
        props.put("name",dto.getName() + "");
        props.put("lastName", dto.getLastName() + "");
        props.put("address", dto.getAddress() + "");
        props.put("number", dto.getNumber() + "");
        props.put("roles", dto.getRoles() + "");
        props.put("email", dto.getEmail() + "");
        props.put("password", dto.getPassword()+ "");
        props.put("document", dto.getDocument() + "");
        props.put("comentario", dto.getComentario()+ "");
        return new UserB(props);
    }
    @Override
    protected UserDTO convertBeanToDto(UserB bean) {
        UserDTO dto = new UserDTO();
        dto.setId(bean.getId());
        dto.setName(bean.getName());
        dto.setLastName(bean.getLast_name());
        dto.setAddress(bean.getAddress());
        dto.setEmail(bean.getEmail());
        dto.setPassword(bean.getPassword());
        dto.setDocument(bean.getDocument());
        dto.setComentario(bean.getComentario());
        return dto;
    }
    @Override
    public void delete(int id) {
        userResource.delete(id);
    }

    @Override
    public UserB save(UserB bean) {
        UserDTO dto = userResource.save(convertBeanToDto(bean));
        return convertDtoToBean(dto);
    }
    @Override
    public List<UserB> getAll(Integer page) {
        UserResult users = userResource.getAll(page);
        List<UserB> userBeans = new ArrayList<>();
        users.getUsers().forEach(userDTO -> userBeans.add(convertDtoToBean(userDTO)));
        return userBeans;
    }
    @Override
    public UserB getById(Integer id) {
        UserDTO dto = userResource.getById(id);
        return convertDtoToBean(dto);
    }
}
