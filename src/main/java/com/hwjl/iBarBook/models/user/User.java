package com.hwjl.iBarBook.models.user;

import jakarta.persistence.*;


@SuppressWarnings("unused")
@Entity(name = "User")
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false, unique = true)
    private String password;
}
