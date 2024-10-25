package com.pranav.strings;

public class StringProblems {
    public static void main(String[] args) {
        String name=" Hello How are you ";
        ReverseFirstWord(name);
        NoOfWords(name);
        Character(name);
        FirstLast(name);
        ReArrange(name);
        RemoveDuplicates(name);
    }
    public static void ReverseFirstWord(String name){
        String trim=name.trim();
        String[] w=trim.split(" ");
        String s="";
        for (int i=w[0].length()-1;i>=0;i--){
            s+=w[0].charAt(i);
        }
        String s1="";
        for (int i=1;i<w.length;i++){
            s1=s1+" "+w[i];
        }
        String res=s+s1;
        System.out.println(res);
    }
    public static void NoOfWords(String name){
        String trim=name.trim();
        String[] w=trim.split(" ");
        System.out.println(w.length);
        int count=1;
        for (int i=0;i<trim.length();i++){
            if (trim.charAt(i)==' ')
                count++;
        }
        System.out.println("Words:"+count);
    }
    public static void Character(String name){
        name=name.toLowerCase();
        System.out.println(name.contains("hello"));
    }
    public static void FirstLast(String name){
        String trim=name.trim();
        String[] w=trim.split(" ");
        for (int i=0;i< w.length;i++){
            for (int j=0;j<w[i].length();j++){
                if (w[i].charAt(j)==' ')
                    break;
                System.out.print(w[i].charAt(j));
                System.out.print(" "+w[i].charAt(w[i].length()-1));
                System.out.println();
                break;
            }
        }
    }
    public static void ReArrange(String name){
        String trim=name.trim();
        String[] w=trim.split(" ");
        for (int i=0;i<w.length;i++){
            for (int j=0;j<w[i].length();j++){

            }
        }
    }
    public static void RemoveDuplicates(String name){
        String trim="swiss";
        String s="";
        for (int i=0;i<trim.length();i++){
            int count=0;
            for (int j=i+1;j<trim.length();j++){
                if (trim.charAt(i)==trim.charAt(j)){
                    count++;
                }
            }
            if (count==0){
                System.out.println(trim.charAt(i));
                break;
            }
        }
        //System.out.println(s);
    }
}
