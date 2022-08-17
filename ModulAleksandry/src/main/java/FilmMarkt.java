public class FilmMarkt {
    public static void main(String[] args) {
        Film film1 = new Film("King", 120);
        Film film2 = new Film("Queen", 100);
        Film film3 = new Film("Boss", 130);
        Film film4 = new Film("Chap", 150);

        System.out.println(film1.title + "," + film1.duration);
        System.out.println(film2.title + ",," + film2.duration);
        System.out.println((film3.title) + ",," + film3.duration);
        System.out.println((film4.title + ",," + film4.duration));


    }


}

