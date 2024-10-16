package com.pranav.inheritance;

public class Students extends Department{
    String s="Good Morning";
    public void opinion(){
        System.out.println("We need Holidays on weekend");
    }
    public static void main(String[] args) {
        Students s=new Students();
        System.out.println(s.s);
        System.out.println(s.a);
        s.opinion();
        s.rule1();
        s.DepartmentRule1();
    }
}
