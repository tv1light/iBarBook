package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;

import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktailRepository;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;
    private final IngredientRepository ingredientRepository;
    private final Ingredient_cocktailRepository ingredient_cocktailRepository;

    public Optional<Cocktail> findById(Long Id){
        return cocktailRepository.findById(Id);
    }

    public List<Cocktail> findAllCocktails(){
        return cocktailRepository.findAll();
    }

   public List<Ingredient> IngredientsInCocktail(Long Id) {
       return ingredientRepository.findIngredientsByCocktailId(Id);
   }

    public Cocktail addCocktail(Cocktail cocktail){
        return cocktailRepository.save(cocktail);
    }

}
