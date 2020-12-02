package com.example.demo.controller;

import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    // Instantiates the person repository interface
    @Autowired
    private CustomerRepository repository;

    // Reserves a customizable URL and body contains methods to be executed inside HTML
    @GetMapping("/customer")
    public String readPersons(Model model) {

        // Prints out all persons on homepage via model.addAttribute method
       model.addAttribute("personToBeReturned", repository.findAll());
       return "/index.html";
    }


}