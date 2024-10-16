package com.pranav.array;

import java.util.Arrays;

public class ArrayMethods {
    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.print("After sorted:");
        System.out.print(Arrays.toString(array));
    }

    public static void max_min(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Minimum:" + min + ", " + "Maximum:" + max);
    }

    public static void Even(int[] array) {
        System.out.print("Even: ");
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of Even:" + sum);
    }

    public static void Odd(int[] array) {
        System.out.print("Odd: ");
        int sum = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of Odd:" + sum);
    }

    public static void merge(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            merged[index++] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            merged[index++] = array2[i];
        }
        System.out.println("After merging");
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
    }

    public static void SecondLargest(int[] array) {
        Arrays.sort(array);
        if (array.length < 2) {
            System.out.println("At least Array should have 2 elements");
        } else {
            System.out.println("Second Largest Number: " + array[array.length - 2]);
        }
    }

    public static void RemoveDuplicates(int[] array) {
        System.out.println("Removed Duplicates");
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void Common(int[] array1, int[] array2) {
        System.out.println("Common Elements");
        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j])
                    count++;
            }
            if (count > 0) {
                System.out.print(array1[i] + " ");
            }
        }
    }

    public static void Reverse(int[] array) {
        System.out.println();
        System.out.println("Reversed");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int []array){
        for(int i=0;i< array.length;i=i+2){
            int temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
        }
        for (int n:array)
            System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 2, 10, 9, 5, 7, 9};
        int[] arr2 = {21, 32, 45, 65, 2, 34};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        sort(arr1);
        System.out.println();
        max_min(arr1);
        Even(arr1);
        Odd(arr1);
        merge(arr1, arr2);
        SecondLargest(arr2);
        RemoveDuplicates(arr1);
        System.out.println();
        Common(arr1, arr2);
        Reverse(arr2);
        System.out.println();
        swap(arr2);
    }
}
