package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.roles.Role;
import com.hwjl.iBarBook.models.roles.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("unused")
@AllArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;
//todo Нужен ли мне сервис для ролей
//    public List<Role> findByUserId(Long id){
//        return roleRepository.findByUserId(id);
//    }
}
