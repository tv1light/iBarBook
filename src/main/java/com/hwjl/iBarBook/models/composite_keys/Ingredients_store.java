package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Ingredients_storeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@IdClass(Ingredients_storeId.class)
public class Ingredients_store {
    @Id
    private Long user_id;

    @Id
    private Long ingredient_id;
}
