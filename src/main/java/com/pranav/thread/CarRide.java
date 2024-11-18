package com.pranav.thread;

public class CarRide {
    public synchronized void ride(String name)
    {
        try {
            System.out.println("Driving Car");
        } catch (Exception e){
            e.getStackTrace();
        }
        System.out.println("Ride Finished");
    }
}
