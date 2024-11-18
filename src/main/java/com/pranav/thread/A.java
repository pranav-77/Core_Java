package com.pranav.thread;

public class A extends Thread {
    ABMain ab = new ABMain();
    @Override
    public  void run() {
        for (int i=0; i<25; i++){
            try {
                System.out.println("A "+i);
                ab.count();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
