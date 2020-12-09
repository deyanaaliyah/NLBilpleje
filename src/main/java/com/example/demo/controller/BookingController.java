package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.Collections;
import java.util.Optional;

@Controller
public class BookingController {

    // Instantiates the person repository interface
    @Autowired
    private BookingRepository repository;

    /*
    // Create a mapping for create or edit album
    @GetMapping(path = {"/add", "edit/{id}"})
    public String addOrEditForm(@PathVariable("id") Optional<Long> id, Model model, HttpSession session, Booking booking){

        // HttpSession
        if(session.getAttribute("isLogIn") != null){
            if(id.isPresent()){
                model.addAttribute("bookings",repository.findAllById(Collections.singleton(id.get())));
            }
            else{
                model.addAttribute("bookings",repository.save(booking));
            }

            return "/booking/add_edit_book";
        }

        return "";
    }

    // Post is equal to "I requested some things to be added/updated, now I tell the DB to handle and save my choices."
    @PostMapping("/addEdit")
    private String albumAddedOrUpdated(Booking bookings, HttpSession session){

        // If an ID is not provided, then create/save a new one
        if(bookings.getId() == null){
            repository.save(bookings);
        }

        // If ID is provided, then change these fields:
        else{
            // Use Optional to find specific bookings to be updated
            Optional<Booking> byId = repository.findById(bookings.getId());
            // When that bookings is found... (1/2)

            if(byId.isPresent()){
                // ... then update all these fields (2/2)
                bookings.setId(bookings.getId());
                bookings.setSize(bookings.getSize());
                bookings.setAddition(bookings.getAddition());
                bookings.setLicensePlate(bookings.getLicensePlate());
                bookings.setStatus(bookings.getStatus());
                bookings.setDate(bookings.getDate());

                // Finally, save updated fields
                repository.save(bookings);
            }
        }
        return "successful";
    }
    */
}