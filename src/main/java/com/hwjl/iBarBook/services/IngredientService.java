package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;
import com.hwjl.iBarBook.models.composite_keys.Ingredient_tags;
import com.hwjl.iBarBook.models.composite_keys.Ingredient_tagsRepository;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import com.hwjl.iBarBook.models.tags.Ingredient_tag;
import com.hwjl.iBarBook.models.tags.Ingredient_tagRepository;
import com.hwjl.iBarBook.services.tag_services.IngredientTagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
@AllArgsConstructor
public class IngredientService {
    private final IngredientRepository ingredientRepository;
    private final Ingredient_tagRepository ingredientTagRepository;
    private final Ingredient_tagsRepository ingredientTagsRepository;
    private final CocktailRepository cocktailRepository;

    public Optional<Ingredient> findById(Long id){
        return ingredientRepository.findById(id);
    }

    public List<Ingredient> findAll(){
        return ingredientRepository.findAll();
    }

    public List<Ingredient> findByUserId(Long id){
        return ingredientRepository.findIngredientsByUserId(id);
    }

    public Ingredient save(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
    
    public Ingredient updateIngredient(Long id, Ingredient updatedIngredient) {
        Ingredient existingIngredient = ingredientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ingredient not found"));

        existingIngredient.setName(updatedIngredient.getName());
        existingIngredient.setDescription(updatedIngredient.getDescription());

        return ingredientRepository.save(existingIngredient);
    }

    @Transactional
    public String deleteIngredient(Long id) {
        ingredientTagsRepository.deleteByIngredient_id(id);
        ingredientRepository.deleteById(id);
        return "Ingredient has been deleted";
    }

    public List<Ingredient_tag> findByIngredientId(Long id) {
        return ingredientTagRepository.findByIngredientId(id);
    }

    public List<Long> findCocktailsWithIngredient(Long id) {
        return cocktailRepository.findCocktailsWithIngredient(id);
    }

    public List<Ingredient_tag> findAllTags() {
        return ingredientTagRepository.findAll();
    }
}

