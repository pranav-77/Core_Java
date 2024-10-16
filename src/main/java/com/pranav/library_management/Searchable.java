package com.pranav.library_management;

public interface Searchable {
    Book searchByTitle(String title);

    Book searchByAuthor(String author);
}
