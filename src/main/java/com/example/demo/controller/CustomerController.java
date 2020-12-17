package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.model.Customer;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class CustomerController {

    // Instantiates the customer repository interface
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/kunder")
    public String customerLoginIndex(HttpSession session){

        // HttpSession
        if(session.getAttribute("isLogIn") != null){
            return "/customer/customer-overview";
        }

        return "/customer/login-customer";
    }
    @PostMapping("/kunder")
    public String customerLoginCheck(@ModelAttribute Admin admin, Model model, HttpSession session){
        // assign an admin to be named "u"
        Admin u = adminRepository.read(admin.getUsername(), admin.getPassword());

        // check if crediatials is in the arraylist is correct
        if (u != null){
            // if so, change "isLogIn" attribute to true
            session.setAttribute("isLogIn", "yes");

            // and now try to get data from database
            try{
                model.addAttribute("customers", customerRepository.findAll());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

            // and finally return the correct html
            return "/customer/customer-overview";
        }

        // else, return login formula
        return "/customer/login-customer";
    }

}