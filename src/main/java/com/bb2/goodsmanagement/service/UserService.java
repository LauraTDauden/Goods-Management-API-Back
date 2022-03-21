package com.bb2.goodsmanagement.service;

import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> userList () {
        return userRepository.findAll();

    }

}
