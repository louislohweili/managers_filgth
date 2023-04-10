package com.example.Flight.SPA.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="flight_log")
public class Flight {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="flightID")
    private String flightID;
    @Column(name="takeoff")
    private String takeoff;
    @Column(name="landing")
    private  String landing;

    @Column(name="Duration")
    private String Duration;

    public Flight(int id, String flightID, String takeoff, String landing, String duration) {
        this.id = id;
        this.flightID = flightID;
        this.takeoff = takeoff;
        this.landing = landing;
        Duration = duration;
    }

    public Flight(String flightID, String takeoff, String landing, String duration) {

        this.flightID = flightID;
        this.takeoff = takeoff;
        this.landing = landing;
        Duration = duration;
    }

    public Flight() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getLanding() {
        return landing;
    }

    public void setLanding(String landing) {
        this.landing = landing;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightID='" + flightID + '\'' +
                ", takeoff='" + takeoff + '\'' +
                ", landing='" + landing + '\'' +
                ", Duration='" + Duration + '\'' +
                '}';
    }
}
