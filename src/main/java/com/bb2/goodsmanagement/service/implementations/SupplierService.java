package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> itemList () {
        return supplierRepository.findAll();

    }

}
