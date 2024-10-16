package com.pranav.encapsulation;

public class Bank {
    private int atm_pin;
    private final int acc_num;
    private double salary;
    private final String ifsc;

    public Bank(int atm_pin, int acc_num, int salary, String ifsc) {
        this.atm_pin = atm_pin;
        this.acc_num = acc_num;
        this.salary = salary;
        this.ifsc = ifsc;
    }

    public double getSalary() {
        return salary;
    }

    public int getAtm_pin() {
        return atm_pin;
    }

    public void setAtm_pin(int atm_pin) {
        this.atm_pin = atm_pin;
    }

    public int getAcc_num() {
        return acc_num;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void display() {
        System.out.println("Atm pin:" + getAtm_pin());
        System.out.println("Account number:" + getAcc_num());
        System.out.println("Salary:" + getSalary());
        System.out.println("ifsc code:" + getIfsc());
    }

}
