package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Nowak,true", "il, false", "Jan Kowalski, false", "Jan_Kowalski, true"})
    public void validateUsername(String input, boolean expected) {
        assertEquals(expected, userValidator.validateUsername(input));
    }





    @ParameterizedTest
    @CsvSource(value= {"1@1.pl,true", "jan.kowalski@test.pl,true","jan kowalski,false", "jan+kowalski@test.pl,false"})
    public void validateEmail(String input, boolean expected) {
        assertEquals(expected, userValidator.validateEmail(input));
    }
}