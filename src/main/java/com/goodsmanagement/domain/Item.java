package com.goodsmanagement.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table (name="Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long item_id;

    @Column
    private long item_code;

    @Column
    private String description;

    @Column
    private double price;

    @Enumerated(EnumType.ORDINAL)
    private ItemStateEnum state;

    @ManyToMany
    private Set<Supplier> suppliers;

    @OneToMany
    private Set <PriceReduction> price_reductions;

    @Column
    private Date creation_date;

    @ManyToOne
    private User creator;

    public Item() {

    }

    public Item(long item_code, String description, double price, ItemStateEnum state,
                Set<Supplier> suppliers, Set<PriceReduction> price_reductions,
                Date creation_date, User creator) {
        this.item_code = item_code;
        this.description = description;
        this.price = price;
        this.state = state;
        this.suppliers = suppliers;
        this.price_reductions = price_reductions;
        this.creation_date = creation_date;
        this.creator = creator;
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

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Set<PriceReduction> getPrice_reductions() {
        return price_reductions;
    }

    public void setPrice_reductions(Set<PriceReduction> price_reductions) {
        this.price_reductions = price_reductions;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
