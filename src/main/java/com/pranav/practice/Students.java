package com.pranav.practice;

import java.util.ArrayList;
import java.util.List;

public class Students {
    List<Student> students=new ArrayList<>();
    public void addStudents(Student student){
        students.add(student);
    }
    public void display() {
        int max = 0;
        String s = "";
        for (Student student : students) {
            int total = student.getChemistry() + student.getMaths() + student.getPhysics();
            if (total > max) {
                max = total;
                s = student.getName();
            }
        }
        System.out.println(s + " " + max);
    }
}
