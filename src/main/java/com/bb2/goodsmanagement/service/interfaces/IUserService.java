package com.bb2.goodsmanagement.service.interfaces;

import com.bb2.goodsmanagement.domain.User;

import java.util.List;

public interface IUserService {

    void createUser (User user);

    String requestLogin (User user);

    void deleteUser (String username);

    List <User> getAllUsers();

    User getUserByUserName (String username);

}
