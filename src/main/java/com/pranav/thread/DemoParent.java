package com.pranav.thread;

public class DemoParent {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new DemoChild();
        t1.start();
        t1.join();
        for (int i=0;i<=5;i++){
            System.out.println("Parent "+i);
        }
    }
}
