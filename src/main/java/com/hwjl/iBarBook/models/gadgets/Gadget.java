package com.hwjl.iBarBook.models.gadgets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Gadget")
@Table(name = "Gadgets")
public class Gadget {
    @Id
    @Column(name = "gadget_id")
    private Long gadget_id;

    @Column(name = "gadget_name", nullable = false, unique = true)
    private String gadget_name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

}
