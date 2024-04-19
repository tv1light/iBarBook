package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredients_storeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Ingredients_storeRepository extends JpaRepository<Ingredients_store, Ingredients_storeId> {
}