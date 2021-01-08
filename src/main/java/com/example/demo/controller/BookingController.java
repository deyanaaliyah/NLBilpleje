package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.repository.IBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {

    // Instantiates the person repository interface
    @Autowired
    private IBookingRepository bookingRepository;

    //read all

    @GetMapping("/book")
    public String bookingOverview(Model model){
        model.addAttribute("bookings", bookingRepository.findAll());
        return "/booking/booking-overview";
    }

    //Create booking
    @GetMapping("/create-booking")
    public String get(Model model){
        Booking booking = new Booking();
        model.addAttribute("bookingToBeCreated", booking);
        return "/booking/create-booking";
    }

    //Saves the created booking
    @PostMapping("/create-student")
    public String save(@ModelAttribute Booking newBooking){
        bookingRepository.save(newBooking);
        return "successful";
    }




}