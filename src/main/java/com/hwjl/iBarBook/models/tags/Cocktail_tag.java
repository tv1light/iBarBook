package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Cocktail_tag")
@Table(name = "Cocktail_tags")
public class Cocktail_tag {
    @Id
    @Column(name = "cocktail_tag_id")
    private Long cocktail_tag_id;

    @Column(name = "cocktail_tag_name", nullable = false, unique = true)
    private String cocktail_tag_name;
}
