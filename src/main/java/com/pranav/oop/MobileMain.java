package com.pranav.oop;

import java.util.Scanner;

public class MobileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile mobile = new Mobile();
        while (true) {
            System.out.println("1. Add Mobile Details");
            System.out.println("2. View Details");
            System.out.println("3. Delete Mobile Details");
            System.out.println("4. Edit Mobile Details");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Mobile Name, Ram, Price");
                    String name = sc.next();
                    int ram = sc.nextInt();
                    int price = sc.nextInt();
                    MobileDetails mobiles = new MobileDetails(name, ram, price);
                    mobile.addMobile(mobiles);
                    break;

                case 2:
                    System.out.println("Viewing Details");
                    mobile.display();
                    break;

                case 3:
                    System.out.println("Enter the mobile name to delete");
                    String deleteMobile = sc.next();
                    mobile.delete(deleteMobile);
                    break;

                case 4:
                    System.out.println("Enter the name to edit details of mobile");
                    String mobileName = sc.next();
                    mobile.editDetails(mobileName, sc);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
