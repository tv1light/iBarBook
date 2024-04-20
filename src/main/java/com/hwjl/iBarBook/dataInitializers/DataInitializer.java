package com.hwjl.iBarBook.dataInitializers;

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
    public CommandLineRunner initData(UserRepository userRepository, IngredientRepository ingredientRepository, GadgetService gadgetRepository) {
        return args -> {
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
        };
    }
}
