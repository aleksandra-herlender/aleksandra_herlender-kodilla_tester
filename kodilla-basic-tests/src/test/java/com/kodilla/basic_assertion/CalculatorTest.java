package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult);

    }

    @Test
    void square() {
        Calculator calculator = new Calculator();

        int a = 5;

        int result = calculator.square(a);
        assertEquals(25, result);

        a = -2;
        result=calculator.square(a);
        assertEquals(4,result);
    }

    @Test
    void squareNegative() {
        Calculator calculator = new Calculator();

        int a = -2;

        int result = calculator.square(a);
        assertEquals(4, result);

    }

    @Test
    void squareZero() {
        Calculator calculator = new Calculator();

        int a = 0;

        int result = calculator.square(a);
        assertEquals(0, result);

    }
}