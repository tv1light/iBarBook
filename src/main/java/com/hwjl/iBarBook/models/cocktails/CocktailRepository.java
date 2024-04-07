package com.hwjl.iBarBook.models.cocktails;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;


public interface CocktailRepository extends JpaRepository<Cocktail, Long> {

    @Query(
            value = "SELECT ingredient_name, quantity FROM ingredients JOIN ingredient_cocktail ic ON ingredients.ingredient_id = ic.ingredient_id WHERE ic.cocktail_id = ?1",
            nativeQuery = true)
    List<String> findIngredients(Long id);
}