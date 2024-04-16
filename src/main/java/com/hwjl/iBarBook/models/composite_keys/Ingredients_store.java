package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredients_storeId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@IdClass(Ingredients_storeId.class)
public class Ingredients_store {
    @Id
    private Long user_id;

    @Id
    private Long ingredient_id;
}
