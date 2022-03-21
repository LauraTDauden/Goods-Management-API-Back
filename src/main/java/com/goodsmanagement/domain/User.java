package com.goodsmanagement.domain;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;

    @Column
    private String username;

    @Column
    private String password;

    @Enumerated(EnumType.ORDINAL)
    private RoleEnum role;
}
