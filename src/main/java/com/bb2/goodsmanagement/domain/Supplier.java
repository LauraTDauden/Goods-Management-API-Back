package com.bb2.goodsmanagement.domain;

import javax.persistence.*;

@Entity
@Table(name="Supplier")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long supplier_id;

    @Column
    private String name;

    @Column
    private String country;

    public Supplier() {
    }

    public Supplier(long supplier_id, String name, String country) {
        this.supplier_id = supplier_id;
        this.name = name;
        this.country = country;
    }

    public long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
