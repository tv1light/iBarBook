package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.User_roleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_roleRepository extends JpaRepository<User_role, User_roleId> {
}