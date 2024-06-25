package com.hwjl.iBarBook.models.cocktails;

import com.hwjl.iBarBook.models.ingredients.Ingredient;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@SuppressWarnings({"unused"})
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "cocktails")
public class Cocktail {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column(columnDefinition = "text")
    private String recipe;

    @ElementCollection
    private List<Ingredient> ingredients = null;
}


