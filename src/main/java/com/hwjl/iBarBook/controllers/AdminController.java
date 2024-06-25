package com.hwjl.iBarBook.controllers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.services.CocktailService;
import com.hwjl.iBarBook.services.GadgetService;
import com.hwjl.iBarBook.services.IngredientService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
@AllArgsConstructor
public class AdminController {

    @RestController
    @RequestMapping("/cocktails")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @AllArgsConstructor
    public static class CocktailController {
        private final CocktailService cocktailService;

        @PutMapping("/{id}/edit")
        public Cocktail editCocktail(@PathVariable Long id, @RequestBody Cocktail updatedCocktail) {
            return cocktailService.updateCocktail(id, updatedCocktail);
        }

        @PostMapping("/add")
        public Cocktail addCocktail(@RequestBody Cocktail cocktail) {
            return cocktailService.save(cocktail);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteCocktail(@PathVariable Long id) {
            return cocktailService.deleteCocktail(id);
        }
    }

    @RestController
    @RequestMapping("/ingredients")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @AllArgsConstructor
    public static class IngredientController {
        private final IngredientService ingredientService;

        @PostMapping("/add")
        public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
            return ingredientService.save(ingredient);
        }

        @PutMapping("/{id}/edit")
        public Ingredient editIngredient(@PathVariable Long id, @RequestBody Ingredient updatedIngredient) {
            return ingredientService.updateIngredient(id, updatedIngredient);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteIngredient(@PathVariable Long id) {
            return ingredientService.deleteIngredient(id);
        }
    }

    @RestController
    @RequestMapping("/gadgets")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @AllArgsConstructor
    public static class GadgetController {
        private final GadgetService gadgetService;

        @PostMapping("/add")
        public Gadget addGadget(@RequestBody Gadget gadget) {
            return gadgetService.save(gadget);
        }

        @PutMapping("/{id}/edit")
        public Gadget editGadget(@PathVariable Long id, @RequestBody Gadget updatedGadget) {
            return gadgetService.updateGadget(id, updatedGadget);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteGadget(@PathVariable Long id) {
            return gadgetService.deleteGadget(id);
        }
    }
}
