package com.pranav.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 6, 3, 4, 9, 2, 6, 1, 7);

        List<Integer> collect1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique elements :" + collect1);

        Optional<Integer> secondEle = list.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
        System.out.println("2nd largest element " + secondEle);
        //filter
        List<Integer> collect = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        //map
        list.stream().map(n -> n * 2).forEach(System.out::println);
        List<String> names = Arrays.asList("ABc", "xyz", "mno", "Goutham");

        List<String> collect2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect2);
        //uppercase


        //List<String> startsWith = names.stream().filter(name -> name.startsWith("G")).collect(Collectors.toList());
        names.stream().filter(n -> n.startsWith("G")).forEach(System.out::println);
        names.stream().filter(n -> n.endsWith("m")).forEach(System.out::println);


    }
}
