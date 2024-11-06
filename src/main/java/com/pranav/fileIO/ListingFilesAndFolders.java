package com.pranav.fileIO;

import java.io.File;

public class ListingFilesAndFolders {
    public static void main(String[] args) {
        //Listing all files and folders
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\");
        String[] files = file.list();
        for (String s : files) {
            System.out.println(s);
        }

        //Listing only files
        file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\");
        File[] files1 = file.listFiles();
        System.out.println();
        for (File f : files1) {
            //f.isFile()
            if (f.isDirectory())
                System.out.println(f);
        }
    }
}
