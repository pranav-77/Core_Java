package com.pranav.inheritance;

public class College {
    int a = 100;

    public void rule1() {
        System.out.println("Dress code");
    }

    public void rule2() {
        System.out.println("Hair cut");
    }

    public void rule3() {
        System.out.println("Discipline");
    }

    public static void main(String[] args) {
        College c=new College();
        System.out.println(c.a);
        c.rule1();
        c.rule2();
        c.rule3();
    }
}
