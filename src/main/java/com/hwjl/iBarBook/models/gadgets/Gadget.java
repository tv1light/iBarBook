package com.hwjl.iBarBook.models.gadgets;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "gadgets")
public class Gadget {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, columnDefinition = "text")
    private String name;

    @Column(nullable = false, columnDefinition = "text")
    private String description;

}
