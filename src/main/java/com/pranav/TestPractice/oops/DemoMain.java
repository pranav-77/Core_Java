package com.pranav.TestPractice.oops;

public class DemoMain {
    int a = 10;
    static int b = 50;

    public static void main(String[] args) {
        int a = 20;
        int b = 100;
        System.out.println("main " + a);
        System.out.println("main " + b);
        DemoMain m = new DemoMain();
        m.m1();
        System.out.println(m.a);
    }

    public void m1() {
        int a = 30;
        System.out.println("m1 " + a);

        System.out.println(this.a);
    }
}
