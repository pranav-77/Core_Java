package com.pranav.fileIO;

import java.io.File;
import java.io.IOException;

public class FolderAndFileCreation {
    public static void main(String[] args) throws IOException {
        //Folder Creation
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files");
        boolean res = file.exists();
        if (!res) {
            file.mkdir();
            System.out.println("File created");
        }

        //Sub Folder Creations
        file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\file1\\file2");
        if (!file.exists()) {
            file.mkdirs();
            System.out.println("Multiple folders created");
        }

        //file creation
        file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\document.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File added");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File added");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
