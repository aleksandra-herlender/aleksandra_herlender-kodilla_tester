package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if(books.containsKey(book.hashCode()))
            return books.get(book.hashCode());
        else {
            books.put(book.hashCode(),book);
            return book;
        }
    }

    private static final Map<Integer, Book> books = new HashMap<>();

}
