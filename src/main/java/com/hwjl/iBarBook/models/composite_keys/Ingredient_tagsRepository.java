package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredient_tagsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface Ingredient_tagsRepository extends JpaRepository<Ingredient_tags, Ingredient_tagsId> {
    @Transactional
    @Modifying
    @Query("delete from Ingredient_tags i where i.ingredient_id = ?1")
    void deleteByIngredient_id(Long ingredient_id);

}