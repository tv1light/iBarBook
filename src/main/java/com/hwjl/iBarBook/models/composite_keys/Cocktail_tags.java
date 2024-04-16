package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Cocktail_tagsId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(Cocktail_tagsId.class)
public class Cocktail_tags {
    @Id
    private Long cocktail_id;

    @Id
    private Long tag_id;
}
