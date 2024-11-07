package com.pranav.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriterAndReader {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\document.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("How are you");
        fileWriter.write("\nHii\nHello\nHow\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader=new FileReader(file);
        int count=fileReader.read();
        while (count!=-1){
            System.out.print((char) count);
            count=fileReader.read();
        }
    }
}
