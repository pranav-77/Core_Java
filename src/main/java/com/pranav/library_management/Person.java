package com.pranav.library_management;

public class Person {
    String name;
    int ID;

    public Person(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
