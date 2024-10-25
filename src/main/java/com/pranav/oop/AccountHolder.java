package com.pranav.oop;

public class AccountHolder {
    public static void main(String[] args) {
        Bank client1=new Bank("Pranav",0);
        Bank client2=new Bank("achu",0);

        client1.Deposit(1000);
        client1.Withdrawal(-5);
        System.out.println(client1.getBal());
    }
}
