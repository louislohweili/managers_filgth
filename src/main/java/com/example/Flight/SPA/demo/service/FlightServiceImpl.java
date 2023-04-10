package com.example.Flight.SPA.demo.service;
import com.example.Flight.SPA.demo.dao.FlightRepository;
import com.example.Flight.SPA.demo.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FlightServiceImpl implements FlightService{
    private final FlightRepository flightRepository;
    @Autowired
    public FlightServiceImpl(FlightRepository theFlightRepository){
        flightRepository = theFlightRepository;
    }
    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @Override
    public Flight findById(int theId) {
        Optional<Flight> result = flightRepository.findById(theId);

        Flight theFlight = null;

        if (result.isPresent()) {
            theFlight = result.get();
        }
        else {
            // we didn't find the flight
            throw new RuntimeException("Did not find flight id - " + theId);
        }

        return theFlight;
    }

    @Override
    public void save(Flight theFlight) {
        flightRepository.save(theFlight);
    }

    @Override
    public void deleteById(int theId) {
        flightRepository.deleteById(theId);
    }
}

