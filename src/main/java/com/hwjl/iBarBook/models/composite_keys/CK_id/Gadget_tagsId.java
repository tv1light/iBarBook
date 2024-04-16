package com.hwjl.iBarBook.models.composite_keys.CK_id;

import lombok.Data;

import java.io.Serializable;

@Data
public class Gadget_tagsId implements Serializable {
    private Long gadget_id;
    private Long tag_id;
}
