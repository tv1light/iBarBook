package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Cocktail_gadgetsId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@IdClass(Cocktail_gadgetsId.class)
public class Cocktail_gadgets {
    @Id
    private Long cocktail_id;

    @Id
    private Long gadget_id;
}
