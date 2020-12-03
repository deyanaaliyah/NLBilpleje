package com.example.kea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BandifyController {
    @GetMapping("/bandifydemo")
    public String bandifyIndex(){
        return "bandify/index";
    }
}
