package com.bb2.goodsmanagement.dto;

import java.util.Date;

public class PriceReductionDTO {

    private long priceReduction_id;
    private double reduced_price;
    private Date start_date;
    private Date end_date;

    public PriceReductionDTO() {
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
