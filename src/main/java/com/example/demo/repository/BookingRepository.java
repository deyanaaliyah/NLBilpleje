package com.example.demo.repository;

import com.example.demo.model.Bookings;
import org.springframework.data.repository.CrudRepository;


public interface BookingRepository extends CrudRepository<Bookings,Long> {

}
