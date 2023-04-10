package com.example.Flight.SPA.demo.controller;
import com.example.Flight.SPA.demo.entity.Flight;
import com.example.Flight.SPA.demo.service.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("flights")
public class FlightController {
    private final FlightService flightService;
    public FlightController(FlightService theflightService){
        flightService =theflightService;
    }

    @GetMapping("/list")
    public String listFlights(Model theModel) {

        // get the flight from db
        List<Flight> theFlight = flightService.findAll();

        // add to the spring model
        theModel.addAttribute("flights", theFlight);

        return "flights/list-flights";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Flight theFlights= new Flight();

        theModel.addAttribute("flight", theFlights);

        return "flights/flight-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("tailNumber") int theId,
                                    Model theModel) {

        // get the Flight from the service
        Flight theFlight = flightService.findById(theId);

        // set flight as a model attribute to pre-populate the form
        theModel.addAttribute("flight", theFlight);

        // send over to our form
        return "flights/flight-form";
    }

    @PostMapping("/save")
    public String saveFlight(@ModelAttribute("flight") Flight theFlight) {

        // save the flight
        flightService.save(theFlight);

        // use a redirect to prevent duplicate submissions
        return "redirect:/flights/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("tailNumber") int theId) {

        // delete the flight
        flightService.deleteById(theId);

        // redirect to /flights/list
        return "redirect:/flights/list";

    }
}
