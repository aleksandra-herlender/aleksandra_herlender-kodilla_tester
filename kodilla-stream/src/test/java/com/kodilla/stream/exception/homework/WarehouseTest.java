package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    private  Warehouse warehouse = new Warehouse();

    @BeforeEach
    private void initializeWarehouse(){
        warehouse.addOrder(new Order("o1"));
        warehouse.addOrder(new Order("o2"));
    }

    @Test
    public void shouldThrowExceptionWhenSearchingForWrongOrderNumber(){
        assertThrows(OrderDoesntExistException.class,()->warehouse.getOrder("o3"));
    }

    @Test
    public void shouldFindCorrectOrderWhenSearchingForCorrectOrderNumber() throws OrderDoesntExistException{
            assertEquals(new Order("o1"),warehouse.getOrder("o1"));
    }

}