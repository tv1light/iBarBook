package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cocktail_tags")
@Data
public class Cocktail_tag {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;
}
