package com.bb2.goodsmanagement.repository;

import com.bb2.goodsmanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(@Param("username") String username);

    Boolean existsByUsername (String username);
}
