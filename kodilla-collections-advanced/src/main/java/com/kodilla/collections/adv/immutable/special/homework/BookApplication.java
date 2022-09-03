package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Grzech", "Krol");
        Book book2 = BookManager.createBook("Pokora", "Twardoch");
        Book book3 = BookManager.createBook("Pokora", "Twardoch");

        System.out.println(book1==book2);
        System.out.println(book1==book3);
        System.out.println(book2==book3);
    }
}
