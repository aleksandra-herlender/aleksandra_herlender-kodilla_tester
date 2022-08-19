package com.kodilla.inheritance;

import com.kodilla.inheritance.Book;

public class DetectiveStory extends Book {

    public DetectiveStory(String title, int pages) {
        super(title, pages);
    }

    public void changePage() {
        System.out.println("Change page....");
    }
    public void closeBook() {
        System.out.println("Close book");

        }
    @Override
    public void openBook(){
        System.out.println("Open first chapter");
    }
}

