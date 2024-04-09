package com.hwjl.iBarBook.models.cocktails;

import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktail;
import jakarta.persistence.*;


import java.util.Set;

@SuppressWarnings({"unused"})
@Entity
@Table(name = "Cocktails")
public class Cocktail {

    @Id
    @Column(name = "cocktail_id")
    private long cocktail_id;

    @Column(name = "cocktail_name")
    private String cocktail_name;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "recipe", columnDefinition = "text")
    private String recipe;

    @OneToMany(mappedBy = "cocktail")
    Set<Ingredient_cocktail> ingredients;

    public Cocktail() {
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

    public Set<Ingredient_cocktail> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient_cocktail> ingredients) {
        this.ingredients = ingredients;
    }

    public Cocktail(long cocktail_id, String cocktail_name, String description, String recipe) {
        this.cocktail_id = cocktail_id;
        this.cocktail_name = cocktail_name;
        this.description = description;
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


