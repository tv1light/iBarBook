package com.hwjl.iBarBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocktailsController {
    @GetMapping("/")
    public String cocktails(){
        return "main";
    }
}
