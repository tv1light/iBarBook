package com.hwjl.iBarBook.services.tag_services;

import com.hwjl.iBarBook.models.tags.Cocktail_tag;
import com.hwjl.iBarBook.models.tags.Cocktail_tagRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CocktailTagService {
    Cocktail_tagRepository ctRepository;

    public List<Cocktail_tag> findAllTags() {
        return ctRepository.findAll();
    }

    public Optional<Cocktail_tag> findById(Long id) {
        return ctRepository.findById(id);
    }

//    public List<Cocktail_tag> findTagsByCocktailId(Long id) {
//        return ctRepository.findTagsByCocktailId(id);
//    }

    public Cocktail_tag save(Cocktail_tag cocktailTag) {
        return ctRepository.save(cocktailTag);
    }

    public Cocktail_tag updateTag(Long id, Cocktail_tag updCocktailTag) {
        Cocktail_tag exCocktailTag = ctRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Ingredient tag not found"));
        exCocktailTag.setName(updCocktailTag.getName());
        return ctRepository.save(exCocktailTag);
    }

    @Transactional
    public String deleteTag(Long id) {
        ctRepository.deleteById(id);
        return "Tag has been deleted";
    }
}