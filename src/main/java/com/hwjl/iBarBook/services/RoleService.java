package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.roles.RoleRepository;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
}
