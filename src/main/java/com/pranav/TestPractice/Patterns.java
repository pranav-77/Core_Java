package com.pranav.TestPractice;

public class Patterns {
    public static void main(String[] args) {
        int num=15;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");

                num--;
            }
            System.out.println();
        }
    }
}
