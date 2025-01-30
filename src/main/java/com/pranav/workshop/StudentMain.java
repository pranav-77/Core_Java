package com.pranav.workshop;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1,"pranav","IT",76),
                new Student(2,"achu","cse",65),
                new Student(3,"kichu","IT",45),
                new Student(4,"sachu","cse",89),
                new Student(5,"alan","mech",44)
        );

        List<Student> students1 = students.stream()
                .filter(student -> student.getMarks()>50)
                .toList();

//        System.out.println(students1);

        Map<String, List<Student>> listMap = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        listMap.forEach((s, students2) -> {
            System.out.println("dept: "+ s);
            List<Student> students3 = students2.stream().filter(student -> student.getMarks()>50)
                    .toList();
            students3.forEach(System.out::println);
        });

    }
}
