package com.hwjl.iBarBook.models.tags;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Cocktail_tagRepository extends JpaRepository<Cocktail_tag, Long> {
    //List<Cocktail_tag> findTagsByCocktailId(Long id);
}