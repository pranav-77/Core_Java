package com.pranav.java8.functionaLInterface;

import java.util.function.Predicate;

public class Demo implements FunctionalInterfaceDemo{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1(10);
    }

    @Override
    public void method1(int a) {
        System.out.println(a);
    }
}
