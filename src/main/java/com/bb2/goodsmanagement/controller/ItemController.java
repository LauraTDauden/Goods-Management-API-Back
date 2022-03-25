package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.service.implementations.ItemService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping
public class ItemController {

    @Autowired
    private ItemService service;

    private static final Gson gson = new Gson();

    @GetMapping ("/items")
    public List<Item> getItems(){
        return service.getAllItems();
    }

    @GetMapping ("/items/{id}")
    public Item getItemById(@PathVariable("id") long id){
        return service.getItemById(id);
    }

    @PostMapping ("/items")
    public ResponseEntity<String> createItem (@RequestBody Item item) throws URISyntaxException {
        String res = service.createItem(item);
        return ResponseEntity.ok(gson.toJson(res));

    }

}
