package com.kodilla.stream.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {

        orders.add(order);

    }

    public Order getOrder(String number) throws OrderDoesntExistException {
      List<Order> ordersFiltered =  orders.stream()
              .filter(order -> order.getNumber()==number)
              .collect(Collectors.toList());

      if (ordersFiltered.size()==0)
          throw new OrderDoesntExistException();
      else {
          Order order = ordersFiltered.get(0);
          return order;
      }
    }
}
