package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.service.implementations.SupplierService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class SupplierController {

    @Autowired
    private SupplierService service;

    private static final Gson gson = new Gson();

    @GetMapping ("/suppliers")
    public List<Supplier> getSuppliers(){
        return service.getAllSuppliers();
    }
}
