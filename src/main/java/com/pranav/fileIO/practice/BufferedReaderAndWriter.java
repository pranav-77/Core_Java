package com.pranav.fileIO.practice;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\practice.txt"));
        writer.write("Achu");
        writer.newLine();
        writer.write("Sachu");
        writer.newLine();
        writer.write("Kichu");
        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\practice.txt"));
        String output = reader.readLine();
        while (output != null) {
            System.out.println(output);
            output = reader.readLine();
        }
    }
}
