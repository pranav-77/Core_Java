package com.pranav.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\practice.txt");
        String data = "Hii how are you";
        Files.write(path, data.getBytes());
        System.out.println("Data written successfully");

        byte[] bytes = Files.readAllBytes(path);
        String content = new String(bytes);
        System.out.println(content);
    }
}
