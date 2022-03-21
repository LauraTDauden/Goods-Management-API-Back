package com.bb2.goodsmanagement.repository;

import com.bb2.goodsmanagement.domain.PriceReduction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceReductionRepository extends JpaRepository<PriceReduction, Long> {
}
