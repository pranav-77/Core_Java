package com.pranav.oop;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> contacts=new ArrayList<>();
    public void addContact(Contact contact) {
        boolean res=findContact(contact.getName());
        if (res) {
            contacts.add(contact);
            System.out.println("Contact Added Successfully");
        }else{
            System.out.println("Same Person present please check it");
        }
    }

    public void displayContacts() {
        if (contacts.isEmpty())
            System.out.println("The Contacts List is Empty Add Some Contacts By Choosing Option 1");
        for (Contact contact : contacts)
            System.out.println(contact);
    }
    public boolean findContact(String Name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(Name))
                return false;
        }
        return true;
    }
}
