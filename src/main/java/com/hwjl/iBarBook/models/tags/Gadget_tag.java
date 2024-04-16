package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gadget_tags")
public class Gadget_tag {
    @Id
    @Column(name = "id")
    private Long tag_id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;
}
