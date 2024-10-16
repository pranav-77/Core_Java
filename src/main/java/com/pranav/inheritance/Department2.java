package com.pranav.inheritance;

public class Department2 extends College{
    String dep="Mechanical";
    public void DepartRule1(){
        System.out.println("No brakes");
    }
    public void DepartRule2(){
        System.out.println("Saturday Special Class");
    }
    public static void main(String[] args) {
        Department2 dd=new Department2();
        System.out.println(dd.dep);
        System.out.println(dd.a);
        dd.DepartRule1();
        dd.DepartRule2();
        dd.rule1();
    }
}
