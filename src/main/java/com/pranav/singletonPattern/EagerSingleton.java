package com.pranav.singletonPattern;

public class EagerSingleton {
    private static final EagerSingleton eagerSingleton = new EagerSingleton(24);
    private final int age;

    private EagerSingleton(int age) {
        this.age = age;
    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }

    public int getAge() {
        return age;
    }
}
