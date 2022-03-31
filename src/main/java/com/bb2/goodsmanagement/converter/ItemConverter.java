package com.bb2.goodsmanagement.converter;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.domain.PriceReduction;
import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.dto.ItemDTO;
import com.bb2.goodsmanagement.dto.PriceReductionDTO;
import com.bb2.goodsmanagement.dto.SupplierDTO;
import com.bb2.goodsmanagement.dto.UserDTO;

import java.util.HashSet;

public class ItemConverter {


    public static Item DTO2Pojo (ItemDTO dto){
        Item item = new Item();
        item.setItem_id(dto.getItem_id());
        item.setItem_code(dto.getItem_code());
        item.setDescription(dto.getDescription());
        item.setState(dto.getState());
        item.setPrice(dto.getPrice());
        item.setCreation_date(dto.getCreation_date());
        UserDTO userdto = dto.getCreator();
        item.setCreator(UserConverter.DTO2pojo(userdto));

        if(dto.getSuppliers() != null){
            item.setSuppliers(new HashSet<>());
            for(SupplierDTO supplier: dto.getSuppliers()){
                item.getSuppliers().add(SupplierConverter.DTO2Pojo(supplier));
            }
        }

        if(dto.getPrice_reductions() != null){
            item.setPrice_reductions(new HashSet<>());
            for(PriceReductionDTO price: dto.getPrice_reductions()){
                item.getPrice_reductions().add(PriceReductionConverter.DTO2Pojo(price));
            }
        }

        return item;
    }

  /*  public static ItemDTO Pojo2DTO (Item item){
        ItemDTO dto = new ItemDTO();
        dto.setItem_id(item.getItem_id());
        dto.setItem_code(item.getItem_code());
        dto.setDescription(item.getDescription());
        dto.setState(item.getState());
        dto.setPrice(item.getPrice());
        Set<PriceReductionDTO> pricedto = item.getPrice_reductions();
        dto.setPrice_reductions(PriceReductionConverter.Pojo2DTO(pricedto));
        dto.setCreation_date(item.getCreation_date());
        dto.setSuppliers(item.getSuppliers());
        User user = item.getCreator();
        dto.setCreator(UserConverter.Pojo2DTO(user));

        return dto;
    }*/
}
