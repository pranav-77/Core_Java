package com.pranav.java8FeaturesProblems.problem7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PolicyOperations {
    static List<Policy> policyList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        policyList = Arrays.asList(
                new Policy("POL12345", "P1001", LocalDate.of(2024, 11, 21), 5000, "Active"),
                new Policy("POL23424", "P1002", LocalDate.of(2024, 12, 1), 4500, "Active"),
                new Policy("POL12345", "P1003", LocalDate.of(2023, 12, 5), 2800, "Expired"),
                new Policy("POL78960", "P1004", LocalDate.of(2025, 2, 26), 8000, "Active"),
                new Policy("POL78966", "P1005", LocalDate.of(2024, 1, 11), 6000, "Expired"),
                new Policy("POL45678", "P1006", LocalDate.of(2026, 10, 9), 7000, "Active"),
                new Policy("POL98765", "P1007", LocalDate.of(2025, 2, 18), 4000, "Active")
        );
        while (true) {
            System.out.println("1. Display Details");
            System.out.println("2. Filter Policies");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    display(policyList);
                    break;
                }
                case 2: {
                    filterPoliciesBy(policyList);
                    break;
                }
                case 3: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    private static void filterPoliciesBy(List<Policy> policyList) {
        LocalDate now = LocalDate.now();
        LocalDate days = now.plusMonths(1);
        List<Policy> policyDetails = policyList
                .stream()
                .filter(policy -> "Active".equalsIgnoreCase(policy.getStatus()))
                .filter(policy -> !policy.getDate().isBefore(now))
                .filter(policy -> !policy.getDate().isAfter(days))
                .collect(Collectors.toList());
        if (policyDetails.isEmpty()) {
            System.out.println("No Records");
        } else {
            policyDetails.forEach(System.out::println);
        }
    }

    private static void display(List<Policy> policyList) {
        if (policyList.isEmpty()) {
            System.out.println("No Data Found");
        } else {
            policyList.forEach(System.out::println);
        }
    }

}
