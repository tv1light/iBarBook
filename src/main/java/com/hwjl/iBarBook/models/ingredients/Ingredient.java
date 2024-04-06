package com.hwjl.iBarBook.models.ingredients;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;

@SuppressWarnings("unused")
@Entity(name = "Ingredient")
@Table(name = "Ingredients")
public class Ingredient {
    @Id
    @Column(name = "ingredient_id")
    private Long id;

    @Column(name = "ingredient_name", nullable = false, unique = true)
    private String ingredient_name;

    @Setter
    @Column(name = "description", nullable = false, unique = true)
    private String description;


    public Ingredient() {
    }

    public Ingredient(Long id, String ingridient_name, String decription) {
        this.id = id;
        this.ingredient_name = ingridient_name;
        this.description = decription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", ingredient_name='" + ingredient_name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
