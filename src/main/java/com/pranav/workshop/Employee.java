package com.pranav.workshop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        Contact c1 = new Contact("Akash", 23, 1000);
        Contact c2 = new Contact("Binu", 23, 20000);
        Contact c3 = new Contact("Alan", 28, 2000);
        Contact c4 = new Contact("Pranav", 16, 3000);
        Contact c5 = new Contact("Alwin", 25, 10000);
        List<Contact> contact = Arrays.asList(c1, c2, c3, c4, c5);

        List<Contact> c = contact
                .stream()
                .filter(name -> name.getAge() > 22 && name.getName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(c);
    }
}
