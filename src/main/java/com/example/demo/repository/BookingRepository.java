package com.example.demo.repository;

import com.example.demo.model.Booking;
import org.springframework.data.repository.CrudRepository;


public interface BookingRepository extends CrudRepository<Booking,Long> {

}
