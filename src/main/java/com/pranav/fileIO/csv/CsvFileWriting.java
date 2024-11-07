package com.pranav.fileIO.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriting {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\demo.csv");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created");
        }

        //File writing in csv
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.append("Name,RollNo,Marks\n");
        fileWriter.append("Pranav,23,87\n");
        fileWriter.append("Sagar,34,76\n");
        fileWriter.append("Rahul,30,79\n");
        fileWriter.flush();
        fileWriter.close();
        System.out.println("File created");
    }
}
