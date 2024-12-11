package com.pranav.designPattern.singletonPattern;

public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton doubleCheckSingleton;
    private final float num;

    private DoubleCheckSingleton(float num) {
        this.num = num;
    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton(9.90f);
                }
            }
        }
        return doubleCheckSingleton;
    }

    public float getNum() {
        return num;
    }
}
