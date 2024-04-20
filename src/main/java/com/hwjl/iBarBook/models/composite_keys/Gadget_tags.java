package com.hwjl.iBarBook.models.composite_keys;

import com.hwjl.iBarBook.models.composite_keys.CK_id.Gadget_tagsId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@IdClass(Gadget_tagsId.class)
public class Gadget_tags {
    @Id
    private Long gadget_id;

    @Id
    private Long tag_id;
}
