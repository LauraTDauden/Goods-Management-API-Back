package com.goodsmanagement.domain;

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
}
