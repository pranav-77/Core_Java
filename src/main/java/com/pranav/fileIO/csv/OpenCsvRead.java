package com.pranav.fileIO.csv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class OpenCsvRead {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader reader=new CSVReader(new FileReader("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\studentList2.csv"));
        try {
            //Using ReadAll
            List<String[]> list=reader.readAll();
            for (String[] data:list){
                for (int i=0;i< data.length;i++){
                    System.out.print(data[i]+" ");
                }
                System.out.println();
            }

            //Using ReadNext
            System.out.println();
            String[] data=reader.readNext();
            while (data!=null){
                for (int i=0;i< data.length;i++){
                    System.out.print(data[i]+" ");
                }
                System.out.println();
                data= reader.readNext();
            }

        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
