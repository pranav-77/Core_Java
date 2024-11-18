package com.pranav.thread;

public class ChildThread extends Thread {
    public void run() {
       for (int i=0;i<5;i++){
           try {
               Thread.sleep(1000);
               System.out.println("Child Thread "+i+" "+Thread.currentThread().getPriority());
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }
}
