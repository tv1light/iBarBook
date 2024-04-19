package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Cocktail_gadgetsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cocktail_gadgetsRepository extends JpaRepository<Cocktail_gadgets, Cocktail_gadgetsId> {
}