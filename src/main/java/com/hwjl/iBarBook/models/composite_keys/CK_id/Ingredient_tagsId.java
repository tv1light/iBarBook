package com.hwjl.iBarBook.models.composite_keys.CK_id;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ingredient_tagsId implements Serializable {
    private Long ingredient_id;
    private Long tag_id;
}
