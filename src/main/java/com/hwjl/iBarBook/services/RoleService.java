package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.roles.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
@AllArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

}
