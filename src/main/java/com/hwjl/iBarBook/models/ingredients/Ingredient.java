package com.hwjl.iBarBook.models.ingredients;

import jakarta.persistence.*;
import lombok.*;

@SuppressWarnings("unused")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
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
