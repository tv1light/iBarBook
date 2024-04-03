package com.hwjl.iBarBook.models.roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Role")
@Table(name = "Roles")
public class Role {
    @Id
    @Column(name = "role_id")
    private Long role_id;

    @Column(name = "role_name", nullable = false, unique = true)
    private String role_name;
}
