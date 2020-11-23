package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTestJUnitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTestJUnitApplication.class, args);

        Calculator c = new Calculator();
        System.out.println(c.add(1,3));
    }

}
