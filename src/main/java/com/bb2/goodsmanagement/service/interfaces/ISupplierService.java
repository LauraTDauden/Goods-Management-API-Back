package com.bb2.goodsmanagement.service.interfaces;

import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.dto.SupplierDTO;

import java.util.List;

public interface ISupplierService {
    List <Supplier> getAllSuppliers();

    Supplier getSupplierByName (String name);

    Supplier getSupplierById (Long id);

    String createSupplier (SupplierDTO supplierDTO);

}
