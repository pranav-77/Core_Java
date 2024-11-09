package com.pranav.java8FeaturesProblems.problem3;

import java.util.*;
import java.util.stream.Collectors;

public class BookOperations {
    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        books = Arrays.asList(
                new Book("Dune", "Frank Herbert", "ScienceFiction", 4.2f),
                new Book("The Wild Robot", "Peter Brown", "Story", 4.6f),
                new Book("Hyperion", "Dan Simmons", "ScienceFiction", 3.5f),
                new Book("Foundation", "Issac Asimov", "ScienceFiction", 4.9f),
                new Book("Spider Man", "Stan Lee", "Comic", 3.9f),
                new Book("Batman", "Robin", "Comic", 4.1f),
                new Book("1984", "George Orwell", "Dystopian", 4.5f),
                new Book("Brave New World", "Aldous Huxley", "Dystopian", 4.3f),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 4.7f),
                new Book("To Kill a Mockingbird", "Harper Lee", "Classic", 4.8f)
        );
        while (true) {
            System.out.println("1. Display Books");
            System.out.println("2. Filter Books By Genre and Rating");
            System.out.println("3. List of Books and Rating");
            System.out.println("4. Sort By Rating");
            System.out.println("5. Top 10 Books By Page Format");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    displayBooks(books);
                    break;
                }
                case 2: {
                    System.out.println("Enter the genre and rating");
                    String genre = sc.next();
                    float rating = sc.nextFloat();
                    filterBooks(books, genre, rating);
                    break;
                }
                case 3: {
                    List<Book> bookRecommendation = BookRecommendation(books);
                    bookRecommendation.forEach(book -> System.out.println("Title: " + book.getTitle() + "," + " Rating: " + book.getRating()));
                    break;
                }
                case 4: {
                    sortByRating(BookRecommendation(books));
                    break;
                }
                case 5: {
                    topRatedBooks(BookRecommendation(books));
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }
    }

    private static void topRatedBooks(List<Book> books) {
        List<Book> bookList=books
                .stream()
                .sorted(Comparator.comparing(Book::getRating).reversed())
                .limit(10)
                .collect(Collectors.toList());
//        bookList.forEach(book -> System.out.println("Title: " + book.getTitle() + "," + " Rating: " + book.getRating()));
        int pageSize = 5;
        int totalPages = (int) Math.ceil((double) bookList.size() / pageSize);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the page number (1-" + totalPages + "):");
        int pageNumber = sc.nextInt();

        if (pageNumber < 1 || pageNumber > totalPages) {
            System.out.println("Invalid page number.");
            return;
        }

        int startIndex = (pageNumber - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, bookList.size());

        for (int i = startIndex; i < endIndex; i++) {
            Book book = bookList.get(i);
            System.out.println("Title: " + book.getTitle() + ", Rating: " + book.getRating());
        }
    }

    private static void sortByRating(List<Book> books) {
        books
                .stream()
                .sorted(Comparator.comparing(Book::getRating).reversed())
                .forEach(book -> System.out.println("Title: " + book.getTitle() + "," + " Rating: " + book.getRating()));
    }

    private static List<Book> BookRecommendation(List<Book> books) {
        List<Book> bookList = books
                .stream()
                .map(data -> new Book(data.getTitle(), "", "", data.getRating()))
                .collect(Collectors.toList());
        return bookList;
    }

    private static void filterBooks(List<Book> books, String genre, float rating) {
        List<Book> bookList = books
                .stream()
                .filter(data -> data.getGenre().equalsIgnoreCase(genre) && data.getRating() >= rating)
                .collect(Collectors.toList());
        if (!bookList.isEmpty())
            bookList.forEach(System.out::println);
        else
            System.out.println("No Books Available");
    }

    private static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No Books Found");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
