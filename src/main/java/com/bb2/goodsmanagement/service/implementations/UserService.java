package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.repository.UserRepository;
import com.bb2.goodsmanagement.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public void createUser(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUser(String username) {
        repository.delete(
                getUserByUserName(username)
        );
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserByUserName(String username) {
        username = username.toLowerCase();
        return repository.findByUsername(username);
    }
}
