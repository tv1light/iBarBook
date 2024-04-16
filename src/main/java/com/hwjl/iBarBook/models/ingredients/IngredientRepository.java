package com.hwjl.iBarBook.models.ingredients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {


    @Query(
            value = "SELECT i.id, i.description, i.name FROM ingredients i JOIN ingredients_store ins ON i.id = ins.ingredient_id WHERE ins.user_id = ?1",
            nativeQuery = true)
    List<Ingredient> findIngredientsByUserId(Long id);

    @Query(
            value = "SELECT i.id, i.description, i.name FROM ingredients i JOIN ingredient_cocktail ic ON i.id = ic.ingredient_id WHERE ic.cocktail_id = ?1",
            nativeQuery = true)
    List<Ingredient> findIngredientsByCocktailId(Long id);
}