package com.pranav.oop;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Address Book");
        while (true) {
            System.out.println("Choose one option");
            System.out.println("1. Add Contact Details");
            System.out.println("2. Review Contact Details");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    while (true) {
                        System.out.println("Enter Name");
                        String Name = sc.next();

                        System.out.println("Enter Age");
                        int age=sc.nextInt();

                        System.out.println("Enter Address");
                        String address = sc.next();

                        System.out.println("Enter Phone number");
                        String phone = sc.next();
                        Contact contact=new Contact(Name,age,address,phone);
                        addressBook.addContact(contact);
                        break;
                    }
                }
                break;
                case 2: {
                    addressBook.displayContacts();
                    break;
                }
                case  3:{
                    System.exit(0);
                }
            }
        }
    }
}