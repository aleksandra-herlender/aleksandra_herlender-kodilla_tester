import java.util.Scanner;

public class ColoursApp {
    public static void main(String[] args) {
        String colour = getColour();
        System.out.println(colour);
    }
    public static String getColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (B-black, W-white, P-pink): ");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "B": return "black";
                case "W": return "white";
                case "P": return "pink";
                default:
                    System.out.println("Wrong colour. Try again.");
            }
        }
    }
}
