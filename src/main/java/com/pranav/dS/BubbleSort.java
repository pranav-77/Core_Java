package com.pranav.dS;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={6,4,5,8,7,3,9};
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int arrs:arr){
            System.out.print(arrs+" ");
        }
    }
}
