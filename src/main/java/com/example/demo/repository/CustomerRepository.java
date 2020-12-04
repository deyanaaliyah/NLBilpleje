package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;


//Mo
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
