package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.models.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }
}
