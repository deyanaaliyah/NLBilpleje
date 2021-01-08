package com.example.demo.controller;

import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerController {

    // Instantiates the customer repository interface
    @Autowired
    private ICustomerRepository customerRepository;
    @Autowired
    private AdminRepository adminRepository;
/*
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

        // check if credentials in the arraylist is correct
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
*/
}