package com.bb2.goodsmanagement.converter;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.dto.ItemDTO;

public class ItemConverter {

    public static Item DTO2Pojo (ItemDTO dto){
        Item item = new Item();
        item.setItem_id(dto.getItem_id());
        item.setItem_code(dto.getItem_code());
        item.setDescription(dto.getDescription());
        item.setState(dto.getState());
        item.setPrice(dto.getPrice());
        item.setPrice_reductions(dto.getPrice_reductions());
        item.setCreation_date(dto.getCreation_date());
        item.setSuppliers(dto.getSuppliers());
        item.setCreator(dto.getCreator());

        return item;
    }

    public static ItemDTO Pojo2DTO (Item item){
        ItemDTO dto = new ItemDTO();
        dto.setItem_id(item.getItem_id());
        dto.setItem_code(item.getItem_code());
        dto.setDescription(item.getDescription());
        dto.setState(item.getState());
        dto.setPrice(item.getPrice());
        dto.setPrice_reductions(item.getPrice_reductions());
        dto.setCreation_date(item.getCreation_date());
        dto.setSuppliers(item.getSuppliers());
        dto.setCreator(item.getCreator());

        return dto;
    }
}
