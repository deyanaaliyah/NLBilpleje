package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;


//Mo
public interface PersonRepository extends CrudRepository<Person, Long> {
}
