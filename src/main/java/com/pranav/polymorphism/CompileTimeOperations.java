package com.pranav.polymorphism;

public class CompileTimeOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        CompileTimeOperations o = new CompileTimeOperations();
        System.out.println("Sum of Two Integers:" + o.add(5, 3));
        System.out.println("Sum of Three Integers:" + o.add(4, 3, 7));
        System.out.println("Sum of Four Integers:" + o.add(7, 8, 3, 4));
    }
}
