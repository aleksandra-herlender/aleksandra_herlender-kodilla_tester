package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    NumberChecker numberChecker = new NumberChecker();

    @Test
    void isDivisibleByThree() {
        assertTrue(numberChecker.isDivisibleByThree(6));
        assertTrue(numberChecker.isDivisibleByThree(9));
        assertFalse(numberChecker.isDivisibleByThree(7));

    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, 9})
    public void shouldReturnTrueForNumberDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource(ints = {2, -2, 5, 19})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);

    }

}