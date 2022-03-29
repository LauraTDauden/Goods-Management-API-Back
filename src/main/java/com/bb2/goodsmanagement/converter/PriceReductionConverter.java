package com.bb2.goodsmanagement.converter;

import com.bb2.goodsmanagement.domain.PriceReduction;
import com.bb2.goodsmanagement.dto.PriceReductionDTO;

public class PriceReductionConverter {

    public static PriceReduction DTO2Pojo (PriceReductionDTO dto){
        PriceReduction priceReduction = new PriceReduction();
        priceReduction.setPriceReduction_id(dto.getPriceReduction_id());
        priceReduction.setReduced_price(dto.getReduced_price());
        priceReduction.setStart_date(dto.getStart_date());
        priceReduction.setEnd_date(dto.getEnd_date());

        return priceReduction;

    }

    public static PriceReductionDTO Pojo2DTO (PriceReduction priceReduction){
        PriceReductionDTO dto = new PriceReductionDTO();
        dto.setPriceReduction_id(priceReduction.getPriceReduction_id());
        dto.setReduced_price(priceReduction.getReduced_price());
        dto.setStart_date(priceReduction.getStart_date());
        dto.setEnd_date(priceReduction.getEnd_date());

        return dto;
    }
}
