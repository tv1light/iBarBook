package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }
}
