package com.kodilla.spring.basic_configuration.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTest {

    CarConfiguration configuration = new CarConfiguration();

    @Test
    void getCarDependentOnSeasonInWinterAtDay() {
        LocalDateTime now = LocalDateTime.of(2022, 12, 12, 12, 12);
        Car result = configuration.getCarDependentOnSeason(now);
        assertEquals("SUV",result.getCarType());
        assertFalse(result.hasHeadLightTurnedOn());
    }

    @Test
    void getCarDependentOnSeasonInSummerAtDay() {
        LocalDateTime now = LocalDateTime.of(2022, 6, 12, 12, 12);
        Car result = configuration.getCarDependentOnSeason(now);
        assertEquals("cabrio",result.getCarType());
        assertFalse(result.hasHeadLightTurnedOn());
    }

    @Test
    void getCarDependentOnSeasonInAutumnAtDay() {
        LocalDateTime now = LocalDateTime.of(2022, 10, 12, 12, 12);
        Car result = configuration.getCarDependentOnSeason(now);
        assertEquals("sedan",result.getCarType());
        assertFalse(result.hasHeadLightTurnedOn());
    }

    @Test
    void getCarDependentOnSeasonInSpringAtDay() {
        LocalDateTime now = LocalDateTime.of(2022, 4, 12, 12, 12);
        Car result = configuration.getCarDependentOnSeason(now);
        assertEquals("sedan",result.getCarType());
        assertFalse(result.hasHeadLightTurnedOn());
    }

    @Test
    void getCarDependentOnSeasonInWinterAtNight() {
        LocalDateTime now = LocalDateTime.of(2022, 12, 12, 21, 12);
        Car result = configuration.getCarDependentOnSeason(now);
        assertEquals("SUV",result.getCarType());
        assertTrue(result.hasHeadLightTurnedOn());
    }
}