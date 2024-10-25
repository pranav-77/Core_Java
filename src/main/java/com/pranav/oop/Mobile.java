package com.pranav.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mobile {
    List<MobileDetails> model = new ArrayList<>();

    public void addMobile(MobileDetails mobile) {
        model.add(mobile);
        System.out.println("Added Successfully");
    }

    public void display() {
        if (model.isEmpty()) {
            System.out.println("No mobiles available");
        } else {
            for (MobileDetails mobile : model) {
                System.out.println(mobile);
            }
        }
    }

    public MobileDetails findDetails(String name) {
        for (MobileDetails mobile : model) {
            if (mobile.getName().equalsIgnoreCase(name))
                return mobile;
        }
        return null;
    }

    public void editDetails(String name, Scanner sc) {
        MobileDetails mobileDetails = findDetails(name);
        System.out.println("Enter new Name");
        String newName = sc.next();
        mobileDetails.setName(newName);
        System.out.println("Enter new RAM");
        int ram = sc.nextInt();
        mobileDetails.setRam(ram);
        System.out.println("Enter new Price");
        int price = sc.nextInt();
        mobileDetails.setPrice(price);
        System.out.println("Edited Successfully");
    }

    public void delete(String name) {
        MobileDetails mobileDetails = findDetails(name);
        if (mobileDetails != null) {
            model.remove(mobileDetails);
            System.out.println("Deleted Successfully");
        } else
            System.out.println("Not Contact found");
    }
}
