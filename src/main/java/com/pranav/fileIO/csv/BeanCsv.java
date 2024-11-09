package com.pranav.fileIO.csv;

import com.opencsv.bean.CsvBindByName;

public class BeanCsv {
    @CsvBindByName(column = "NAME", required = true)
    private String name;

    @CsvBindByName(column = "AGE", required = true)
    private String age;

    @CsvBindByName(column = "DEPT", required = true)
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString(){
        return "Name:"+getName()+" Age:"+getAge()+" Dept:"+getDept();
    }
}
