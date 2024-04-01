package com.hwjl.iBarBook.services;

import com.hwjl.iBarBook.models.cocktails.Cocktail;
import com.hwjl.iBarBook.models.cocktails.CocktailRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> listCocktails(){
        List<Cocktail> list = cocktailRepository.findAll();
        return cocktailRepository.findAll();
    }
}
