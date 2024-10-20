package com.design.patterns.behavioral.iterator;

import java.util.List;

public class BookIterator implements Iterator<Book>{
    List<Book> booksList;
    int index=0;

    public BookIterator(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public boolean hasNext() {
        return index<booksList.size();
    }

    @Override
    public Book next() {
        return booksList.get(index++);
    }
}
