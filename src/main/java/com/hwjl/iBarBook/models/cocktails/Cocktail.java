package com.hwjl.iBarBook.models.cocktails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cocktails")
public class Cocktail {
    @Id
    @Column(name = "cocktail_id")
    private long cocktail_id;

    @Column(name = "description")
    String description;

    @Column(name = "name")
    String name;

    @Column(name = "recipe")
    String recipe;
}
