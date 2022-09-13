package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("o1"));
        warehouse.addOrder(new Order("o2"));
        try {
            warehouse.getOrder("o");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie znaleziono zamówienia");
        }
    }
}
