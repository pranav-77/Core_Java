package com.pranav.workshop;

public class Binary {
    public static void main(String[] args) {
        int[] arr={8,4,3,4,5,6,2,1,9};
        int target=5;
        int res=binarySearchh(arr,target);
        System.out.println(res);
    }

    private static int binarySearchh(int[] arr,int target) {
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else {
                low=mid-1;
            }
        }
        return -1;
    }
}
