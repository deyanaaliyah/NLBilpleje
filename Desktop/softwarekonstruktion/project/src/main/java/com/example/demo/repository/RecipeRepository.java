package com.example.demo.repository;

import com.example.demo.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Recipe> findByCookTime(int cookTime);
    Optional<Recipe> findBySomething(String x);
}