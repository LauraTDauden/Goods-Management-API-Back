package com.bb2.goodsmanagement.service;

import com.bb2.goodsmanagement.domain.Item;
import com.bb2.goodsmanagement.domain.PriceReduction;
import com.bb2.goodsmanagement.repository.ItemRepository;
import com.bb2.goodsmanagement.repository.PriceReductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceReductionService {

    @Autowired
    private PriceReductionRepository priceReductionRepository;

    public List<PriceReduction> priceReductionList () {
        return priceReductionRepository.findAll();

    }

}
