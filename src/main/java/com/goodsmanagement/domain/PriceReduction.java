package com.goodsmanagement.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PriceReduction")
public class PriceReduction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long priceReduction_id;

    @Column
    private double reduced_price;

    @Column
    private Date start_date;

    @Column
    private Date end_date;
}
