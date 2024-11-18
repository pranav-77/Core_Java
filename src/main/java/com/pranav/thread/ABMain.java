package com.pranav.thread;

public class ABMain {
    static int count=0;
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
        System.out.println(count);
    }
    public  synchronized void count() {
        count++;
    }
}
