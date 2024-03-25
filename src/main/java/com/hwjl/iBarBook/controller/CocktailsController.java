package com.hwjl.iBarBook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CocktailsController {
    @GetMapping("/")
    public String cocktails(){
        return "cocktails";
    }
}
