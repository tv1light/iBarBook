package com.hwjl.iBarBook.models.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM public.users WHERE username = ?1",
            nativeQuery = true)
    Optional<User> findByUsername(String username);

    User findByEmail(String email);
}