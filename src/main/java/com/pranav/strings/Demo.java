package com.pranav.strings;

public class Demo {
    public Demo() {
        System.out.println("connstrructor");
    }

    static {
        System.out.println("Hello World");
    }

    {
        System.out.println("non static");
    }

    public static void main(String[] args) {
        System.out.println("hii");
        Demo d=new Demo();

    }
}
