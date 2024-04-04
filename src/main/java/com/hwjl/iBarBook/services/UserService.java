package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.user.UserRepository;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
