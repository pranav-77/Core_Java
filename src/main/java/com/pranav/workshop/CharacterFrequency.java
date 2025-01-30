package com.pranav.workshop;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String name = "hii hlo hii";
//        Map<Character, Long> frequency = name.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//        System.out.println(frequency);

        Map<String, Integer> frequency = new HashMap<>();
        String[] ch = name.split(" ");
        for (String c : ch) {
            if (frequency.containsKey(c)){
                frequency.put(c, frequency.get(c)+1);
            } else {
                frequency.put(c, 1);
            }
        }
        System.out.println(frequency);
    }
}
