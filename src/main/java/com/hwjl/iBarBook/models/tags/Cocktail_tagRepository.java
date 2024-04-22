package com.hwjl.iBarBook.models.tags;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Cocktail_tagRepository extends JpaRepository<Cocktail_tag, Long> {

    @Query(value = "SELECT ct.id, ct.name FROM cocktail_tag ct JOIN cocktail_tags cts ON ct.id = cts.tag_id WHERE cts.cocktail_id = ?1",
    nativeQuery = true)
    List<Cocktail_tag> findTagsByCocktailId(Long id);
}