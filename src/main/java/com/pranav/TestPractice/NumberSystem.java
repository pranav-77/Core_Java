package com.pranav.TestPractice;

public class NumberSystem {
    public static void main(String[] args) {
//        palindrome(121);
//        armstrong(153);
//        sumOfDigits(934);
//        factorial(5);
//        factors(24);
//        powers(5,3);
//        prime(1,10);
    }

    private static void prime(int num, int end) {
        for (int i=1;i<end;i++) {
            int count=0;
            for (int j=2;j<=i/2;j++) {
                if (i%j==0) {
                    count ++;
                }
            }
            if (count == 0) {
                System.out.print(i+" ");
            }
        }
    }

    private static void powers(int num1, int num2) {
        int sum=0;
        for (int i=1; i<=num2; i++) {
            sum = sum + num1*num1;
        }
        System.out.println(sum);
    }

    private static void factors(int num) {
        int sum =0;
        for (int i=2;i<num;i++) {
            if (num % i == 0) {
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }

    private static void factorial(int num) {
        int sum=1;
        for (int i=num; i>1; i--) {
            sum=sum*i;
        }
        System.out.println(sum);
    }

    private static void sumOfDigits(int i) {
        int num = i;
        int temp;
        int sum=0;
        while (num != 0) {
            temp = num % 10;
            sum = sum+temp;
            num = num / 10;
        }
        System.out.println(sum);
    }

    private static void armstrong(int num) {
        int n = num;
        int temp;
        int sum = 0;
        while (num != 0) {
            temp = num % 10;
            sum = (int) (sum + Math.pow(temp,3));
            num = num / 10;
        }
        if (n == sum) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void palindrome(int num) {
        int n = num;
        int temp;
        int rev = 0;
        while (n != 0) {
            temp = n % 10;
            rev = (rev * 10) + temp;
            n = n / 10;
        }
        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
