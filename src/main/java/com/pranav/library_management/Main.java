package com.pranav.library_management;

public class Main {
    public static void main(String[] args) {

        Searchable library = new Library();

        Librarian librarian = new Librarian("Ashok", 56);
        librarian.register();
        System.out.println();

        Book book1 = new Book("Wings of Fire", "Apj", "123456");
        Book book2 = new Book("Psychology of Money", "789654");
        Book book3 = new Book("Harry Potter", "Chris Martin", "897856");

        librarian.borrowBook(book1);
        librarian.addBook((Library) library, book1);
        librarian.addBook((Library) library, book2);
        librarian.addBook((Library) library, book3);
        System.out.println();
        ((Library) library).displayBooks();
        System.out.println();

        Member member1 = new Member("Pranav", 61);
        member1.register();
        Member member2 = new Member("Alan", 1);
        member2.register();
        System.out.println();

        member1.borrowBook(book1);
        member2.borrowBook(book1);
        System.out.println();

        ((Library) library).displayBooks();
        System.out.println();

        System.out.println(library.searchByAuthor("apj"));
        System.out.println(library.searchByTitle("Psychology of Money"));
        System.out.println();
        System.out.println("The total amount of books :"+ Library.getTotalBooks());

    }
}
