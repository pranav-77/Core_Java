package com.pranav.practice;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Students students=new Students();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Add details");
            System.out.println("2. display details");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:{
                    System.out.println("Enter details");
                    String name= sc.nextLine();
                    int rollNo= sc.nextInt();
                    int maths= sc.nextInt();
                    int chemistry=sc.nextInt();
                    int physics=sc.nextInt();
                    Student student=new Student(name,rollNo,maths,chemistry,physics);
                    students.addStudents(student);
                    break;
                }
                case 2:{
                    students.display();
                    break;
                }
            }
        }
    }

}
