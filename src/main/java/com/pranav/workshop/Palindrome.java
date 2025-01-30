package com.pranav.workshop;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int reverse = 0;
        int original = n;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
