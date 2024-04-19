package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredient_tagsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ingredient_tagsRepository extends JpaRepository<Ingredient_tags, Ingredient_tagsId> {
}