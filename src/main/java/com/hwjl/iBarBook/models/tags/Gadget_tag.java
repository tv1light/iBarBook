package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Gadget_tag")
@Table(name = "Gadget_tags")
public class Gadget_tag {
    @Id
    @Column(name = "gadget_tag_id")
    private Long gadget_tag_id;

    @Column(name = "gadget_tag_name", nullable = false, unique = true)
    private String gadget_tag_name;
}
