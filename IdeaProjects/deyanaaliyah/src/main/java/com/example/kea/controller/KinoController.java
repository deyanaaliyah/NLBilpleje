package com.example.kea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KinoController {

    @GetMapping("/kinodemo")
    public String kinoIndex(){
        return "kino/index";
    }
}