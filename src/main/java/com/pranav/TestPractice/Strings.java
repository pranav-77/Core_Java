package com.pranav.TestPractice;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
//        palindrome("Malayalam");
//        anagram();
//        repeatingWords("ernakulam");
//        reverseWords();
//        noOfWords();
//        firstAndLastCaps();
//        firstLetterAndLast();
//        flCapital();
    }

    private static void flCapital() {
        String name = "Hii how are you";
        String s = "";
        String[] w = name.split(" ");
        for (int i = 0; i < w.length; i++) {
            s = s + Character.toUpperCase(w[i].charAt(0)) + w[i].substring(1, w[i].length() - 1) + Character.toUpperCase(w[i].charAt(w[i].length() - 1)) + " ";

        }
        System.out.println(s);
    }

    private static void firstLetterAndLast() {
        String name = "hello";
        String s = "";
        s = name.substring(0, 1).toUpperCase() + name.substring(1, name.length() - 1) + name.substring(name.length() - 1).toUpperCase();
        System.out.println(s);
    }

    private static void firstAndLastCaps() {
        String name = "hii how are you";
        String[] w = name.split(" ");
        String s = "";
        for (int i = 0; i < w.length; i++) {
            if (i == 0 || i == w.length - 1) {
                s = s + " " + w[i].toUpperCase();
            } else {
                s = s + " " + w[i];
            }
        }
        System.out.println(s);
    }

    private static void noOfWords() {
        String name = " hii  how are you ";
        name = name.replaceAll("\\s+", " ").trim();
        String[] w = name.split(" ");
        System.out.println(w.length);
    }

    private static void reverseWords() {
        String word = "Hello World";
        String[] w = word.split(" ");
        String s = "";
        for (int i = w.length - 1; i >= 0; i--) {
            s = s + " " + w[i];
        }
        System.out.println(s);
    }

    private static void repeatingWords(String name) {
        for (int i = 0; i < name.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j))
                    count++;
            }
            if (count > 0) {
                System.out.println(name.charAt(i));
            }
        }
    }

    private static void anagram() {
        String name1 = "the cat ran";
        String name2 = "cattheran";
        name1 = name1.toLowerCase().replaceAll("\\s", "");
        name2 = name2.toLowerCase().replaceAll("\\s", "");
        char[] ch1 = name1.toCharArray();
        char[] ch2 = name2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean res = Arrays.equals(ch1, ch2);
        if (res) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    private static void palindrome(String name) {
        String s = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            s = s + name.charAt(i);
        }
        if (s.equalsIgnoreCase(name)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
