package com.pranav.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileIO {
    private static final String FILE_PATH = "C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\students.txt";

    public static void writeStudentsToFile(List<String> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String student : students) {
                writer.write(student);
                writer.newLine();
            }
            System.out.println("Student data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<String> readStudentsFromFile() {
        List<String> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return students;
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Name: Alice, Roll No: 101, Marks: 85.5");
        students.add("Name: Bob, Roll No: 102, Marks: 92.0");
        students.add("Name: Charlie, Roll No: 103, Marks: 78.3");

        writeStudentsToFile(students);

        List<String> studentsFromFile = readStudentsFromFile();
        System.out.println("Reading student data from file:");
        for (String student : studentsFromFile) {
            System.out.println(student);
        }
    }
}
