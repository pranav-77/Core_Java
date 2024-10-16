package com.pranav.library_management;

public class Librarian extends LibraryUser {
    public Librarian(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void register() {
        System.out.println(name + " is registered as a Librarian");
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("Librarian Don't Borrow Books");
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println(name+" added the book "+book.getTitle()+" to the library");
    }
}
