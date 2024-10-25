package com.pranav.strings;

public class Count {
    public static void main(String[] args) {
        String name="how are you";
        String res="";
        String[] w=name.split(" ");
        for (int i=0;i< w.length;i++){
            res=res+Character.toUpperCase(w[i].charAt(0))+w[i].substring(1).toLowerCase()+" ";
        }
        System.out.println(res.trim());
    }
}
