package com.bb2.goodsmanagement.repository;

import com.bb2.goodsmanagement.domain.DeactivationReason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeactivationReasonRepository extends JpaRepository <DeactivationReason, Long> {
}
