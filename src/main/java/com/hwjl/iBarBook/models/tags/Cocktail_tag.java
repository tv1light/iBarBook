package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "cocktail_tag")
public class Cocktail_tag {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
