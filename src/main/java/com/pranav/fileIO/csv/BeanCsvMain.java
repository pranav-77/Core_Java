package com.pranav.fileIO.csv;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class BeanCsvMain {
    public static void main(String[] args) throws IOException, CsvException {
        List<BeanCsv> list = new CsvToBeanBuilder<BeanCsv>(new FileReader("C:\\Users\\Sabarinathan\\OneDrive\\Desktop\\Files\\csv\\studentList2.csv"))
                .withType(BeanCsv.class)
                .build()
                .parse();
        for (BeanCsv data : list) {
            System.out.println(data);
        }
    }
}
