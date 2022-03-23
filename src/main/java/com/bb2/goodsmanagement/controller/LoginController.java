package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.domain.RoleEnum;
import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.service.implementations.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class LoginController {

    @Autowired
    private UserService service;

    private static final Gson gson = new Gson();


    @GetMapping("/login")
    public User getUserbyUsername(String username){
        return service.getUserByUserName(username);
    }


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @CrossOrigin
    @PostMapping("/users")
    public void createUser (@RequestBody User user) throws URISyntaxException {
        if(user.getRole() == null)
            user.setRole(RoleEnum.MEMBER);
        service.createUser(user);
    }

    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<String> requestLogin (@RequestBody User user) throws URISyntaxException {
        String res = service.requestLogin(user);
        return ResponseEntity.ok(gson.toJson(res));
    }

}