package com.bb2.goodsmanagement.service.interfaces;

import com.bb2.goodsmanagement.domain.Item;

import java.util.List;

public interface IItemService {
    List<Item> getAllItems();

    Item getItemById(Long id);

    void createItem(Item item);

    void updateItem (long id, Item newItem);

    void deactivateItem (long id);

    //Only Admin role may do this
    void deleteItem (long id);


}
