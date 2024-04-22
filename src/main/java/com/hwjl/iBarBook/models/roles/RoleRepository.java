package com.hwjl.iBarBook.models.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query(
            value = "SELECT r.id, r.name FROM roles r JOIN user_role ur ON r.id = ur.user_id WHERE ur.user_id = ?1",
            nativeQuery = true)
    List<Role> findByUserId(Long id);
}