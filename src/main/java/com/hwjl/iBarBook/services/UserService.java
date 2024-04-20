package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.models.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

 @SuppressWarnings("unused")
@Service
@AllArgsConstructor
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

    public User updateUser(Long id, User updatedUser) {
        User exUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        exUser.setEmail(updatedUser.getEmail());
        exUser.setUsername(updatedUser.getUsername());
        exUser.setPassword(updatedUser.getPassword());
        return userRepository.save(exUser);
    }

    @Transactional
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User has been deleted";
    }
}
