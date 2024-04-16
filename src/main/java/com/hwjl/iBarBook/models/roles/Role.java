package com.hwjl.iBarBook.models.roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "id")
    private Long role_id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;
}
