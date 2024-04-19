package com.hwjl.iBarBook.models.cocktails;


import com.hwjl.iBarBook.models.ingredients.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;


public interface CocktailRepository extends JpaRepository<Cocktail, Long> {

    @Query(
            value = "SELECT i.id, i.description, i.name FROM ingredients i JOIN ingredient_cocktail ic ON i.id = ic.ingredient_id WHERE ic.cocktail_id = ?1",
            nativeQuery = true)
    List<Ingredient> findIngredientsByCocktailId(Long id); //add quantity position to display


}