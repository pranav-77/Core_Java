package com.pranav.strings;

public class Capital {
    public static void main(String[] args) {
        String name = "how are you";
        String[] w = name.split(" ");
        String res = "";
//        for (int i=0;i<w.length;i++){
//            if (i<w.length-1){
//                res=res+w[i].toUpperCase()+" ";
//            }else {
//                res = res + w[i] + " ";
//            }
//        }
//        System.out.println(res);
        for (int i=0;i<w.length;i++) {
            res=res+w[i].substring(0,w[i].length()-1).toLowerCase()+Character.toUpperCase(w[i].charAt(w[i].length()-1))+" ";
        }
        System.out.println(res);


    }
}

