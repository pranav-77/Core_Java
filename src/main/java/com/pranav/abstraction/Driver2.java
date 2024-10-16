package com.pranav.abstraction;

public class Driver2 extends Passenger{
    @Override
    public void driving() {
        System.out.println("Driver two knows driving");
    }

    public static void main(String[] args) {
        Passenger dd=new Driver2();
        dd.driving();
        dd.travel();
        System.out.println();
        Passenger d=new Driver();
        d.driving();
        d.travel();
    }
}
