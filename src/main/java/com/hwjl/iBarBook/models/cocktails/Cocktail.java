package com.hwjl.iBarBook.models.cocktails;

import jakarta.persistence.*;

@SuppressWarnings({"unused"})
@Entity
@Table(name = "Cocktails")
public class Cocktail {
    @Id
    @Column(name = "cocktail_id")
    private long cocktail_id;

    @Column(name = "cocktail_name")
    private String cocktail_name;

    @Column(name = "description")
    private String description;

    @Column(name = "recipe")
    private String recipe;



    public Cocktail() {
    }

    public Cocktail(long cocktail_id, String cocktail_name, String description, String recipe) {
        this.cocktail_id = cocktail_id;
        this.cocktail_name = cocktail_name;
        this.description = description;
        this.recipe = recipe;
    }

    public long getCocktail_id() {
        return cocktail_id;
    }

    public void setCocktail_id(long cocktail_id) {
        this.cocktail_id = cocktail_id;
    }

    public String getCocktail_name() {
        return cocktail_name;
    }

    public void setCocktail_name(String cocktail_name) {
        this.cocktail_name = cocktail_name;
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

    @Override
    public String toString() {
        return "Cocktail{" +
                "cocktail_id=" + cocktail_id +
                ", cocktail_name='" + cocktail_name + '\'' +
                ", description='" + description + '\'' +
                ", recipe='" + recipe + '\'' +
                '}';
    }
}


