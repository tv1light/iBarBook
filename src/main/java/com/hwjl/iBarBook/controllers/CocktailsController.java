package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;


import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.tags.Cocktail_tag;
import com.hwjl.iBarBook.services.CocktailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*todo:
   1) Показать коктейли, которые можно приготовить с учетом выбранных ингредиентов
   2) Добавление картинки
*  */

@SuppressWarnings("unused")
@RestController
@RequestMapping("/cocktails")
@AllArgsConstructor
public class CocktailsController {

    private final CocktailService cocktailService;


    @GetMapping("")
    public List<Cocktail> cocktails() {
        return cocktailService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cocktail> cocktails(@PathVariable("id") Long id) {
        return cocktailService.findById(id);

    }

    @PutMapping("/{id}/edit")
    public Cocktail editCocktail(@PathVariable Long id, @RequestBody Cocktail updatedCocktail) {
        return cocktailService.updateCocktail(id, updatedCocktail);
    }

    @PostMapping("/add")
    public Cocktail addCocktail(@RequestBody Cocktail cocktail) {
        return cocktailService.save(cocktail);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCocktail(@PathVariable Long id) {
        return cocktailService.deleteCocktail(id);
    }

    @GetMapping("/{id}/ingredients")
    public List<Ingredient> IngredientsInCocktail(@PathVariable("id") Long id) {
        return cocktailService.IngredientsInCocktail(id);
    }

    @GetMapping("/{id}/tags")
    public List<Cocktail_tag> cocktailTags(@PathVariable("id") Long id) {
        return cocktailService.findTagsByCocktailId(id);
    }

    @GetMapping("/tags")
    public List<Cocktail_tag> tags(){
        return cocktailService.findAllTags();
    }
}

