package com.pranav.thread;

public class Car extends Thread {
    String name;
    CarRide ride;
    Car(String name, CarRide ride){
        this.name = name;
        this.ride = ride;
    }
    @Override
    public void run() {
        ride.ride(name);
        ride.ride(name);
    }
}
