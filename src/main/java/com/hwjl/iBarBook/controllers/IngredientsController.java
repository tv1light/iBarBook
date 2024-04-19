package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.services.IngredientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/ingredients")
@AllArgsConstructor
public class IngredientsController {
    private final IngredientService ingredientService;

    @GetMapping("/")
    public List<Ingredient> ingredients(){
        return ingredientService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ingredient> ingredient(@PathVariable("id") Long id){
        return ingredientService.findById(id);
    }


}