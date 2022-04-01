package com.bb2.goodsmanagement.converter;
import com.bb2.goodsmanagement.domain.Supplier;
import com.bb2.goodsmanagement.dto.SupplierDTO;

public class SupplierConverter {

    public static Supplier DTO2Pojo (SupplierDTO dto){
        Supplier supplier = new Supplier();
        supplier.setSupplier_id(dto.getSupplier_id());
        supplier.setCountry(dto.getCountry());
        supplier.setName(dto.getName());

        return supplier;
    }

    public static SupplierDTO Pojo2DTO (Supplier supplier){
        SupplierDTO dto = new SupplierDTO();
        dto.setSupplier_id(supplier.getSupplier_id());
        dto.setName(supplier.getName());
        dto.setCountry(supplier.getCountry());

        return dto;
    }
}
