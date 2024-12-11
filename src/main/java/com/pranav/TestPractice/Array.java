package com.pranav.TestPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        int[] arr = {56, 45, 78, 21, 10, 56};
//        sort();
//        maximum();
//        swap(arr);
//        reverse(arr);
//        sum(arr);
//        findSorted(arr);
//        kPosition(arr);
//        duplicate(arr);
//        sumArr(arr);
//        mergeTwoArray();
//        findMissingNum();
//        zerosAndOnes();
    }

    private static void zerosAndOnes() {
        int[] arr = {1,4,5,0,9,0,3,0};
        int[] arr2=new int[arr.length];
        int index=0;
        for (int i=0; i< arr2.length; i++) {
            if (arr[i]==0){
                arr2[index++] = arr[i];
            }
        }

        for (int i=0; i< arr2.length; i++) {
            if (arr[i]!=0){
                arr2[index++] = arr[i];
            }
        }

        for (int num : arr2) {
            System.out.print(num+" ");
        }
    }

    private static void findMissingNum() {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int n = 7;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(totalSum - sum);
    }

    private static void mergeTwoArray() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] merge = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }

        for (int num : merge) {
            System.out.print(num + " ");
        }
    }

    private static void sumArr(int[] arr) {
        int num = 55;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }
    }

    private static void duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 0)
                System.out.print(arr[i] + " ");
        }
    }

    private static void kPosition(int[] arr) {
        int k = 2;
        int length = arr.length - 1;
        int index = 0;
        while (k < length) {
            arr[index++] = arr[length];
            length--;
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static void findSorted(int[] arr) {
        boolean res = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }

    private static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void swap(int[] arr) {
        for (int i = 0; i < arr.length - 1; i = i + 3) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
            arr[i + 1] = arr[i + 1];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void maximum() {
        int[] arr = {56, 45, 78, 21, 10, 97};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max + ": is maximum");

        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (arr[i] > max2)
                    max2 = arr[i];
            }
        }
        System.out.println(max2 + ": 2nd Maximum");
    }

    private static void sort() {
        int[] arr = {56, 45, 78, 21, 10, 97};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
