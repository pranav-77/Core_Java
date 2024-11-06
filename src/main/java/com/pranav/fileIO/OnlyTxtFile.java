package com.pranav.fileIO;

import java.io.File;

public class OnlyTxtFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String fileName = f.getName();
                int lastDot = fileName.lastIndexOf(".");
                String extension = fileName.substring(lastDot + 1);
                if (extension.equals("lnk")) {
                    System.out.println(fileName);
                }
            }
        }

        System.out.println();
        File file1 = new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\");
        File[] files1 = file1.listFiles();
        for (File file2 : files1) {
            if (file2.isFile()) {
                String name = file2.getName();
                int lastDot = name.lastIndexOf(".");
                String ext = name.substring(lastDot + 1);
                if (ext.equals("txt")) {
                    System.out.println(name);
                }
            }
        }
    }
}
