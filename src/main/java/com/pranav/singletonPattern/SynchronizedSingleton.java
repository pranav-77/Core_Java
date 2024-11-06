package com.pranav.singletonPattern;

public class SynchronizedSingleton {
    private static SynchronizedSingleton synchronizedSingleton;
    private final char ch;

    private SynchronizedSingleton(char ch) {
        this.ch = ch;
    }

    synchronized public static SynchronizedSingleton getInstance() {
        if (synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton('A');
        }
        return synchronizedSingleton;
    }

    public char getCh() {
        return ch;
    }
}
