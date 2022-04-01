package com.bb2.goodsmanagement.controller;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.domain.PriceReduction;
import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.dto.DeactivationReasonDTO;
import com.bb2.goodsmanagement.dto.ItemDTO;
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

    @GetMapping ("/items/{id}/suppliers")
    public List<Supplier> getAllItemSuppliers (@PathVariable("id")long id){
        return service.getAllItemSuppliers(id);
    }

    @GetMapping ("/items/{id}/prices")
    public List<PriceReduction> getAllItemPriceReductions (@PathVariable("id")long id){
        return service.getAllItemPriceReductions(id);
    }

    @CrossOrigin
    @PostMapping ("/items")
    public ResponseEntity<String> createItem (@RequestBody ItemDTO item) throws URISyntaxException {
        String res = service.createItem(item);
        return ResponseEntity.ok(gson.toJson(res));
    }

    @CrossOrigin
    @PutMapping ("/items/{id}")
    public ResponseEntity<String> updateItem (@PathVariable("id") long id, @RequestBody ItemDTO item) throws URISyntaxException {
        String res = service.updateItem(id, item);
        return ResponseEntity.ok(gson.toJson(res));
    }

    @CrossOrigin
    @PutMapping ("/items/{id}/deactivate")
    public ResponseEntity<String> deactivateItem (@PathVariable("id") long id, @RequestBody DeactivationReasonDTO reason,
                                                  @RequestParam (name = "username") String username) throws URISyntaxException {
        String res = service.deactivateItem(id, reason, username);
        return ResponseEntity.ok(gson.toJson(res));
    }

    @CrossOrigin
    @DeleteMapping ("/items/{id}")
    public ResponseEntity<String> deleteItem (@PathVariable ("id") long id)  throws URISyntaxException {
        String res = service.deleteItem(id);
        return ResponseEntity.ok(gson.toJson(res));
    }
}
