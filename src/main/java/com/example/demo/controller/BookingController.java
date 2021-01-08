package com.example.demo.controller;

import com.example.demo.repository.IBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

    // Instantiates the person repository interface
    @Autowired
    private IBookingRepository bookingRepository;

    @GetMapping("/book")
    public String bookingOverview(Model model){
        model.addAttribute("bookings", bookingRepository.findAll());
        return "/login/booking-overview";
    }
}