package com.pranav.dS;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,15,24,34,47,48,50};
        int target=34;
        int res=LinearSearching(arr,target);
        if (res!=-1){
            System.out.println("Element found in index "+res);
        }else
            System.out.println("Element not found");
    }
    public static int LinearSearching(int[] arr, int target){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==target)
                return i;
        }
        return -1;
    }
}
