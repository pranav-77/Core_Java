package com.pranav.workshop;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> {
            for (int i=0;i<5;i++) {
                System.out.println(i+" Thread 1");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread task2 = new Thread(() -> {
            for (int i=0;i<5;i++) {
                System.out.println(i+" Thread 2");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread1 = new Thread(task1);

        thread1.start();
        //thread1.join();
        task2.start();
    }
}
