package com.pranav.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankOperations {
    List<Bank> banks=new ArrayList<>();

    public void addAccount(Bank bank){
        banks.add(bank);
        System.out.println("Account Added Successfully");
    }

    public void display(){
        if (banks.isEmpty()){
            System.out.println("Please add contacts");
        }else{
            for (Bank b:banks){
                System.out.println(b);
            }
        }
    }

    public void findDetails(String name){
        for (Bank bank:banks){
            if (bank.getName().equalsIgnoreCase(name)) {
                System.out.println(bank);
                break;
            }
        }
    }

    public void deposit(long accNo, Scanner sc){
        Bank bank=find(accNo);
        if (bank!=null){
            System.out.println("Enter amount to deposit");
            int amount= sc.nextInt();
            bank.setBalance(amount);
            System.out.println("Current Balance: "+bank.getBalance());
        }
    }

    public  Bank find(long accNo){
        for (Bank bank:banks){
            if (bank.getAccountNo()==accNo){
                return bank;
            }
        }
        return null;
    }
}
