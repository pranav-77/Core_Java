package com.pranav.inheritance;

public class Department extends College{
    public void DepartmentRule1(){
        System.out.println("Morning Break 15 min");
    }
    public void DepartmentRule2(){
        System.out.println("Lunch Break 30 min");
    }

    @Override
    public void rule3() {
        System.out.println("RULE 3");
        super.rule3();
    }

    private void rules(){
        System.out.println("morning no class");
    }

    public static void main(String[] args) {
        Department ch=new Department();
        System.out.println(ch.a);
        ch.rule1();
        ch.rule2();
        ch.rule3();
        ch.rules();
        ch.DepartmentRule1();
        ch.DepartmentRule2();
    }
}
