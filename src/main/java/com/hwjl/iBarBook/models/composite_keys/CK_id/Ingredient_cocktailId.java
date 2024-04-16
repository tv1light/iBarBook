package com.hwjl.iBarBook.models.composite_keys.CK_id;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ingredient_cocktailId implements Serializable {
    private Long cocktail_id;
    private Long ingredient_id;
    private int quantity;
}
