package com.bb2.goodsmanagement.service.interfaces;

import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.dto.UserDTO;

import java.util.List;

public interface IUserService {

    String createUser (UserDTO user);

    String requestLogin (User user);

    String deleteUser (User user);

    List <User> getAllUsers();

    User getUserByUserName (String username);

    User getUserById (long id);

}
