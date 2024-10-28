package com.pranav.java8.functionaLInterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void method1(int a);
    public default void method2(){
        System.out.println("Hello");
    }
}
