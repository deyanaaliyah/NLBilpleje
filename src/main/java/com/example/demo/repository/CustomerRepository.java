package com.example.demo.repository;

import com.example.demo.model.Customers;
import org.springframework.data.repository.CrudRepository;


//Mo
public interface CustomerRepository extends CrudRepository<Customers, Long> {
}
