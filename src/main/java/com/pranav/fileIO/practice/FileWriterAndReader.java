package com.pranav.fileIO.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\practice.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Pranav\n");
            fileWriter.write("Praveen\n");
            fileWriter.write("Prenish\n");
            fileWriter.flush();
            fileWriter.close();

            FileReader fileReader = new FileReader(file);
            int count = fileReader.read();
            while (count != -1) {
                System.out.print((char) count);
                count = fileReader.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
