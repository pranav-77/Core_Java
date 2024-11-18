package com.pranav.fileIO.csv;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCsvWrite {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\studentList2.csv");
        try {
            file.createNewFile();
            System.out.println("File Created");
            CSVWriter writer=new CSVWriter(new FileWriter("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\studentList2.csv"));
            String[] head={"NAME", "AGE", "DEPT"};
            String[] set1={"Pranav", "22", "IT"};
            String[] set2={"Sagar", "23", "CSE"};
            String[] set3={"Rahul", "23", "MECHT"};
            String[] set4={"Praveen", "21", "CA"};
            String[] set5={"Ragu", "21", "MEC"};

//            writer.writeNext(head);
//            writer.writeNext(set1);
//            writer.writeNext(set2);
//            writer.writeNext(set3);
//            writer.writeNext(set4);
//            writer.writeNext(set5);
            List<String[]> list = new ArrayList<>();
            list.add(head);
            list.add(set1);
            list.add(set2);
            list.add(set3);
            list.add(set4);
            list.add(set5);

            writer.writeAll(list);
            writer.flush();
            writer.close();

            System.out.println("Written successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //hi im rasghuclass
    }
}
