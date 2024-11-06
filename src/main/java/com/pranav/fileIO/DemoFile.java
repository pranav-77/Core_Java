package com.pranav.fileIO;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        //  write file
        try {
            File file = new File("c:\\Users\\Admin\\Desktop\\FileIO\\Demo2.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Java is backend");
            fileWriter.close();
            System.out.println("File is created successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File filepath = new File("c:\\Users\\Admin\\Desktop\\FileIO\\Demo.txt");
        FileReader reader = new FileReader(filepath);
        int i;
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
//        //read file
        String filePath = "c:\\Users\\Admin\\Desktop\\FileIO\\Employee.csv";
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(filepath))) {
            String[] header = {"Id", "Name", "Address"};
            csvWriter.writeNext(header);
            String[] values = {"102", "Goutham", "Bengaluru"};
            csvWriter.writeNext(values);
            System.out.println("Csv file is created");
            System.out.println("File is created successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
