package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;

import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;
    private final IngredientRepository ingredientRepository;

    public CocktailService(CocktailRepository cocktailRepository, IngredientRepository ingredientRepository) {
        this.cocktailRepository = cocktailRepository;
        this.ingredientRepository = ingredientRepository;
    }

    public Optional<Cocktail> findById(Long Id){
        return cocktailRepository.findById(Id);
    }

    public List<Cocktail> findAllCocktails(){
        return cocktailRepository.findAll();
    }

   public List<Ingredient> IngredientsInCocktail(Long Id) {
       return ingredientRepository.findIngredientsByCocktailId(Id);
   }



}
