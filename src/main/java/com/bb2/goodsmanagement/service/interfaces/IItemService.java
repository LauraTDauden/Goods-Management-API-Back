package com.bb2.goodsmanagement.service.interfaces;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.dto.DeactivationReasonDTO;
import com.bb2.goodsmanagement.dto.ItemDTO;
import com.bb2.goodsmanagement.dto.PriceReductionDTO;
import com.bb2.goodsmanagement.dto.SupplierDTO;

import java.util.List;

public interface IItemService {
    List<Item> getAllItems();

    Item getItemById(Long id);

    String createItem(ItemDTO itemdto);

    String updateItem (long id, ItemDTO newItem);

    String deactivateItem (long id, DeactivationReasonDTO reason);

    //Only Admin role may do this
    String deleteItem (long id);

    String addSupplier (long id, SupplierDTO supplier);

    String priceReduction (long id, PriceReductionDTO priceReduction);


}
