package com.pranav.java8FeaturesProblems.problem3;

public class Book {
    private String title;
    private String author;
    private String genre;
    private float rating;

    public Book(String title, String author, String genre, float rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "Author: " + author + "\n" + "Genre: " + genre + "\n" + "Rating: " + rating + "\n";
    }
}
