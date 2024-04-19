package com.hwjl.iBarBook.models.ingredients;

import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktail;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.util.Set;

@SuppressWarnings("unused")
@Entity
@Data
@Table(name = "Ingredients")
public class Ingredient {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Setter
    @Column(nullable = false, columnDefinition = "text")
    private String description;
}
