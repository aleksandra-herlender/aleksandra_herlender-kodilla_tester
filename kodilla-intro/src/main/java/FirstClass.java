import java.util.Random;

public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        System.out.println("Hello from FirstClass!");

        int x = 3;
        if (x > 2)
            System.out.println("Niesamowite!  Jeden jest większe niż dwa");// [3]
        if (1 < 2)
            System.out.println("Niesamowite!  Jeden jest większe niż dwa");// [3]
        if (1 > 2) {
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");}
        if (5<3)
            System.out.println("Dresden in Sachsen");
        else
            System.out.println("Breslau");
        if (6>=5)
            System.out.println("Blasewitz");
        else
            System.out.println("Gruna");

        String [] movies = new String [] { "Harry Potter", "Lord", "Forest Gump"};
        String [] books = new String [] {"Wiosna", "Lato", "Zima"};

        String [] stories = new String [3];
        movies[0] = "Harry Poter";
        movies[1] = "Lord";
        movies[2] = "Forest Gump";

        for (int i = 0; i <= 10; i++) {
            System.out.println((i));
        }




}
    }