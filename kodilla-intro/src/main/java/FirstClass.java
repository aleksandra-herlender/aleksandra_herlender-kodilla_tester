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



}
    }