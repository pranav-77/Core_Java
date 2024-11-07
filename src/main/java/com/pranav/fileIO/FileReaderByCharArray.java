package com.pranav.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderByCharArray {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\document.txt");

        FileReader fileReader = new FileReader(file);
        char[] ch = new char[(int) file.length()];
        System.out.println(ch.length);
        try {
            fileReader.read();
            for (char c : ch) {
                System.out.print(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
