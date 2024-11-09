package com.pranav.practice;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BankOperations bankOperations=new BankOperations();
        while (true){
            System.out.println("1. Add Account");
            System.out.println("2. Display All Account");
            System.out.println("3. search contact");
            System.out.println("4. Deposit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:{
                    System.out.println("Add name accno and ifsc");
                    String name= sc.next();
                    long accountNo= sc.nextLong();
                    String ifsc=sc.next();
                    Bank bank=new Bank(name,accountNo,ifsc,0);
                    bankOperations.addAccount(bank);
                    break;
                }
                case 2:{
                    bankOperations.display();
                    break;
                }
                case 3:{
                    System.out.println("Enter name to search");
                    String name= sc.next();
                    bankOperations.findDetails(name);
                    break;
                }
                case 4:{
                    System.out.println("Enter the account number to make deposit");
                    long accNo= sc.nextLong();
                    bankOperations.deposit(accNo,sc);
                    break;
                }
                default:{
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }
}
