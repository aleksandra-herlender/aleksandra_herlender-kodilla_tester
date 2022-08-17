public class BooksMarkt {

      public static void main(String[] args) {
          Book book1 = new Book("Eliza", "Kwiaty");
        System.out.println(book1.author + "," + book1.title);
        Book book2 = new Book("King", "Lsnienie");
        System.out.println(book2.author + "," + book2.title);
        Book book3 = new Book ("Mróz", "Kula");
        System.out.println(book3.author + "," + book3.title);
        Book book4 = new Book("Twardoch", "Pokora");
        System.out.println(book4.author + "," + book4.title);
    }
}
