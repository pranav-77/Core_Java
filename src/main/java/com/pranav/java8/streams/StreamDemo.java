package com.pranav.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,4,3,2,7,6,7,5,8);
        List<Integer> li=l
                .stream()
                .filter(num -> num>5)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(li);
    }
}
