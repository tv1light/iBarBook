package com.hwjl.iBarBook.models.user;

import com.hwjl.iBarBook.models.roles.Role;
import com.hwjl.iBarBook.models.roles.RoleRepository;
import com.hwjl.iBarBook.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;
import java.util.List;


public class UserDetailsImpl implements UserDetails {

    private final User user;
    private final RoleService roleService;

    @Autowired
    public UserDetailsImpl(User user, RoleService roleService){
        this.user = user;
        this.roleService = roleService;
    }

    @Bean
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roleService.findByUserId(user.getId());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
