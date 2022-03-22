package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.converter.ItemConverter;
import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.dto.ItemDTO;
import com.bb2.goodsmanagement.service.implementations.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
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

    @PostMapping ("/items")
    public void createItem (@RequestBody Item item) throws URISyntaxException {
        service.createItem(item);

    }

}
