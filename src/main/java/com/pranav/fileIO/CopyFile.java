package com.pranav.fileIO;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Screenshot 2024-05-22 173522.png");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\img.png");
        try {
            int value = inputStream.read();
            while (value != -1) {
                outputStream.write(value);
                value = inputStream.read();
            }
            outputStream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
