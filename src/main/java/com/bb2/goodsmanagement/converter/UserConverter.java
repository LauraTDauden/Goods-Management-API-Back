package com.bb2.goodsmanagement.converter;

import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.dto.UserDTO;

public class UserConverter {

    public User DTO2pojo (UserDTO dto){
        User user = new User();
        user.setUser_id(dto.getUser_id());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());

        return user;
    }

    public UserDTO Pojo2DTO (User user){
        UserDTO dto = new UserDTO();
        dto.setUser_id(user.getUser_id());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());

        return dto;
    }
}
