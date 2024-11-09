package com.pranav.java8FeaturesProblems.problem1;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOperations {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employeeList = Arrays.asList(
                new Employee(1, "Alan", "Engineering", 75000),
                new Employee(2, "Pranav", "Engineering", 86000),
                new Employee(3, "Akash", "IT", 65000),
                new Employee(4, "Nithin", "Mechanical", 50000));
        while (true) {
            System.out.println("1. Display Employee Details");
            System.out.println("2. Filter Employees By Department and Salary");
            System.out.println("3. Sort Employees By Salary");
            System.out.println("4. Group By Department");
            System.out.println("5. Calculate Average Salary of Department");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    display(employeeList);
                    break;
                }
                case 2: {
                    System.out.println("Enter the department and salary to sort");
                    String department = sc.next();
                    System.out.println("Salary");
                    int salary = sc.nextInt();
                    filter(employeeList, department, salary);
                    break;
                }
                case 3: {
                    sort(employeeList);
                    System.out.println("Sorted");
                    break;
                }
                case 4: {
                    groupByDepartment(employeeList);
                    break;
                }
                case 5: {
                    averageSalary(employeeList);
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

    private static void averageSalary(List<Employee> employeeList) {
        System.out.println("Average Salary by Department:");
        Map<String, Double> averageSalaries = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        averageSalaries.forEach((department, avgSalary) ->
                System.out.println("Department: " + department + ", Average Salary: " + avgSalary));
    }

    private static void groupByDepartment(List<Employee> employeeList) {
        Map<String, List<Employee>> list = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        list.forEach((department, employeeList1) -> {
            System.out.println("Department: " + department);
            employeeList1.forEach(System.out::println);
        });
    }

    private static void sort(List<Employee> employeeList) {
        List<Employee> list = employeeList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    private static void filter(List<Employee> employeeList, String department, int salary) {
        List<Employee> list = employeeList
                .stream()
                .filter(data -> data.getDepartment().equalsIgnoreCase(department) && data.getSalary() >= salary)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    public static void display(List<Employee> employeeList) {
        if (employeeList.isEmpty()) {
            System.out.println("No employees still registered");
        } else {
            for (Employee data : employeeList) {
                System.out.println(data);
            }
        }
    }
}
