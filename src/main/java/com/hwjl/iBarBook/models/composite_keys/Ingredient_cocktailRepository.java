package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredient_cocktailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ingredient_cocktailRepository extends JpaRepository<Ingredient_cocktail, Ingredient_cocktailId> {
}