package com.hwjl.iBarBook.models.tags;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Ingredient_tagRepository extends JpaRepository<Ingredient_tag, Long> {
    //List<Ingredient_tag> findTagsByCocktailId(Long id);
}