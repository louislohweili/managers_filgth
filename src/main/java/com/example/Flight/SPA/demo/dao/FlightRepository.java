package com.example.Flight.SPA.demo.dao;
import com.example.Flight.SPA.demo.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface FlightRepository extends JpaRepository<Flight, Integer> {


    // add a method to sort by last name
    List<Flight> findAll();
}

