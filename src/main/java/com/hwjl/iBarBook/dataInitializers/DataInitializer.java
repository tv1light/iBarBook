package com.hwjl.iBarBook.dataInitializers;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;
import com.hwjl.iBarBook.models.composite_keys.*;
import com.hwjl.iBarBook.models.composite_keys.CK_id.Cocktail_gadgetsId;
import com.hwjl.iBarBook.models.gadgets.Gadget;
import com.hwjl.iBarBook.models.ingredients.Ingredient;
import com.hwjl.iBarBook.models.ingredients.IngredientRepository;
import com.hwjl.iBarBook.models.roles.ERole;
import com.hwjl.iBarBook.models.roles.Role;
import com.hwjl.iBarBook.models.roles.RoleRepository;
import com.hwjl.iBarBook.models.tags.*;
import com.hwjl.iBarBook.models.user.User;
import com.hwjl.iBarBook.models.user.UserRepository;
import com.hwjl.iBarBook.services.GadgetService;
import com.hwjl.iBarBook.services.UserService;
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
                                      Ingredient_cocktailRepository ingRepository,
                                      RoleRepository roleRepository,
                                      Ingredients_storeRepository isRepository,
                                      Ingredient_cocktailRepository icRepository,
                                      User_roleRepository userRoleRepository,
                                      Cocktail_gadgetsRepository cocktailGadgetsRepository,
                                      Ingredient_tagRepository ingredientTagRepository,
                                      Ingredient_tagsRepository ingredientTagsRepository,
                                      Cocktail_tagRepository cocktailTagRepository,
                                      Cocktail_tagsRepository cocktailTagsRepository,
                                      Gadget_tagRepository gadgetTagRepository,
                                      Gadget_tagsRepository gadgetTagsRepository,
                                      UserService userService) {
        return args -> {
            //Инициализация Ролей
            Role role1 = new Role();
            role1.setName(ERole.ROLE_ADMIN);

            Role role2 = new Role();
            role2.setName(ERole.ROLE_USER);

            roleRepository.save(role1);
            roleRepository.save(role2);

            //Инициализация Пользователей
            User user1 = new User();
            user1.setUsername("user1");
            user1.setEmail("user1@example.com");
            user1.setPassword("password1");

            User user2 = new User();
            user2.setUsername("user2");
            user2.setEmail("user2@example.com");
            user2.setPassword("password2");

            userService.registration(user1);
            userService.registration(user2);

            //Связь Пользователь->Роль
            User_role ur1 = new User_role();
            ur1.setUser_id(1L);
            ur1.setRole_id(1L);

            userRoleRepository.save(ur1);

            //Ингредиенты
            Ingredient ingredient1 = new Ingredient();
            ingredient1.setName("Ingredient 1");
            ingredient1.setDescription("Description for Ingredient 1");

            Ingredient ingredient2 = new Ingredient();
            ingredient2.setName("Ingredient 2");
            ingredient2.setDescription("Description for Ingredient 2");

            ingredientRepository.save(ingredient1);
            ingredientRepository.save(ingredient2);

            //Инициализация хранения списка ингредиентов пользователя
            Ingredients_store store1 = new Ingredients_store();
            store1.setIngredient_id(1L);
            store1.setUser_id(1L);

            Ingredients_store store2 = new Ingredients_store();
            store2.setIngredient_id(2L);
            store2.setUser_id(1L);

            isRepository.save(store1);
            isRepository.save(store2);

            //Коктейли
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

            //Связь кокйтейль->ингредиент
            Ingredient_cocktail ing1 = new Ingredient_cocktail();
            ing1.setCocktail_id(1L);
            ing1.setIngredient_id(1L);

            Ingredient_cocktail ing2 = new Ingredient_cocktail();
            ing2.setCocktail_id(1L);
            ing2.setIngredient_id(2L);

            ingRepository.save(ing1);
            ingRepository.save(ing2);

            //Гаджеты
            Gadget gadget1 = new Gadget();
            gadget1.setName("Gadget 1");
            gadget1.setDescription("Description for Gadget 1");

            Gadget gadget2 = new Gadget();
            gadget2.setName("Gadget 2");
            gadget2.setDescription("Description for Gadget 2");

            gadgetRepository.save(gadget1);
            gadgetRepository.save(gadget2);

            //Связь Коктейль->Гаджет
            Cocktail_gadgets cg1 = new Cocktail_gadgets();
            cg1.setCocktail_id(1L);
            cg1.setGadget_id(1L);

            Cocktail_gadgets cg2 = new Cocktail_gadgets();
            cg2.setCocktail_id(1L);
            cg2.setGadget_id(2L);

            cocktailGadgetsRepository.save(cg1);
            cocktailGadgetsRepository.save(cg2);

            //Теги ингредиентов
            Ingredient_tag it1 = new Ingredient_tag();
            it1.setName("Ingredient Tag 1");

            Ingredient_tag it2 = new Ingredient_tag();
            it2.setName("Ingredient Tag 2");

            ingredientTagRepository.save(it1);
            ingredientTagRepository.save(it2);

            //Связь ингредиент->тег
            Ingredient_tags its1 = new Ingredient_tags();
            Ingredient_tags its2 = new Ingredient_tags();
            its1.setIngredient_id(1L);
            its1.setTag_id(1L);

            its2.setIngredient_id(1L);
            its2.setTag_id(2L);

            ingredientTagsRepository.save(its1);
            ingredientTagsRepository.save(its2);

            //Теги коктейлей
            Cocktail_tag ct1 = new Cocktail_tag();
            ct1.setName("Cocktail Tag 1");

            Cocktail_tag ct2 = new Cocktail_tag();
            ct2.setName("Cocktail Tag 2");

            cocktailTagRepository.save(ct1);
            cocktailTagRepository.save(ct2);

            //Связь коктейль->тег
            Cocktail_tags cts1 = new Cocktail_tags();
            Cocktail_tags cts2 = new Cocktail_tags();
            cts1.setCocktail_id(1L);
            cts1.setTag_id(1L);

            cts2.setCocktail_id(1L);
            cts2.setTag_id(2L);

            cocktailTagsRepository.save(cts1);
            cocktailTagsRepository.save(cts2);

            //Теги гаджетов
            Gadget_tag gt1 = new Gadget_tag();
            gt1.setName("Gadget Tag 1");

            Gadget_tag gt2 = new Gadget_tag();
            gt2.setName("Gadget Tag 2");

            gadgetTagRepository.save(gt1);
            gadgetTagRepository.save(gt2);

            //Связь гаджет->тег
            Gadget_tags gts1 = new Gadget_tags();
            Gadget_tags gts2 = new Gadget_tags();
            gts1.setGadget_id(1L);
            gts1.setTag_id(1L);

            gts2.setGadget_id(1L);
            gts2.setTag_id(2L);

            gadgetTagsRepository.save(gts1);
            gadgetTagsRepository.save(gts2);
        };


    }
}
