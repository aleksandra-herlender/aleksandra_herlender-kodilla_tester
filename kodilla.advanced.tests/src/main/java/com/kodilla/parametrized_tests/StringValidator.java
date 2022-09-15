package com.kodilla.parametrized_tests;

public class StringValidator {
    public boolean isBlank(String string){
        return string==null|| string.trim().isBlank();
    }
}
