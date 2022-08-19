package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();
        Convertible convertible = new Convertible(3,2);
        System.out.println(convertible.getSeats());

        convertible.displayNumberOfSeats();




        Book book = new Book("King", 22);
        DetectiveStory detectiveStory = new DetectiveStory("ciemno",123);

    }
}
