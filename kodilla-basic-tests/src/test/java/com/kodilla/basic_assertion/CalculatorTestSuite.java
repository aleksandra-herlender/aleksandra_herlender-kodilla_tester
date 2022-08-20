package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a,b);
        assertEquals(-3, subResult);

    }

    @Test
    void square() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);

        a=0;
        squareResult=calculator.square(a);
        assertEquals(0, squareResult);

        a=-1;
        squareResult=calculator.square(a);
        assertEquals(1, squareResult);
    }
}