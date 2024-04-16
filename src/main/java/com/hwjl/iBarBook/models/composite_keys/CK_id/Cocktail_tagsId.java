package com.hwjl.iBarBook.models.composite_keys.CK_id;

import lombok.Data;

import java.io.Serializable;

@Data
public class Cocktail_tagsId implements Serializable {
    private Long cocktail_id;
    private Long tag_id;
}
