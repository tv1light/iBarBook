package com.hwjl.iBarBook.models.tags;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Ingredient_tagRepository extends JpaRepository<Ingredient_tag, Long> {
    @Query(value = "SELECT it.id, it.name FROM ingredient_tag it JOIN ingredient_tags its ON it.id = its.tag_id WHERE its.ingredient_id = ?1",
            nativeQuery = true)
    List<Ingredient_tag> findByIngredientId(Long id);
    //List<Ingredient_tag> findTagsByCocktailId(Long id);
}