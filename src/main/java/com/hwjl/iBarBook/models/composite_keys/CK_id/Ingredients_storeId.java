package com.hwjl.iBarBook.models.composite_keys.CK_id;


import java.io.Serializable;

public class Ingredients_storeId implements Serializable {
    private Long user_id;
    private Long ingredient_id;

    public Ingredients_storeId(Long user_id, Long ingredient_id) {
        this.user_id = user_id;
        this.ingredient_id = ingredient_id;
    }
}