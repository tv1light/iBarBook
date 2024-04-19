package com.hwjl.iBarBook.models.cocktails;

import jakarta.persistence.*;
import lombok.*;

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

}


