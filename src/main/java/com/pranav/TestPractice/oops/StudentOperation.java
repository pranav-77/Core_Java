package com.pranav.TestPractice.oops;

import java.util.*;
import java.util.stream.Collectors;

public class StudentOperation {
    static List<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        students = Arrays.asList(
                new Student("Pranav", 21, 87, 76, 90),
                new Student("Alan", 32, 56, 65, 43),
                new Student("Babu", 43, 89, 56, 98),
                new Student("Jishnu", 23, 32, 40, 35),
                new Student("Ramesh", 22, 54, 42, 65),
                new Student("Logan", 41, 23, 34, 43));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display");
            System.out.println("2. Total Marks");
            System.out.println("3. Pass and Fail");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    display(students);
                    break;
                }
                case 2: {
                    totalMark(students);
                    break;
                }
                case 3: {
                    passAndFail(students);
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
    }

    private static void passAndFail(List<Student> students) {
        students
                .stream()
                .filter(data -> data.getChemistry() < 40 || data.getPhysics() < 40 || data.getMaths() < 40)
                .forEach(student -> System.out.println(student.getName() + " " + student.getRollNo()));
    }


    private static void totalMark(List<Student> students) {
        students
                .stream()
                .map(data -> {
                    int total = data.getChemistry() + data.getPhysics() + data.getMaths();
                    return data.getName() + ":" + total;
                })
                .forEach(System.out::println);
    }

    private static void display(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No Results Present");
        } else {
            students.forEach(System.out::println);
        }
    }


}
