package com.hwjl.iBarBook.models.ingredients;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Ingridient")
@Table(name = "Ingridients")
public class Ingredient {
    @Id
    @Column(name = "ingridient_id")
    private Long id;

    @Column(name = "ingridient_name", nullable = false, unique = true)
    private String ingridient_name;

    @Column(name = "description", nullable = false, unique = true)
    private String decription;

}
