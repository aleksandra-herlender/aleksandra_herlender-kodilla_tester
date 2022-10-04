package com.kodilla.spring.basic_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarConfiguration {

    @Bean
    LocalDateTime currentDate(){
        return LocalDateTime.now();
    }

    @Bean
    Car getCarDependentOnSeason(LocalDateTime currentDate){
        int month = currentDate.getMonthValue();
        Car car;
        switch (month) {
            case 1:
            case 2:
            case 12:
                car = new SUV();
                break;
            case 6:
            case 7:
            case 8:
                car = new Cabrio();
                break;
                default:
                car = new Sedan();
        }

        int hour = currentDate.getHour();
        if(hour >= 20 || hour<6)
            car.setLightsOn(true);
        return car;

    }
}
