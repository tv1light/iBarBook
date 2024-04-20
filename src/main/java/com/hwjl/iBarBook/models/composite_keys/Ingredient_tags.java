package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredient_tagsId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@IdClass(Ingredient_tagsId.class)
public class Ingredient_tags {
    @Id
    private Long ingredient_id;

    @Id
    private Long tag_id;
}
