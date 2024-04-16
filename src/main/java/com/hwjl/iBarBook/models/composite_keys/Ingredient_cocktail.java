package com.hwjl.iBarBook.models.composite_keys;


import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredient_cocktailId;
import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredients_storeId;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@IdClass(Ingredient_cocktailId.class)
public class Ingredient_cocktail {//переделать нахуй

    @Id
    private Long cocktail_id;

    @Id
    private Long ingredient_id;

    @Column(name = "quantity")
    private int quantity;
}
