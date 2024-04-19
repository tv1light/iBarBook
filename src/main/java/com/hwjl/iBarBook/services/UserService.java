package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.models.user.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
@Data
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
