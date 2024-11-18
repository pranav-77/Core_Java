package com.pranav.fileIO.practice;

import com.opencsv.bean.CsvBindByName;

public class StudentDetails {
    @CsvBindByName(column = "id", required = true)
    private int id;

    @CsvBindByName(column = "name", required = true)
    private String name;

    @CsvBindByName(column = "age", required = true)
    private int age;

    @CsvBindByName(column = "marks",required = true)
    private int marks;

    public StudentDetails(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString (){
        return "ID: "+id+", Name: "+name+", age: "+age+", marks: "+marks;
    }
}
