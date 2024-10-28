package com.pranav.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFilter {
    public static void main(String[] args) {
        //filter used to filter the data from the given list
        List<Integer> l= Arrays.asList(25,50,89,67,54,50);
        Optional<Integer> op=l.stream()
                .distinct()
//                .limit(2)
//                .skip(1)
                .sorted()
                .filter(num->num%2==0)
                .findFirst();
        System.out.printf(String.valueOf(op));
    }
}
