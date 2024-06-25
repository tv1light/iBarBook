package com.hwjl.iBarBook.models.user;

import jakarta.persistence.*;
import lombok.Data;


@SuppressWarnings("unused")
@Entity
@Data
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

}
