package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Instantiates the person repository interface
    @Autowired
    private PersonRepository repository;

    // Reserves a customizable URL and body contains methods to be executed inside HTML
    @GetMapping("/index")
    public String index(Model model) {

        // Prints out all persons on homepage via model.addAttribute method
        model.addAttribute("personToBeReturned", repository.findAll());
        return "/index.html";
    }
}