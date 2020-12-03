package com.example.kea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrogrammerController {
    @GetMapping("/brogrammerdemo")
    public String broIndex(){
        return "/brogrammer/index";
    }
}
