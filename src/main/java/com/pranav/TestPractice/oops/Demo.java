package com.pranav.TestPractice.oops;

public class Demo {
    private String name;
    private int rollNo;

    public Demo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Demo(String name) {
        this("pushpa",89);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
