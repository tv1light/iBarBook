package com.hwjl.iBarBook.models.cocktails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Cocktail")
@Table(name = "Cocktails")
public class Cocktail {
    @Id
    @Column(name = "cocktail_id")
    private Long cocktail_id;

    @Column(name = "cocktail_name", nullable = false, unique = true)
    private String cocktail_name;

    @Column(name = "description", nullable = false, unique = true)
    private String description;

    @Column(name = "recipe", nullable = false, unique = true)
    private String recipe;
}
