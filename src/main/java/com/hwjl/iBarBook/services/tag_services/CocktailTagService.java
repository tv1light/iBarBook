package com.hwjl.iBarBook.services.tag_services;

import com.hwjl.iBarBook.models.tags.Cocktail_tag;
import com.hwjl.iBarBook.models.tags.Cocktail_tagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;

@Service
@AllArgsConstructor
public class CocktailTagService {
    Cocktail_tagRepository cocktailTagRepository;

    public Optional<Cocktail_tag> findById(Long id) {
        return cocktailTagRepository.findById(id);
    }


    public Cocktail_tag save(Cocktail_tag cocktailTag) {
        return cocktailTagRepository.save(cocktailTag);
    }

    public Cocktail_tag updateTag(Long id, Cocktail_tag updCocktailTag) {
        Cocktail_tag exCocktailTag = cocktailTagRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Ingredient tag not found"));
        exCocktailTag.setName(updCocktailTag.getName());
        return cocktailTagRepository.save(exCocktailTag);
    }

    @Transactional
    public String deleteTag(Long id) {
        cocktailTagRepository.deleteById(id);
        return "Tag has been deleted";
    }
}