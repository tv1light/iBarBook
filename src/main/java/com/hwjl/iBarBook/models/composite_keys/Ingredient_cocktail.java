package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredient_cocktailId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@IdClass(Ingredient_cocktailId.class)
public class Ingredient_cocktail {//переделать нахуй

    @Id
    private Long cocktail_id;

    @Id
    private Long ingredient_id;

    @Column(name = "quantity")
    private int quantity;
}
