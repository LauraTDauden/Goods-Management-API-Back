package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.converter.UserConverter;
import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.dto.UserDTO;
import com.bb2.goodsmanagement.repository.UserRepository;
import com.bb2.goodsmanagement.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public String createUser(UserDTO userdto) {
        String message = "";
        try{
            User user = new User();
            user = UserConverter.DTO2pojo(userdto);
            user.setUsername(user.getUsername().toLowerCase());
            repository.save(user);
            message = "1";
        } catch (Exception e){
            message = "0";
        } return message;
    }

    @Override
    public String requestLogin(User user) {
        User foundUser = getUserByUserName(user.getUsername());
        if (!Objects.isNull(foundUser)) {
            if (foundUser.getPassword().equals(user.getPassword())) {
                return "Authorized";
            } else {
                return "Unauthorized";
            }

        } else {
            return "No such user";
        }
    }

    @Override
    public String deleteUser(User user) {
        String message = "";
        try{
            repository.delete(user);
            message = "1";
        } catch (Exception e){
            message = "0";
        }
        return message;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserByUserName(String username) {
        try {
            username = username.toLowerCase().trim();
            return repository.findByUsername(username);
        } catch (NullPointerException npe) {
            System.out.println("No such user");
        }
        return null;

    }

    @Override
    public User getUserById(long id) {
        return repository.getById(id);
    }
}
