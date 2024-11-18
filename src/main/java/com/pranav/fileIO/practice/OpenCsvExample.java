package com.pranav.fileIO.practice;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OpenCsvExample {
    public static void main(String[] args) throws IOException, CsvException {
        File file =new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\opencsv.csv");
        file.createNewFile();
        CSVWriter writer=new CSVWriter(new FileWriter(file));
        String[] head={"NAME", "AGE", "DEPARTMENT"};
        String[] set2={"Achu", "22", "IT"};
        String[] set3={"Sachu", "21", "CA"};
        String[] set4={"Kichu", "16", "MECH"};
        String[] set5={"Alan", "23", "CSE"};
        String[] set6={"Akhil", "24", "IT"};

        List<String []> list= Arrays.asList(head, set2, set3, set4, set5, set6);
        writer.writeAll(list);
        writer.flush();
        writer.close();

        CSVReader reader=new CSVReader(new FileReader(file));
        List<String[]> output=reader.readAll();
        for (String[] data : output){
            for (String datum : data) {
                System.out.print(datum + " ");
            }
            System.out.println();
        }

//        while (output!=null){
//            for (int i=0;i< output.length;i++){
//                System.out.print(output[i]+" ");
//            }
//            System.out.println();
//            output=reader.readNext();
//        }
    }
}
