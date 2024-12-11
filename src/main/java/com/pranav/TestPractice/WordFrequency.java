package com.pranav.TestPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void main(String[] args) {
        word("vidhya sagar elangovan");

        String input = "vidhya sagar elangovan";
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(frequencyMap);
    }

    public static void word(String n) {
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        char ch[] = n.toCharArray();
        for (char c : ch) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        System.out.println(m);
    }

    public static Map<String, Integer> wordFrequency(String input) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
