package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    // Instantiates the person repository interface
    @Autowired
    private CustomerRepository repository;


    // Reserves a customizable URL and body contains methods to be executed inside HTML
    @GetMapping("/customers")
    public Iterable<Customer> readCustomer(){
        // Prints out all persons on homepage in Json format
        return repository.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Optional<Customer>> readOne(@PathVariable Long id){
        Optional<Customer> response = repository.findById(id);
        if(response.isPresent()) {
            return ResponseEntity.status(200).body(response);
        }else {
            return ResponseEntity.status(404).body(response);
        }
    }


}