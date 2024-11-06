package com.pranav.singletonPattern;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private final String name;

    private LazySingleton(String name) {
        this.name = name;
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton("Pranav");
        }
        return lazySingleton;
    }

    public String getName() {
        return name;
    }
}
