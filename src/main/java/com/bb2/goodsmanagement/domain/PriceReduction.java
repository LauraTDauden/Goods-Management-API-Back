package com.bb2.goodsmanagement.domain;

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

    public PriceReduction() {
    }

    public PriceReduction(long priceReduction_id, double reduced_price,
                          Date start_date, Date end_date) {
        this.priceReduction_id = priceReduction_id;
        this.reduced_price = reduced_price;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public long getPriceReduction_id() {
        return priceReduction_id;
    }

    public void setPriceReduction_id(long priceReduction_id) {
        this.priceReduction_id = priceReduction_id;
    }

    public double getReduced_price() {
        return reduced_price;
    }

    public void setReduced_price(double reduced_price) {
        this.reduced_price = reduced_price;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
