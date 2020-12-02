package com.example.demo.controller;


import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

@Controller
public class BookingController {

    // Instantiates the person repository interface
    @Autowired
    private BookRepository repository;

    // Reserves a customizable URL and body contains methods to be executed inside HTML
    @GetMapping("/")
    public String index(Model model) {

        // Prints out all persons on homepage via model.addAttribute method
        model.addAttribute("bookToBeReturned", repository.findAll());
        return "index";

    }

    //Create a mapping for create or edit book
    @GetMapping(path = {"/add", "edit/{id}"})
    public String addOrEditForm(@PathVariable("id") Optional<Long> id, Model model) {

        if (id.isPresent()) {
            model.addAttribute("album", repository.findAllById(Collections.singleton(id.get())));
        } else {
            model.addAttribute("album", new Book());
        }

        return "add_edit_book";
    }

    //Post is equal to "I requested some things to be added/updated, now I tell the DB to handle and save my choices
    @PostMapping("/addEdit")
    private String bookAddedOrUpdated(Book book) {

        //If an ID is not provided, then create/save a new one
        if (book.getId() == null) {
            repository.save(book);
        }

        //If ID is provided, then change these fields
        else{
            //Use Optional to find specific album to be updated
            Optional<Book> book1 = repository.findById(book.getId());

            if(book1.isPresent()){
                Book editBook = book1.get();
                editBook.setSize(book.getSize());
                editBook.setAddition(book.getAddition());
                editBook.setLicensePlate(book.getLicensePlate());
                editBook.setCleaned(book.isCleaned());

                repository.save(editBook);
            }
        }
        return "successful";
    }

    //Delete an album via its ID
    @GetMapping("/delete/{id}")
    private String deleteBook(@PathVariable("id") Long id){

        //Optional to find specific album to be deleted
        Optional<Book> book = repository.findById(id);

        //CrudRepository object will delete it
        repository.deleteById(book.get().getId());

        return "successful";
    }
}

