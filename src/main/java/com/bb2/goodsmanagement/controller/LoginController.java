package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.domain.User;
import com.bb2.goodsmanagement.service.implementations.ItemService;
import com.bb2.goodsmanagement.service.implementations.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class LoginController {

    @Autowired
    private UserService service;

    /*
    @GetMapping("/login")
    public User getUserbyUsername(String username){

    }*/

}