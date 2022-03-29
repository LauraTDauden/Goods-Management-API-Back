package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.converter.DeactivationReasonConverter;
import com.bb2.goodsmanagement.converter.ItemConverter;
import com.bb2.goodsmanagement.converter.UserConverter;
import com.bb2.goodsmanagement.domain.*;
import com.bb2.goodsmanagement.dto.DeactivationReasonDTO;
import com.bb2.goodsmanagement.dto.ItemDTO;
import com.bb2.goodsmanagement.dto.PriceReductionDTO;
import com.bb2.goodsmanagement.dto.SupplierDTO;
import com.bb2.goodsmanagement.repository.DeactivationReasonRepository;
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

    @Autowired
    private UserService userService;

    @Autowired
    private DeactivationReasonRepository reasonRepository;

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
    public String createItem(ItemDTO itemDTO) {
        String message = "";

        try{
            itemDTO.setCreation_date(new Timestamp(System.currentTimeMillis()));
            itemDTO.setItem_id(0);
            itemDTO.getCreator().setRole(RoleEnum.MEMBER);
            itemDTO.getCreator().setPassword("");
            itemDTO.getCreator().setUser_id(0);
            Item item = ItemConverter.DTO2Pojo(itemDTO);
            User user = userService.getUserByUserName(item.getCreator().getUsername());
            item.setCreator(user);
            itemRepository.save(item);
            message = "1";
        } catch (Exception e){
            message = "0";
        }
            return message;
    }

    @Override
    public String updateItem(long id, ItemDTO newItem) {
        String message = "";
        try{
            Item item = itemRepository.findById(id).get();
            Item dto = ItemConverter.DTO2Pojo(newItem);
            item.setDescription(dto.getDescription());
            item.setPrice(dto.getPrice());
            item.setSuppliers(dto.getSuppliers());
            item.setPrice_reductions(dto.getPrice_reductions());
            item.setCreation_date(dto.getCreation_date());
            itemRepository.save(item);
            message = "Successfully updated.";
        } catch (Exception e) {
            message = "Item could not be updated.";
        }
            return message;
    }

    @Override
    public String deactivateItem(long id, DeactivationReasonDTO reasonDTO) {
        String message = "";
        try{
            Item item = itemRepository.findById(id).get();
            item.setState(ItemStateEnum.DISCONTINUED);
            DeactivationReason deactivationReason = DeactivationReasonConverter.DTO2Pojo(reasonDTO);
            deactivationReason.setDeactivatedItem(item);
            itemRepository.save(item);
            reasonRepository.save(deactivationReason);
            message = "Item deactivated.";
        } catch (Exception e){
            message = "Item couldn't be deactivated.";
        }
            return message;
    }

    @Override
    public String deleteItem(long id) {
        String message = "";
        try{
            Item item = itemRepository.findById(id).get();
            itemRepository.delete(item);
            message = "Item deleted.";
        } catch (Exception e){
            message = "Item could not be deleted.";
        }
        return message;
    }

    @Override
    public String addSupplier(long id, SupplierDTO supplier) {
        String message = "";
                try{
                    message = "Supplier added.";
                }catch (Exception e){
                    message = "Supplier could not be added to item.";
                }
                return message;
    }

    @Override
    public String priceReduction(long id, PriceReductionDTO priceReduction) {
        String message = "";
        try{
            message = "Price reduction added.";
        }catch (Exception e){
            message = "Price reduction could not be added to item.";
        }
        return message;
    }
}
