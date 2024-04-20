package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
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
        ingredientRepository.deleteById(id);
        return "Ingredient has been deleted";
    }
}

