package com.pranav.fileIO;

import java.io.*;

public class BufferedReadAndWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\text.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created");
        }

        //Buffered writer
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("English");
        bufferedWriter.newLine();
        bufferedWriter.write("Malayalam");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

        //Buffered reader
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String output = bufferedReader.readLine();
        while (output != null) {
            System.out.println(output);
            output = bufferedReader.readLine();
        }
    }
}
