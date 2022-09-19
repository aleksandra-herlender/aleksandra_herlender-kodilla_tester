package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {
    private Shop shop = new Shop();
    private Order order1 = new Order(1.0, LocalDate.of(2022, 8, 1), "kluseczka");
    private Order order2 = new Order(2.0, LocalDate.of(2022, 8, 2), "zajaczek");
    private Order order3 = new Order(3.0, LocalDate.of(2022, 8, 3), "alpaka");

    @BeforeEach
    void initialize() {
        shop.add(order1);
        shop.add(order2);
        shop.add(order3);
    }

    @Test
    public void checkIfOrderCountAndSumOfValuesAreChanged(){
        assertEquals(3,shop.sizeNumberOfOrders());
        assertEquals(6.0, shop.sumOfOrders());
    }

    @Test
    public void sumAndCountShouldNotBeChangedAfterAddingDuplicatedOrder(){
        shop.add(order1);
        assertEquals(3,shop.sizeNumberOfOrders());
        assertEquals(6.0, shop.sumOfOrders());
    }

    @Test
    public void shouldReturnEmptyListForDatesOutOfRangeOfOrders(){
        assertEquals(new ArrayList<Order>(),
                shop.getByDates(LocalDate.of(2021,1,1),
                        LocalDate.of(2021,12,31)));
    }

    @Test
    public void shouldReturnOneElementListForDatesWithOneOrderInRange(){
        List<Order> expectedOrders = new ArrayList<>();
        expectedOrders.add(order1);
        assertEquals(expectedOrders,
                shop.getByDates(LocalDate.of(2022,7,31),
                        LocalDate.of(2022,8,1)));
    }

    @Test
    public void shouldReturnEmptyListForValuesOutOfRangeOfOrders(){
        assertEquals(new HashSet<>(),
                shop.getByValue(4.0,5.0));
    }

    @Test
    public void shouldReturnOneElementListForValuesWithOneOrderInRange(){
        Set<Order> expectedOrders = new HashSet<>();
        expectedOrders.add(order1);
        assertEquals(expectedOrders,
                shop.getByValue(0.5,1.2));
    }
    @Test
    public void shouldReturnAllOrdersListForValuesFromZeroToMax(){
        Set<Order> expectedOrders = new HashSet<>();
        expectedOrders.add(order1);
        expectedOrders.add(order2);
        expectedOrders.add(order3);
        assertEquals(expectedOrders,
                shop.getByValue(0,3.0));
    }
}
