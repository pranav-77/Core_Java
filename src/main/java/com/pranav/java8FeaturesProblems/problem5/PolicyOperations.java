package com.pranav.java8FeaturesProblems.problem5;

import java.util.*;
import java.util.stream.Collectors;

public class PolicyOperations {
    static List<Policy> policyList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        policyList = Arrays.asList(
                new Policy(101, "Alan", 22, "Health", 3000),
                new Policy(102, "Aarav", 25, "Auto", 2500),
                new Policy(103, "Sneha", 60, "Life", 7000),
                new Policy(104, "Rajesh", 45, "Home", 6000),
                new Policy(105, "Priya", 28, "Health", 3200),
                new Policy(106, "Vikram", 35, "Auto", 2800),
                new Policy(107, "Anjali", 29, "Life", 5500),
                new Policy(108, "Sanjay", 50, "Home", 6500),
                new Policy(109, "Meera", 27, "Health", 3100),
                new Policy(110, "Ramesh", 33, "Auto", 2600),
                new Policy(111, "Divya", 31, "Life", 5200)
        );

        while (true) {
            System.out.println("1. Display List");
            System.out.println("2. Filter List");
            System.out.println("3. New list RiskAssessment");
            System.out.println("4. Sort By RiskScore");
            System.out.println("5. Categorise by high and low risk");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    display(policyList);
                    break;
                }
                case 2: {
                    System.out.println("Enter the policy type");
                    String policyType = sc.next();
                    System.out.println("Enter the age");
                    int age = sc.nextInt();
                    filterList(policyList, policyType, age);
                    break;
                }
                case 3: {
                    List<RiskAssessment> riskAssessmentList = riskAssessment(policyList);
                    riskAssessmentList.forEach(System.out::println);
                    break;
                }
                case 4: {
                    sortByRiskScore(riskAssessment(policyList));
                    break;
                }
                case 5: {
                    categoriseByRiskScore();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }

    private static void categoriseByRiskScore() {
        List<RiskAssessment> riskAssessments = riskAssessment(policyList);

        Map<Boolean, List<RiskAssessment>> categorizedRisk = riskAssessments.stream()
                .collect(Collectors.partitioningBy(risk -> risk.getRiskScore() > 100));

        System.out.println("High Risk:");
        categorizedRisk.get(true).forEach(System.out::println);

        System.out.println("\nLow Risk:");
        categorizedRisk.get(false).forEach(System.out::println);
    }

    private static void sortByRiskScore(List<RiskAssessment> riskAssessments) {
        riskAssessments
                .stream()
                .sorted(Comparator.comparing(RiskAssessment::getRiskScore))
                .forEach(System.out::println);
    }

    private static List<RiskAssessment> riskAssessment(List<Policy> policyList) {
        List<RiskAssessment> riskAssessmentList = policyList
                .stream()
                .map(policy -> new RiskAssessment(policy.getId(), policy.getName(), policy.getPremiumAmount() / (double) policy.getAge()))
                .collect(Collectors.toList());
        return riskAssessmentList;
    }

    private static void filterList(List<Policy> policyList, String policyType, int age) {
        List<Policy> policies = policyList
                .stream()
                .filter(data -> data.getPolicyType().equalsIgnoreCase(policyType) && data.getAge() >= age)
                .collect(Collectors.toList());
        if (policies.isEmpty())
            System.out.println("No Details Found");
        else
            policies.forEach(System.out::println);
    }

    private static void display(List<Policy> policyList) {
        if (policyList.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            policyList
                    .forEach(System.out::println);
        }
    }
}
