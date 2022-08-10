public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        if (firstNumber>secondNumber)
            System.out.println("Frankfurt");
        if (firstNumber<secondNumber)
            System.out.println("Hanau");
        if (firstNumber>secondNumber)
            System.out.println("Rogau");
        else
            System.out.println("Langen");

        int yourAge = 18;

        if (yourAge < 17)
            System.out.println("You are a kid");


        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber>secondNumber)
            sumAndDisplay(firstNumber, secondNumber);
        else
            sumAndDisplay(firstNumber,10);

        int yourNose = 12;
        double yourHand = 50.1;

        if (yourNose<yourHand)
            System.out.println("You are so beautiful");

        if (yourNose>yourHand)
            System.out.println("You are so beautiful");
        else
            System.out.println("You are so crazy");

        int yourIQ = 10;

        if (yourAge < 8) {
            System.out.println("You are kind");
        } else if (yourAge > 10 && yourAge > 8 ) {
            System.out.println("You are a big kind");
        } else {
            System.out.println("You are an adult");

        }


    }

    private static void sumAndDisplay(int a, int b){
        int result = a + b;

        System.out.println(result);
    }
}

