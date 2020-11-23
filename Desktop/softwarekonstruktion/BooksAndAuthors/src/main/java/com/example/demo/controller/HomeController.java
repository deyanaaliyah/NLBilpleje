package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    AuthorRepository authorRepository;
    public HomeController (AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @GetMapping("/")
    public String index(){
        // data from database
        System.out.println(authorRepository.findById(1L).get().getFirstName());
        System.out.println(authorRepository.findById(1L).get().getLastName());

        for (Book b : authorRepository.findById(1L).get().getBooks()){
            System.out.println(b.getTitle());
            System.out.println(b.getIsbn());
            System.out.println(b.getPublisher());
        }

        return "index";
    }
}
