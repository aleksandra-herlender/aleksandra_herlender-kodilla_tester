package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMITestProvider {
    public static Stream<Arguments> bMIGroups(){
        return Stream.of(
                Arguments.of(new Person(2.0,56),"Very severely underweight"),
                Arguments.of(new Person(2.0,60),"Severely underweight"),
                Arguments.of(new Person(2.0,64),"Underweight"),
                Arguments.of(new Person(2.0,80),"Normal (healthy weight)"),
                Arguments.of(new Person(2.0,100),"Overweight"),
                Arguments.of(new Person(2.0,120),"Obese Class I (Moderately obese)"),
                Arguments.of(new Person(2.0,150),"Obese Class II (Severely obese)"),
                Arguments.of(new Person(2.0,160),"Obese Class III (Very severely obese)"),
                Arguments.of(new Person(2.0,180),"Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(2.0,200),"Obese Class V (Super Obese)"),
                Arguments.of(new Person(2.0,240),"Obese Class VI (Hyper Obese)")

                );
    }
}
