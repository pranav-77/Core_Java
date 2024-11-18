package com.pranav.java8FeaturesProblems.problem7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PolicyOperations {
    static List<Policy> policyList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        policyList= Arrays.asList(
                new Policy("POL12345","P1001", LocalDate.of(2024,5,21),5000,"Active"),
                new Policy("POL23424","P1002", LocalDate.of(2023,6,1),4500,"Pending"),
                new Policy("POL12345","P1003", LocalDate.of(2022,4,5),2800,"Active"),
                new Policy("POL78960","P1004", LocalDate.of(2021,2,26),8000,"Not Active"),
                new Policy("POL78966","P1005", LocalDate.of(2020,1,11),6000,"Completed"),
                new Policy("POL45678","P1006", LocalDate.of(2023,10,9),7000,"Pending"),
                new Policy("POL98765","P1007", LocalDate.of(2024,9,18),4000,"Active")
                );
        while (true) {
            System.out.println("1. Display Details");
            System.out.println("2. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    display(policyList);
                    break;
                }
                case 2: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid input");
                }
            }
        }
    }

    private static void display(List<Policy> policyList) {
        if (policyList.isEmpty()){
            System.out.println("No Data Found");
        } else {
            policyList.forEach(System.out::println);
        }
    }

}
