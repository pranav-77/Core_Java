package com.pranav.TestPractice.oops;

public class Demo2 extends DemoMain {
    int a = 55;

    public static void main(String[] args) {
        Demo2 m = new Demo2();
        System.out.println(m.a);
        m.m1();
        Demo b = new Demo("nithin");
        System.out.println(b);
    }

    public void m1() {
        int a = 99;
        System.out.println("Demo2" + a);
        super.m1();
        System.out.println(super.a);
        Greeting greeting = () -> System.out.println("Hello, World!");
        greeting.sayHello();
    }

    // Define a functional interface
    @FunctionalInterface
    interface Greeting {
        void sayHello();
    }
}
