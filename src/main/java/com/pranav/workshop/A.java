package com.pranav.workshop;

public class A {
    void sound() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        b.sound();
        A a1 = new A();
        a1.sound();
    }
}
