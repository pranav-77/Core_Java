package com.pranav.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(3,5,6,9,1,2);
        List<Integer> sort=l
                .stream()
                .sorted((a,b) -> b - a).collect(Collectors.toList());
        System.out.println(sort);

        Optional<Integer> op=l.stream().sorted((a, b)->b-a).skip(1).findFirst();
        System.out.println(op);

        List<String> li=Arrays.asList("Abc","Cba","Zxa","Kou");
        li
                .stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);
        List<String> list=li
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
