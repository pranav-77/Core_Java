package com.pranav.fileIO.practice;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public static void main(String[] args) throws IOException, CsvException {
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\test2.csv");
        StudentDetails student1 = new StudentDetails(1, "Alan", 22, 89);
        StudentDetails student2 = new StudentDetails(2, "Akash", 21, 78);
        StudentDetails student3 = new StudentDetails(3, "Pranav", 23, 80);
        StudentDetails student4 = new StudentDetails(4, "Praveen", 20, 90);
        StudentDetails student5 = new StudentDetails(5, "prenish", 16, 67);

        CSVWriter writer = new CSVWriter(new FileWriter(file));
        String[] header = {"id", "name", "age", "marks"};
        writer.writeNext(header);
        List<StudentDetails> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));
        List<String[]> csvData = students.stream()
                .map(student -> new String[]{
                        String.valueOf(student.getId()),
                        student.getName(),
                        String.valueOf(student.getAge()),
                        String.valueOf(student.getMarks())
                })
                .collect(Collectors.toList());

        writer.writeAll(csvData);
        writer.flush();
        writer.close();


        CSVReader reader = new CSVReader(new FileReader(file));
        List<String[]> s = reader.readAll();
        s.stream().forEach(ss -> {

                    for (int i = 0; i < ss.length; i++) {
                        try {

                            if (Integer.parseInt(ss[3]) > 80) {
                                System.out.print(ss[i] + " ");
                            }
                        } catch (Exception e) {
                            continue;
                        }
                    }

                }
        );
    }
}
