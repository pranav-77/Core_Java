package com.pranav.demos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        int[] arr={7,8,9,10,10};
        Predicate<Integer> res = data -> data % 2==0;
        for (int i:arr){
            System.out.println(i+" "+ res.test(i));
        }
        int s=Arrays.stream(arr)
                .distinct()
                .sum();
        System.out.println(s);

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        // Map<String, List<Integer>> listMap=Arrays.stream(arr)
    }
}
