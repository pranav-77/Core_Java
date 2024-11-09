package com.pranav.practice;

public class Bank {
    private String name;
    private long accountNo;
    private String ifsc;
    private int balance;

    public Bank(String name, long accountNo, String ifsc, int balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.ifsc = ifsc;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" + "AccountNo: " + getAccountNo() + "\n" + "IFSC: " + getIfsc() + "\n" + "Balance: " + getBalance();
    }
}
