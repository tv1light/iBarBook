package com.hwjl.iBarBook.models.cocktails;

import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktail;
import jakarta.persistence.*;


import java.util.Set;

@SuppressWarnings({"unused"})
@Entity
@Table(name = "cocktails")
public class Cocktail {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "cocktail_name")
    private String name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "recipe", columnDefinition = "text")
    private String recipe;


    public Cocktail() {
    }

    public long getCocktail_id() {
        return id;
    }

    public void setCocktail_id(long cocktail_id) {
        this.id = cocktail_id;
    }

    public String getCocktail_name() {
        return name;
    }

    public void setCocktail_name(String cocktail_name) {
        this.name = cocktail_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public Cocktail(long cocktail_id, String cocktail_name, String description, String recipe) {
        this.id = cocktail_id;
        this.name = cocktail_name;
        this.description = description;
        this.recipe = recipe;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "cocktail_id=" + id +
                ", cocktail_name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", recipe='" + recipe + '\'' +
                '}';
    }


}


