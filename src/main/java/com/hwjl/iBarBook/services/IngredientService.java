package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public Optional<Ingredient> findById(Long id){
        return ingredientRepository.findById(id);
    }

    public List<Ingredient> findAll(){
        return ingredientRepository.findAll();
    }

    public List<Ingredient> findByUserId(Long id){
        return ingredientRepository.findIngredientsByUserId(id);
    }

}
