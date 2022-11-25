package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTest {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv")
    public void shouldReturnSomeNumberBetween0and6ForCorrectInput(int num1, int num2, int num3, int num4, int num5, int num6) throws InvalidNumbersException {
        Set<Integer> numbs = Set.of(num1, num2, num3, num4, num5, num6);
        assertTrue(gamblingMachine.howManyWins(numbs) >= 0);
        assertTrue(gamblingMachine.howManyWins(numbs) <= 6);
    }

    @Test
    public void shouldThrowExceptionOnEmptySet() {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(Collections.emptySet()));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineInvalid.csv")
    public void shouldThrowExceptionForOutOfRangeInput(int num1, int num2, int num3, int num4, int num5, int num6) throws InvalidNumbersException {
        Set<Integer> nums = Set.of(num1, num2, num3, num4, num5, num6);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nums));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineShort.csv")
    public void shouldThrowExceptionForTooShortInput(int num1, int num2, int num3, int num4, int num5) throws InvalidNumbersException {
        Set<Integer> nums = Set.of(num1, num2, num3, num4, num5);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nums));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachineLong.csv")
    public void shouldThrowExceptionForTooLongInput(int num1, int num2, int num3, int num4, int num5, int num6, int num7) throws InvalidNumbersException {
        Set<Integer> numbs = Set.of(num1, num2, num3, num4, num5, num6, num7);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbs));
    }
}