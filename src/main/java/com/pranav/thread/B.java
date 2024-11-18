package com.pranav.thread;

public class B extends Thread{
    ABMain ab = new ABMain();
    @Override
    public  void run() {
        for (int i=0; i<25; i++) {
            try {
                System.out.println("B "+i);
                ab.count();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
