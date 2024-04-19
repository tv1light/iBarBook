package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ingredient_tags")
public class Ingredient_tag {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
}
