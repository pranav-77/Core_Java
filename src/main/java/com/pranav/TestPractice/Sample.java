package com.pranav.TestPractice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        address a=new address();
        a.name="raghu";
        a.number=123456789;
        address b=new address();
        b.name="pranav";
        b.number=1;

        File f=new File("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\practice.txt");
        FileWriter fw=new FileWriter(f);
        fw.write(a+"\n");
//        fw.write(b.name+" "+b.number);
        fw.flush();
        fw.close();

        FileReader fr=new FileReader(f);
        int ch=fr.read();
        String s=null;

        while (ch!=-1){
            System.out.print((char) ch);
            s+=(char) ch;
            ch= fr.read();
        }


    }
}


class address
{
    String name;
    long number;
}
