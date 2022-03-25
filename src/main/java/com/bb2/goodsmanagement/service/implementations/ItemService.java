package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.domain.ItemStateEnum;
import com.bb2.goodsmanagement.repository.ItemRepository;
import com.bb2.goodsmanagement.service.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ItemService implements IItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemRepository getItemRepository() {
        return itemRepository;
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item getItemById(Long id){
        return itemRepository.findById(id).get();
    }

    @Override
    public String createItem(Item item) {
        String message = "";
        try{
            item.setCreation_date(new Timestamp(System.currentTimeMillis()));
            itemRepository.save(item);
            message = "Item successfully created";
        } catch (Exception e){
            message = "Item couldn't be created";
        }
            return message;
    }

    @Override
    public void updateItem(long id, Item newItem) {
        Item item = itemRepository.findById(id).get();
        item.setCreator(newItem.getCreator());
        item.setCreation_date(newItem.getCreation_date());
        item.setDescription(newItem.getDescription());
        item.setPrice(newItem.getPrice());
        item.setPrice_reductions(newItem.getPrice_reductions());
        item.setSuppliers(newItem.getSuppliers());
    }

    @Override
    public void deactivateItem(long id) {
        Item item = itemRepository.findById(id).get();
        item.setState(ItemStateEnum.DISCONTINUED);
    }

    @Override
    public void deleteItem(long id) {
        Item item = itemRepository.findById(id).get();
        itemRepository.delete(item);

    }

}
