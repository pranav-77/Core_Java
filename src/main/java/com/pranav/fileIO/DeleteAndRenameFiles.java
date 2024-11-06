package com.pranav.fileIO;

import java.io.File;

public class DeleteAndRenameFiles {
    public static void main(String[] args) {
        //Deleted folder
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\file1\\file2");
        file.delete();
        System.out.println("Deleted");

        //Deleted File
        file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\document.txt");
        file.delete();
        System.out.println("File deleted");

        //Rename file
        file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\text.txt");
        File newFile = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\document.txt");
        file.renameTo(newFile);
        System.out.println("Renamed");

        //File name
        System.out.println(newFile.getName());
    }
}
