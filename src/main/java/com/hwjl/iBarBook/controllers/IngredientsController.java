package com.hwjl.iBarBook.controllers;


import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.tags.Cocktail_tag;
import com.hwjl.iBarBook.models.tags.Ingredient_tag;
import com.hwjl.iBarBook.services.IngredientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*todo:
*  1) Добавление картинки
*  2) Добавление ингредиента в хранилище пользователя
* */


@SuppressWarnings("unused")
@RestController
@RequestMapping("/ingredients")
@AllArgsConstructor
public class IngredientsController {
    private final IngredientService ingredientService;


    @GetMapping("")
    public List<Ingredient> ingredients(){
        return ingredientService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ingredient> ingredient(@PathVariable Long id){
        return ingredientService.findById(id);
    }

    @PostMapping("/add")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient){
        return ingredientService.save(ingredient);
    }

    @PutMapping("/{id}/edit")
    public Ingredient editIngredient(@PathVariable Long id, @RequestBody Ingredient updatedIngredient){
        return ingredientService.updateIngredient(id, updatedIngredient);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteIngredient(@PathVariable Long id){
        return ingredientService.deleteIngredient(id);
    }

    @GetMapping("/{id}/tags")
    public List<Ingredient_tag> ingredientTags(@PathVariable Long id){
        return ingredientService.findByIngredientId(id);
    }

    @GetMapping("/{id}/cocktails")
    public List<Long> cocktailsWithIngredient(@PathVariable Long id){
        return ingredientService.findCocktailsWithIngredient(id);
    }

    @GetMapping("/tags")
    public List<Ingredient_tag> tags(){
        return ingredientService.findAllTags();
    }
}