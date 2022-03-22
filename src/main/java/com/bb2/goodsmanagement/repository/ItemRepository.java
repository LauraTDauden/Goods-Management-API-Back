package com.bb2.goodsmanagement.repository;

import com.bb2.goodsmanagement.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository <Item, Long> {
}
