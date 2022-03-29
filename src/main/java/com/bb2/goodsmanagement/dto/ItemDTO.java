package com.bb2.goodsmanagement.dto;

import com.bb2.goodsmanagement.domain.ItemStateEnum;
import com.bb2.goodsmanagement.domain.PriceReduction;
import com.bb2.goodsmanagement.domain.Supplier;
import java.util.Date;
import java.util.Set;

public class ItemDTO {


    private long item_id;
    private long item_code;
    private String description;
    private double price;
    private ItemStateEnum state;
    private Set<SupplierDTO> suppliers;
    private Set <PriceReductionDTO> price_reductions;
    private Date creation_date;
    private UserDTO creator;

    public ItemDTO() {
        this.item_id = 0;
        this.item_code = 0;
        this.description = null;
        this.price = 0;
        this.state = ItemStateEnum.ACTIVE;
        this.suppliers = null;
        this.price_reductions = null;
        this.creation_date = null;
        this.creator = null;
    }

    public long getItem_id() {
        return item_id;
    }

    public void setItem_id(long item_id) {
        this.item_id = item_id;
    }

    public long getItem_code() {
        return item_code;
    }

    public void setItem_code(long item_code) {
        this.item_code = item_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemStateEnum getState() {
        return state;
    }

    public void setState(ItemStateEnum state) {
        this.state = state;
    }

    public Set<SupplierDTO> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<SupplierDTO> suppliers) {
        this.suppliers = suppliers;
    }

    public Set<PriceReductionDTO> getPrice_reductions() {
        return price_reductions;
    }

    public void setPrice_reductions(Set<PriceReductionDTO> price_reductions) {
        this.price_reductions = price_reductions;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public UserDTO getCreator() {
        return creator;
    }

    public void setCreator(UserDTO creator) {
        this.creator = creator;
    }
}
