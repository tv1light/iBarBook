package com.hwjl.iBarBook.services.tag_services;

import com.hwjl.iBarBook.models.tags.Ingredient_tag;
import com.hwjl.iBarBook.models.tags.Ingredient_tagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class IngredientTagService{
    Ingredient_tagRepository itRepository;

    public List<Ingredient_tag> findAllTags() {
        return itRepository.findAll();
    }

    public Optional<Ingredient_tag> findById(Long id) {
        return itRepository.findById(id);
    }

//    public List<Ingredient_tag> findTagsByItemId(Long id) {
//        return itRepository.findTagsByCocktailId(id);
//    }

    public Ingredient_tag save(Ingredient_tag ingredientTag) {
        return itRepository.save(ingredientTag);
    }

    public Ingredient_tag updateTag(Long id, Ingredient_tag upT) {
        Ingredient_tag exT = itRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Ingredient tag not found"));
        exT.setName(upT.getName());
        return itRepository.save(upT);
    }

    @Transactional
    public String deleteTag(Long id) {
        itRepository.deleteById(id);
        return "Tag has been deleted";
    }
}
