package com.hwjl.iBarBook.models.ingredients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {


    @Query(
            value = "SELECT i.ingredient_id, i.description, i.ingredient_name FROM ingredients i JOIN ingredients_store ins ON i.ingredient_id = ins.ingredient_id WHERE ins.user_id = ?1",
            nativeQuery = true)
    List<Ingredient> findIngredientsByUserId(Long id);

    @Query(
            value = "SELECT i.ingredient_id, i.description, i.ingredient_name FROM ingredients i JOIN ingredient_cocktail ic ON i.ingredient_id = ic.ingredient_id WHERE ic.cocktail_id = ?1",
            nativeQuery = true)
    List<Ingredient> findIngredientsByCocktailId(Long id);
}