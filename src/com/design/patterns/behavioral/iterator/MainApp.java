package com.design.patterns.behavioral.iterator;

public class MainApp {
    public static void main(String[] args) {
        Library library=new Library();
        Iterator<Book> iterator = library.createIterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.toString());
        }
    }
}
