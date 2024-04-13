package com.hwjl.iBarBook.models.composite_keys;


import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import jakarta.persistence.*;

import lombok.NoArgsConstructor;

@SuppressWarnings("LombokGetterMayBeUsed")
@Entity
@NoArgsConstructor
public class Ingredient_cocktail {//переделать нахуй

    @Id
    @Column(name = "ingredient_cocktail_id")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "cocktail_id")
    Cocktail cocktail;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    Ingredient ingredient;

    @Column(name = "quantity")
    private int quantity;

    public Long getIngredientId(){
        return ingredient.getId();
    }

    public int getQuantity() {
        return quantity;
    }

    public String getIngredient(){
        return ingredient.getIngredient_name();
    }
}
