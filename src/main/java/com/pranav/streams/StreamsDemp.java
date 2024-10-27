package com.pranav.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemp {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rohan","Pranv","Goutham","Sahil","Pavi","Pranv");
        List<Integer> listnum = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Character> list1=Arrays.asList('a','b','c','d');

//        List<String> startswirhChar= list.stream().filter(name -> name.startsWith("P")).collect(Collectors.toList());
//        System.out.println(startswirhChar);
        list1.stream().filter(a->a=='a'||a=='b').forEach(System.out::println);

        List<Integer> collect=listnum.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(collect);

        list.stream().distinct().forEach(System.out::println);
        listnum.stream().map(num->num*2).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //list.stream().filter(name -> name.startsWith("P")).forEach(System.out::println);

    }
}
