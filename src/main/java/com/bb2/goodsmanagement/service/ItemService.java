package com.bb2.goodsmanagement.service;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> itemList () {
        return itemRepository.findAll();

    }

}
