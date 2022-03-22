package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.service.implementations.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping ("/items")
    public List<Item> getItems(){
        return service.getAllItems();
    }

    @GetMapping ("/items/{id}")
    public Item getItemById(@PathVariable("id") long id){
        return service.getItemById(id);
    }


}
