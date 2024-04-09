package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Ingredient_tag")
@Table(name = "Ingredient_tags")
public class Ingredient_tag {
    @Id
    @Column(name = "ingredient_tag_id")
    private Long ingredient_tag_id;

    @Column(name = "ingredient_tag_name", nullable = false, unique = true)
    private String ingredient_tag_name;
}
