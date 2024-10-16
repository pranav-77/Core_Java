package com.pranav.intreface;

public class Driver implements Car, Bike {

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.start();
        d.stop();
        Car.display();
    }
}
