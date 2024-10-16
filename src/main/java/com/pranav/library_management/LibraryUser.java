package com.pranav.library_management;

public abstract class LibraryUser extends Person {
    public LibraryUser(String name, int ID) {
        super(name, ID);
    }

    public abstract void register();

    public abstract void borrowBook(Book book);
}
