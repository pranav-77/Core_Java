package com.pranav.strings;

public class Frequency {
    public static void main(String[] args) {
        String name="Hello how are you";
        name=name.toLowerCase();

        int[] freq=new int[256];

        for (int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if (c!=' ')
                freq[c]++;
        }

        for (int i=0;i< freq.length;i++){
            if (freq[i]>0){
                System.out.println((char)i+" "+freq[i]);
            }
        }
    }
}
