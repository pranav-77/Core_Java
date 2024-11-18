package com.pranav.java8FeaturesProblems.problem6;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FraudDetectionOperations {
    static List<FraudDetection> fraudDetections = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fraudDetections = Arrays.asList(
                new FraudDetection(1001, "P123456", 12000, LocalDate.of(2024, 10, 22), true),
                new FraudDetection(1002, "P258963", 2500, LocalDate.of(2023, 11, 17), false),
                new FraudDetection(1003, "P789565", 10000, LocalDate.of(2022, 3, 15), false),
                new FraudDetection(1004, "P123456", 10500, LocalDate.of(2024, 8, 5), true),
                new FraudDetection(1005, "P789452", 1000, LocalDate.of(2023, 1, 12), false),
                new FraudDetection(1006, "P258963", 4000, LocalDate.of(2020, 5, 24), true)
        );
        while (true) {
            System.out.println("1. Display");
            System.out.println("2. Filter those who are fraud with amount > 10000");
            System.out.println("3. Group By Policy Number");
            System.out.println("4. Calculate total number of fraud and transaction");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    display(fraudDetections);
                    break;
                }
                case 2: {
                    filter(fraudDetections);
                    break;
                }
                case 3: {
                    groupByPolicy(fraudDetections);
                    break;
                }
                case 4: {
                    calculateFraudTransaction(fraudDetections);
                    break;
                }
                case 5: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
    }

    private static void calculateFraudTransaction(List<FraudDetection> fraudDetections) {
        Map<String, DoubleSummaryStatistics> policyAggregates = fraudDetections.stream()
                .filter(FraudDetection::isFraudulent)
                .collect(Collectors.groupingBy(
                        FraudDetection::getPolicyNumber,
                        Collectors.summarizingDouble(FraudDetection::getAmount)
                ));

        policyAggregates.forEach((policy, stats) -> {
            System.out.println("Policy: " + policy);
            System.out.println("Total Fraudulent Transactions: " + stats.getCount());
            System.out.println("Total Fraud Amount: " + stats.getSum());
            System.out.println();
        });
    }

    private static void groupByPolicy(List<FraudDetection> fraudDetections) {
        Map<String, List<FraudDetection>> policyList = fraudDetections
                .stream()
                .collect(Collectors.groupingBy(FraudDetection::getPolicyNumber));
        policyList.forEach((policy, policyList1) -> {
            System.out.println("Policy: " + policy);
            policyList1.forEach(fraudDetection -> System.out.println("Transaction id: " + fraudDetection.getTransactionId() + ", "
                    + "Amount: " + fraudDetection.getAmount() + ", " + "Date: " + fraudDetection.getTransactionDate() + ", isFraudulent: " + fraudDetection.isFraudulent()));
        });
    }

    private static void filter(List<FraudDetection> fraudDetections) {
        fraudDetections
                .stream()
                .filter(data -> data.isFraudulent() && data.getAmount() > 10000)
                .forEach(System.out::println);
    }

    private static void display(List<FraudDetection> fraudDetections) {
        if (!fraudDetections.isEmpty()) {
            fraudDetections.forEach(System.out::println);
        } else {
            System.out.println("No Data Available");
        }
    }
}
