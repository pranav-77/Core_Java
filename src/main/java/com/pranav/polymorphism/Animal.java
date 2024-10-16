package com.pranav.polymorphism;

public class Animal {
    public void sound(){
        System.out.println("Animals makes sound");
    }

    public static void main(String[] args) {
        Animal a=new Cat();
        a.sound();

        Animal b=new Lion();
        b.sound();

        IAtm atm=new UserImpl();
        atm.pay();
    }
}
