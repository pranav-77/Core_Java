package com.pranav.dS;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 15, 24, 34, 47, 48, 50};
        int target = 34;
        int res = BinarySearching(arr, target);
        if (res != -1) {
            System.out.println("Element found in index " + res);
        } else
            System.out.println("Element not found");
    }

    public static int BinarySearching(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }
}

