package com.pranav.designPrinciples.SRP;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        while (true) {
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. EXIT");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(add(number1, number2));
                    break;
                case 2:
                    System.out.println(subtraction(number1, number2));
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }
}
