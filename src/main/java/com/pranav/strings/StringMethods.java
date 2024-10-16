package com.pranav.strings;

import java.util.Arrays;

public class StringMethods {
    public static void NoOfCharacter(String s1, String s2) {
        System.out.println("Number of Characters:" + s1.length());
        char[] ch = s2.toCharArray();
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (ch[i] != ' ')
                count++;
        }
        System.out.println("The characters present:" + count);
    }

    public static void Words(String s1, String s2) {
        int count1 = 1;
        int count2 = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ')
                count1++;
        }
        System.out.println("Number of words present in name1:" + count1);
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ')
                count2++;
        }
        System.out.println("Number of words present in name2:" + count2);
    }

    public static void Anagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        s1 = s1.replaceAll("//s", "");
        s2 = s2.replaceAll("//s", "");

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean res = Arrays.equals(ch1, ch2);

        if (res)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

    }

    public static void Reverse(String s1, String s2) {
        System.out.println("After Reversal");
        StringBuilder w = new StringBuilder();
        for (int i = s1.length() - 1; i >= 0; i--) {
            w.append(s1.charAt(i));
        }
        System.out.println(w);
        System.out.println(w.reverse());
        String[] s = s2.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
//        String FirstWord = new StringBuilder(s[0]).reverse().toString();
//        System.out.println(FirstWord+" "+s[1]);
//        System.out.println();
    }

    public static void Equals(String s1, String s2) {
        boolean res = s1.equals(s2);
        if (res)
            System.out.println("Two strings are Equal");
        else
            System.out.println("Two strings are not Equal");
    }

    public static void SubString(String s1, String s2) {
        String sub1 = s1.substring(2);
        System.out.println("SubString:" + sub1);

        String sub2 = s2.substring(0, 3);
        System.out.println("SubString:" + sub2);
    }

    public static void Index(String s1, String s2) {
        int index1 = s1.indexOf('v');
        System.out.println("The index of v:" + index1);

        int index2 = s2.lastIndexOf('a');
        System.out.println("The last index of a:" + index2);
    }

    public static void Count(String s1) {
        int count1 = 0;
        char ch = 'a';
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ch)
                count1++;
        }
        System.out.println("The given character is present :" + count1 + " times");
    }

    public static void trim(String s1) {
        String trimmed = s1.trim();
        System.out.println("After trimmed: " + trimmed);
    }

    public static void main(String[] args) {
        String name1 = "Pranav";
        String name2 = "Hii my name is Pranav";

        NoOfCharacter(name1, name2);
        System.out.println();
        Words(name1, name2);
        System.out.println();
        Anagram(name1, name2);
        System.out.println();
        Reverse(name1, name2);
        System.out.println();
        Equals(name1, name2);
        System.out.println();
        SubString(name1, name2);
        System.out.println();
        Index(name1, name2);
        System.out.println();
        Count(name1);
        System.out.println();
        trim(name1);
        System.out.println();

    }
}
