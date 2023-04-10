package com.example.Flight.SPA.demo.service;
import com.example.Flight.SPA.demo.entity.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> findAll();

    Flight findById(int theId);



    void save(Flight theFlight);

    void deleteById(int theId);
}
