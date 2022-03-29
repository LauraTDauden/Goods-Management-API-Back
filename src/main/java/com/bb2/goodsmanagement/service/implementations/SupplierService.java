package com.bb2.goodsmanagement.service.implementations;

import com.bb2.goodsmanagement.converter.SupplierConverter;
import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.dto.SupplierDTO;
import com.bb2.goodsmanagement.repository.SupplierRepository;
import com.bb2.goodsmanagement.service.interfaces.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Supplier> getAllSuppliers() {
        return repository.findAll();
    }

    @Override
    public Supplier getSupplierByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Supplier getSupplierById(Long id) {
        return repository.getById(id);
    }

    @Override
    public String createSupplier(SupplierDTO supplierDTO) {
        String message = "";
        try{
            Supplier supplier = SupplierConverter.DTO2Pojo(supplierDTO);
            repository.save(supplier);
            message = "Supplier created.";
        } catch (Exception e){
            message = "Supplier could not be created.";
        }
        return message;

    }
}
