package com.bb2.goodsmanagement.service.interfaces;

import com.bb2.goodsmanagement.domain.User;

import java.util.List;

public interface IAdminService {

    void createUser (User user);

    void deleteUser (String username);

    List <User> getAllUsers();

}
