package com.hwjl.iBarBook.controllers;


import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.services.IngredientService;
import com.hwjl.iBarBook.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final IngredientService ingredientService;

    @GetMapping("")
    public List<User> users(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> user(Long id){
        return userService.findById(id);
    }

    @PostMapping("/registration")
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/{id}/edit")
    public User editUser(@PathVariable Long id, @RequestBody User updatedUser){
        return userService.updateUser(id, updatedUser);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(Long id){
        return userService.deleteUser(id);
    }

    @GetMapping("/{id}/ingredients")
    public List<Ingredient> ingredient(@PathVariable("id") Long id){
        return ingredientService.findByUserId(id);
    }
}
