package com.pranav.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChildThread childThread=new ChildThread();
        childThread.setPriority(1);
        System.out.println(childThread.getState());
        childThread.start();
        childThread.join();

        System.out.println(childThread.getState());
        childThread.setName("Thread1");
        System.out.println(childThread.getName());
        for (int i=0;i<20;i++) {
            System.out.println("Main method "+i);
        }
        System.out.println(childThread.getState());
    }
}
