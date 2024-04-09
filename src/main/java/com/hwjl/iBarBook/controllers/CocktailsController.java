package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;

import com.hwjl.iBarBook.services.CocktailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/cocktails")
public class CocktailsController {
    private final CocktailService cocktailService;

    public CocktailsController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/")
    public List<Cocktail> cocktails(){
        return cocktailService.findAllCocktails();
    }

    @GetMapping("/{id}")
    public Optional<Cocktail> cocktails(@PathVariable("id") Long id){
        Optional<Cocktail> cok = cocktailService.findById(id);
        return cocktailService.findById(id);
    }

//    @GetMapping("/{id}/ingredients")
//    public List<String> ingredientsInCocktail(@PathVariable("id") Long id){
//
//        return cocktailService.IngredientsInCocktail(id);
//    }
}
