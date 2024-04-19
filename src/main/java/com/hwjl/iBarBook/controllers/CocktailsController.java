package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;

import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.services.CocktailService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/cocktails")
@AllArgsConstructor
public class CocktailsController {
    private final CocktailService cocktailService;

    @GetMapping("/")
    public List<Cocktail> cocktails(){
        return cocktailService.findAllCocktails();
    }

    @GetMapping("/{id}")
    public Optional<Cocktail> cocktails(@PathVariable("id") Long id){
        Optional<Cocktail> cok = cocktailService.findById(id);
        return cocktailService.findById(id);
    }

    @GetMapping("/{id}/ingredients")
    public List<Ingredient> IngredientsInCocktail(@PathVariable("id") Long id){
        return cocktailService.IngredientsInCocktail(id);
    }

//    @PostMapping("add_cocktail")
//    public Cocktail addCocktail(@RequestBody Cocktail cocktail){
//        return cocktailService.addCocktail(cocktail);
//    }
}

//    @RequestMapping("/map")
//    public String map(@RequestBody SampleObject sampleObject){
//        return sampleObject.b + sampleObject.c;
//    }
//class SampleObject{
//    public String b;
//    public String c;
//}
