package com.pranav.fileIO.practice;

import com.google.gson.Gson;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee=new Employee("Pranav",8,6000);
        Gson gson=new Gson();
        String dataJson=gson.toJson(employee);
        System.out.println(dataJson);

        Employee emp=gson.fromJson(dataJson,Employee.class);
        System.out.println(emp);
    }
}
