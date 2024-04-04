package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.services.CocktailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CocktailsController {
    private final CocktailService cocktailService;

    public CocktailsController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/")
    public List<Cocktail> cocktails(){
        return cocktailService.findAllCocktails();
    }
}
