package com.kodilla.inheritance;

public class Book {
    private String title;
    private int pages;

    public void openBook() {
        System.out.println("Book was opened");
    }

    public Book (String title, int pages) {
        this.title = title;
        this.pages = pages;
    }


}
