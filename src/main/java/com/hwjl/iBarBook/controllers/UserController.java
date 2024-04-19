package com.hwjl.iBarBook.controllers;


import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.services.IngredientService;
import com.hwjl.iBarBook.services.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final IngredientService ingredientService;


    @GetMapping()
    public List<User> users(){
        return userService.findAll();
    }

    @GetMapping("/ingredients/{id}")
    public List<Ingredient> ingredient(@PathVariable("id") Long id){
        return ingredientService.findByUserId(id);
    }

    @PostMapping("registration")
    public User registration(@RequestBody User user){
        return userService.save(user);
    }
}
