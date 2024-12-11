package com.pranav.thread;

public class RunnableDemo {
    static int count;

    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " Thread t1");
                count();
                try {
                    Thread.sleep(500);
                    //Thread.yield();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable t2 = () -> {
            for (int i = 'a'; i <= 'e'; i++) {
                System.out.println((char) i + " Thread t2");
                count();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        Thread thread = new Thread(() -> {
            for (int i = 11; i <= 15; i++) {
                System.out.println(i + " Thread 3");
                count();
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread.start();
        thread.join();

        System.out.println(count);
    }

    public static synchronized void count() {
        count++;
    }
}
