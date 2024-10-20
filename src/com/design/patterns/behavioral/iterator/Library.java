package com.design.patterns.behavioral.iterator;

import java.util.List;

public class Library implements Aggregate<Book>{
    List<Book> books;

    public Library() {
        books = List.of(
                new Book("ABC", "ABC", 1000),
                new Book("DEF", "DEF", 200),
                new Book("GHI", "GHI", 500),
                new Book("MNO", "MNO", 800),
                new Book("XYZ", "XYZ", 900)
        );
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
