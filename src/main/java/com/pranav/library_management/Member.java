package com.pranav.library_management;

public class Member extends LibraryUser {
    public Member(String name, int ID) {
        super(name, ID);
    }

    @Override
    public void register() {
        System.out.println(name+" :Registered as a Member");
    }

    @Override
    public void borrowBook(Book book) {
        if(book.isAvailable()){
            book.setAvailable(false);
            System.out.println(name+" has borrowed the book of "+book.getTitle());
            Library.totalBooks--;
        }else{
            System.out.println(book.getTitle()+" book is not available");
        }
    }
}
