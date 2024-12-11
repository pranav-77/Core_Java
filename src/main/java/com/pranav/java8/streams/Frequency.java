package com.pranav.java8.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        String input = "hello world";

        Map<String, Long> frequency = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        frequency.forEach((word, count) -> System.out.println(word + ": " + count));

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        frequencyMap.forEach((character, count) ->
                System.out.println(character + ": " + count)
        );
    }
}


