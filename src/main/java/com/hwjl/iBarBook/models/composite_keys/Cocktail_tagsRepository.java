package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Cocktail_tagsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cocktail_tagsRepository extends JpaRepository<Cocktail_tags, Cocktail_tagsId> {
}