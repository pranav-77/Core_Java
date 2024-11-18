package com.pranav.thread;

public class DemoChild extends Thread {
    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Child "+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
