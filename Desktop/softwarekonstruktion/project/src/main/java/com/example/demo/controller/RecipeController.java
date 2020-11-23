package com.example.demo.controller;

import com.example.demo.model.Recipe;
import com.example.demo.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class RecipeController {

    RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/")
    public String index(){

        Optional<Recipe> x = recipeRepository.findById((long)1);
        System.out.println(x.get().getDescription());

        for(Recipe r : recipeRepository.findAll()){
            System.out.println(r.getDescription());
        }

        Optional<Recipe> y = recipeRepository.findBySomething("something");
        System.out.println(y.get().getSomething());

        return "templates/index";
    }
}
