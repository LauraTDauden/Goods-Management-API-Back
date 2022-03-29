package com.bb2.goodsmanagement.repository;

import com.bb2.goodsmanagement.domain.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Supplier findByName(@Param("name")String name);
}
