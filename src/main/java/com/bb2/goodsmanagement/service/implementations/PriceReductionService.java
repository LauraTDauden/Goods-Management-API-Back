package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.domain.PriceReduction;
import com.bb2.goodsmanagement.repository.PriceReductionRepository;
import com.bb2.goodsmanagement.service.interfaces.IPriceReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceReductionService implements IPriceReductionService {

    @Autowired
    private PriceReductionRepository priceReductionRepository;

    public List<PriceReduction> priceReductionList () {
        return priceReductionRepository.findAll();
    }

    @Override
    public PriceReduction getPriceReductionById(Long id) {
        return priceReductionRepository.getById(id);
    }

}
