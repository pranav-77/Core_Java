package com.pranav.strings;

public class ReverseFirstWord {
    public static void main(String[] args) {
        String name="Hello World";
        String []w=name.split(" ");
        StringBuilder Reverse=new StringBuilder(w[0]).reverse();
        String res=Reverse+" "+w[1];
        System.out.println(res);
        reverse();
        Sub();
        revv();
    }
    public static void reverse(){
        String name="Hai hello";
        String[] w=name.split(" ");
        String s1="";
        char []ch=w[0].toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            s1=s1+ch[i];
        }
        String res=s1+" "+w[1];
        System.out.println(res);
    }
    public static void Sub(){
        String name="Friend Hai";
        String []w=name.split(" ");
        String str=name.substring(0,6);
        String s="";
        for (int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        String res=s+" "+w[1];
        System.out.println(res);
    }
    public static void rev(){
        String s="Hek ek";
        String s1="";
        String[] w=s.split(" ");
        for (int i=w[0].length()-1;i>=0;i--){
            s1=s1+w[0].charAt(i);
        }
        String res=s1+" "+w[1];
        System.out.println(res);
    }
    public static void revv(){
        String name="Hello World";
        String s="";
        String[] w=name.split(" ");
        for (int i=w[1].length()-1;i>=0;i--){
            s=s+w[1].charAt(i);
        }
        String res=w[0]+" "+s;
        System.out.println(res);
    }
}
