package com.hwjl.iBarBook.models.tags;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "gadget_tags")
public class Gadget_tag {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
}
