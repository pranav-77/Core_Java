package com.pranav.fileIO.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvFileReading {
    /*
    Two Approaches are there
    1. Scanner Class
    2. Split Method
    */
    public static void main(String[] args) throws Exception {
    /*    //Scanner Class
        String csv = "C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\demo.csv";
        FileReader fileReader = new FileReader(csv);
        Scanner sc = new Scanner(fileReader);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            System.out.print(sc.next() + " ");
        }
        sc.close();
     */
        //Split Method
        FileReader fileReader = new FileReader("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\demo.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] data = line.split(",");
            for (String d : data) {
                System.out.print(d + " ");
            }
            System.out.println();
            line = bufferedReader.readLine();
        }
    }
}
