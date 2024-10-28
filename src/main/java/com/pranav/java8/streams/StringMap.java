package com.pranav.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StringMap {
    public static void main(String[] args) {
        //Map are used when you need to process the whole data
        List<String> l= Arrays.asList("Binu","Akash","Calvin","Eden","Diamond");
        List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        l.stream()
                .map(name -> name+" B.E")
                .forEach(System.out::println);
        l1
                .stream()
                .map(num -> num*2)
                .forEach(System.out::println);
    }
}
