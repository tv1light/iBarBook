package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;
import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktailRepository;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;

import com.hwjl.iBarBook.models.tags.Cocktail_tag;
import com.hwjl.iBarBook.models.tags.Cocktail_tagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;
    private final Cocktail_tagRepository cocktailTagRepository;

    private final IngredientRepository ingredientRepository;
    private final Ingredient_cocktailRepository ingredient_cocktailRepository;

    public Cocktail findById(Long Id){
        Optional<Cocktail> optionalCocktail = cocktailRepository.findById(Id);
        Cocktail cocktail = new Cocktail();
        if (optionalCocktail.isPresent()) {
            cocktail = optionalCocktail.get();
            cocktail.setIngredients(ingredientRepository.findIngredientsByCocktailId(cocktail.getId()));
        }
        return cocktail;
    }

    public List<Cocktail> findAll(){
        List<Cocktail> cocktails = cocktailRepository.findAll();
        cocktails.forEach(cocktail -> cocktail.setIngredients(ingredientRepository.findIngredientsByCocktailId(cocktail.getId())));
        return cocktails;
    }

    public Cocktail save(Cocktail cocktail){
        return cocktailRepository.save(cocktail);
    }

    public List<Ingredient> IngredientsInCocktail(Long Id) {
        return ingredientRepository.findIngredientsByCocktailId(Id);
    }

    public Cocktail updateCocktail(Long id, Cocktail updatedCocktail) {
        Cocktail exCocktail = cocktailRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cocktail not found"));
        exCocktail.setName(updatedCocktail.getName());
        exCocktail.setDescription(updatedCocktail.getDescription());
        exCocktail.setRecipe(updatedCocktail.getRecipe());
        return cocktailRepository.save(exCocktail);
    }

    @Transactional
    public String deleteCocktail(Long id) {
        cocktailRepository.deleteById(id);
        return "Cocktail has been deleted";
    }

    public List<Cocktail_tag> findAllTags() {
        return cocktailTagRepository.findAll();
    }


    public List<Cocktail_tag> findTagsByCocktailId(Long id) {
        return cocktailTagRepository.findTagsByCocktailId(id);
    }
}
