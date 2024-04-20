package com.hwjl.iBarBook.dataInitializers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;
import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktail;
import com.hwjl.iBarBook.models.composite_keys.Ingredient_cocktailRepository;
import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.models.user.UserRepository;
import com.hwjl.iBarBook.services.GadgetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SuppressWarnings("unused")
@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(UserRepository userRepository,
                                      IngredientRepository ingredientRepository,
                                      GadgetService gadgetRepository,
                                      CocktailRepository cocktailRepository,
                                      Ingredient_cocktailRepository ingRepository) {
        return args -> {
            Cocktail cocktail1 = new Cocktail();
            cocktail1.setName("Cocktail 1");
            cocktail1.setDescription("Description for Cocktail 1");
            cocktail1.setRecipe("Recipe od Cocktail 1");

            Cocktail cocktail2 = new Cocktail();
            cocktail2.setName("Cocktail 2");
            cocktail2.setDescription("Description for Cocktail 2");
            cocktail2.setRecipe("Recipe od Cocktail 2");

            cocktailRepository.save(cocktail1);
            cocktailRepository.save(cocktail2);

            User user1 = new User();
            user1.setUsername("user1");
            user1.setEmail("user1@example.com");
            user1.setPassword("password1");

            User user2 = new User();
            user2.setUsername("user2");
            user2.setEmail("user2@example.com");
            user2.setPassword("password2");

            userRepository.save(user1);
            userRepository.save(user2);

            Ingredient ingredient1 = new Ingredient();
            ingredient1.setName("Ingredient 1");
            ingredient1.setDescription("Description for Ingredient 1");

            Ingredient ingredient2 = new Ingredient();
            ingredient2.setName("Ingredient 2");
            ingredient2.setDescription("Description for Ingredient 2");

            ingredientRepository.save(ingredient1);
            ingredientRepository.save(ingredient2);

            Gadget gadget1 = new Gadget();
            gadget1.setName("Gadget 1");
            gadget1.setDescription("Description for Gadget 1");

            Gadget gadget2 = new Gadget();
            gadget2.setName("Gadget 2");
            gadget2.setDescription("Description for Gadget 2");

            gadgetRepository.save(gadget1);
            gadgetRepository.save(gadget2);

            Ingredient_cocktail ing = new Ingredient_cocktail();
            ing.setCocktail_id(1L);
            ing.setIngredient_id(1L);

            ingRepository.save(ing);
        };
    }
}
