package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.converter.DeactivationReasonConverter;
import com.bb2.goodsmanagement.converter.ItemConverter;
import com.bb2.goodsmanagement.converter.SupplierConverter;
import com.bb2.goodsmanagement.domain.*;
import com.bb2.goodsmanagement.dto.DeactivationReasonDTO;
import com.bb2.goodsmanagement.dto.ItemDTO;
import com.bb2.goodsmanagement.dto.PriceReductionDTO;
import com.bb2.goodsmanagement.dto.SupplierDTO;
import com.bb2.goodsmanagement.repository.*;
import com.bb2.goodsmanagement.service.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ItemService implements IItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private PriceReductionService priceReductionService;

    @Autowired
    private DeactivationReasonRepository reasonRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private PriceReductionRepository priceReductionRepository;

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


            Set<Supplier> suppliers = item.getSuppliers();
            for(Supplier sup: dto.getSuppliers()){
                Supplier supplier;
                if (sup.getSupplier_id() != 0){
                    supplier = new Supplier();
                    supplier = supplierService.getSupplierById(sup.getSupplier_id());
                } else {
                    supplier = new Supplier();
                    supplier.setName(sup.getName());
                    supplier.setCountry(sup.getCountry());
                    supplierRepository.save(supplier);
                }
                Supplier newSupplier = supplierService.getSupplierByName(supplier.getName());
                suppliers.add(newSupplier);
            }
            item.setDescription(dto.getDescription());
            item.setPrice(dto.getPrice());

            Set<PriceReduction> prices = item.getPrice_reductions();
            for(PriceReduction priceR: dto.getPrice_reductions()){
                PriceReduction priceReduction;
                if (priceR.getPriceReduction_id() != 0){
                    priceReduction = new PriceReduction();
                    priceReduction = priceReductionService.getPriceReductionById(priceR.getPriceReduction_id());
                } else {
                    priceReduction = new PriceReduction();
                    priceReduction.setReduced_price(priceR.getReduced_price());
                    priceReduction.setStart_date(priceR.getStart_date());
                    priceReduction.setEnd_date(priceR.getEnd_date());
                    priceReductionRepository.save(priceReduction);
                }
                prices.add(priceReduction);
            }
            itemRepository.save(item);
            //message = "Successfully updated.";
            message ="1";
        } catch (Exception e) {
            //message = "Item could not be updated.";
            message = "0";
        }
            return message;
    }

    @Override
    public String deactivateItem(long id, DeactivationReasonDTO reasonDTO, String username) {
        String message = "";
        try{
            Item item = itemRepository.findById(id).get();
            User user = userService.getUserByUserName(username);
            item.setState(ItemStateEnum.DISCONTINUED);
            DeactivationReason deactivationReason = DeactivationReasonConverter.DTO2Pojo(reasonDTO);
            deactivationReason.setDeactivatedItem(item);
            deactivationReason.setUser(user);
            reasonRepository.save(deactivationReason);
            itemRepository.save(item);
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
                    Item item = itemRepository.findById(id).get();
                    if(item.getSuppliers() == null){
                        item.setSuppliers(new HashSet<>());
                    }
                    item.addSupplier(SupplierConverter.DTO2Pojo(supplier));
                    itemRepository.save(item);
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

    @Override
    public List<Supplier> getAllItemSuppliers(long id) {
        Item item = getItemById(id);
        List<Supplier> suppliers = new ArrayList<>(item.getSuppliers());
        return suppliers;
    }

    @Override
    public List<PriceReduction> getAllItemPriceReductions(long id) {
        Item item = getItemById(id);
        List<PriceReduction> prices = new ArrayList<>(item.getPrice_reductions());
        return prices;

    }
}
