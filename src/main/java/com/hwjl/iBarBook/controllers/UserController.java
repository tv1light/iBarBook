package com.hwjl.iBarBook.controllers;


import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.services.IngredientService;
import com.hwjl.iBarBook.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final IngredientService ingredientService;


    public UserController(UserService userService, IngredientService ingredientService) {
        this.userService = userService;
        this.ingredientService = ingredientService;
    }


    @GetMapping("/")
    public List<User> users(){
        return userService.findAll();
    }

    @GetMapping("/ingredients/{id}")
    public List<Ingredient> ingredient(@PathVariable("id") Long id){
        return ingredientService.findByUserId(id);
    }
}
