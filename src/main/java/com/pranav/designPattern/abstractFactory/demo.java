package com.pranav.designPattern.abstractFactory;

abstract class Car {
    public abstract void assemble();
}

class BMW extends Car {
    @Override
    public void assemble() {
        System.out.println("Assembling a BMW car.");
    }
}

class Audi extends Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Audi car.");
    }
}

abstract class CarFactory {
    public abstract Car produceCar();
}

class BMWFactory extends CarFactory {
    @Override
    public Car produceCar() {
        return new BMW();
    }
}

class AudiFactory extends CarFactory {
    @Override
    public Car produceCar() {
        return new Audi();
    }
}


public class demo {
    public static void main(String[] args) {
        CarFactory bmwFactory = new BMWFactory();
        Car bmw = bmwFactory.produceCar();
        bmw.assemble();
        CarFactory audiFactory = new AudiFactory();
        Car audi = audiFactory.produceCar();
        audi.assemble();
    }
}
