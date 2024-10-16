package com.pranav.library_management;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    private List<Book> books=new ArrayList<>();
    static int totalBooks = 0;

    public void addBook(Book book) {
        books.add(book);
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    @Override
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title))
                return book;
        }
        // System.out.println("Title not found in library");
        return null;
    }

    @Override
    public Book searchByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author))
                //System.out.println("Book is available");
                return book;
        }
        // System.out.println("Author not found");
        return null;
    }

    public void displayBooks() {
        System.out.println("Books that are available in library");
        for (Book book : books) {
            if (book.isAvailable())
                System.out.println(book.getTitle() + " book is available whose author is " + book.getAuthor());
        }
    }


}
