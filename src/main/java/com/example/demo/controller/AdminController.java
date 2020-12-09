package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    // Autowired
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/login")
    public String loginIndex(HttpSession session){

        // HttpSession
        if(session.getAttribute("isLogIn") != null){
            return "/login/booking-overview";
        }

        return "/login/login-index";
    }
    @PostMapping("/login")
    public String loginCheck(@ModelAttribute Admin admin, Model model, HttpSession session){
        // assign an admin to be named "u"
        Admin u = adminRepository.read(admin.getUsername(), admin.getPassword());

        // check if crediatials is in the arraylist is correct
        if (u != null){
            // if so, change "isLogIn" attribute to true
            session.setAttribute("isLogIn", "yes");

            // and now try to get data from database
            try{
                model.addAttribute("bookings", bookingRepository.findAll());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            // and finally return the correct html
            return "/login/booking-overview";
        }

        // else, return login formula
        return "/login/login-index";
    }
    @GetMapping("/logud")
    public String logout(HttpSession session){

        // change "isLogIn" attribute to false
        session.removeAttribute("isLogIn");

        if(session.getAttribute("isLogIn") != null){
            return "/login/booking-overview";
        }

        return "/login/login-index";
    }
}