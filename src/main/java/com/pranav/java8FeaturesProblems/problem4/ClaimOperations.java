package com.pranav.java8FeaturesProblems.problem4;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class ClaimOperations {
    static List<ClaimAnalysis> claimAnalyses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        claimAnalyses = Arrays.asList(
                new ClaimAnalysis("C123456", "PN987654", 8000, LocalDate.of(2024, 10, 24), "Approved"),
                new ClaimAnalysis("C234567", "PN456738", 10000, LocalDate.of(2023, 5, 15), "Not Approved"),
                new ClaimAnalysis("C456789", "PN788798", 4000, LocalDate.of(2024, 12, 25), "Not Approved"),
                new ClaimAnalysis("C546780", "PN788798", 12000, LocalDate.of(2022, 11, 14), "Approved"),
                new ClaimAnalysis("C564876", "PN987654", 3000, LocalDate.of(2023, 8, 5), "Approved"),
                new ClaimAnalysis("C058487", "PN456736", 13000, LocalDate.of(2021, 2, 13), "Not Approved")
        );
        while (true) {
            System.out.println("1. Display All Policy Claims");
            System.out.println("2. Filter the Approved claims more than 5000");
            System.out.println("3. Group Claims By Policy Number");
            System.out.println("4. For Each Policies Calculate Average");
            System.out.println("5. Top Three Policies with Highest Claims");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    display(claimAnalyses);
                    break;
                }
                case 2: {
                    filterClaims(claimAnalyses);
                    break;
                }
                case 3: {
                    groupClaims(claimAnalyses);
                    break;
                }
                case 4: {
                    calculateAverage(groupClaims(claimAnalyses));
                    break;
                }
                case 5: {
                    topThreePolices(claimAnalyses);
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
    }

    private static void topThreePolices(List<ClaimAnalysis> claimAnalyses) {
        System.out.println("Top three highest claim policies");
        claimAnalyses
                .stream()
                .sorted(Comparator.comparing(ClaimAnalysis::getClaimAmount).reversed())
                .limit(3)
                .forEach(ClaimAnalysis -> System.out.println("Policy No: " + ClaimAnalysis.getPolicyNumber() + ", Amount: " + ClaimAnalysis.getClaimAmount()));
    }

    private static void calculateAverage(List<ClaimAnalysis> claimAnalyses) {
        System.out.println("Average Amount:");
        Map<String, Double> listOfAverage = claimAnalyses
                .stream()
                .collect(Collectors.groupingBy(ClaimAnalysis::getPolicyNumber, Collectors.averagingDouble(ClaimAnalysis::getClaimAmount)));
        listOfAverage.forEach((policy, average) -> {
            System.out.println("Policy No: " + policy + ", Average Amount: " + average);
        });
    }

    private static List<ClaimAnalysis> groupClaims(List<ClaimAnalysis> claimAnalyses) {
        Map<String, List<ClaimAnalysis>> listMap = claimAnalyses
                .stream()
                .collect(Collectors.groupingBy(ClaimAnalysis::getPolicyNumber));
        listMap.forEach((policy, policyList) -> {
            System.out.println("Policy ID: " + policy);
            policyList.forEach(System.out::println);
            System.out.println("____________________________________");
        });
        return claimAnalyses;
    }

    private static void filterClaims(List<ClaimAnalysis> claimAnalyses) {
        List<ClaimAnalysis> list = claimAnalyses
                .stream()
                .filter(data -> data.getClaimStatus().equalsIgnoreCase("Approved") && data.getClaimAmount() >= 5000)
                .collect(Collectors.toList());
        if (list.isEmpty()) {
            System.out.println("No claims found");
        } else {
            list.forEach(System.out::println);
        }
    }

    private static void display(List<ClaimAnalysis> claimAnalyses) {
        if (claimAnalyses.isEmpty()) {
            System.out.println("The Policy Claim is Empty");
        } else {
            claimAnalyses.forEach(System.out::println);
        }
    }
}
