package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<School,Principal> schoolPrincipalMap = new HashMap<>();
        schoolPrincipalMap.put(new School(Arrays.asList(1.0,2.0,3.0,4.0)),new Principal("Stefan Batory"));
        schoolPrincipalMap.put(new School(Arrays.asList(1.0,3.0,3.0,4.0)),new Principal("Nikodem Dyzma"));
        schoolPrincipalMap.put(new School(Arrays.asList(1.0,4.0,3.0,4.0)),new Principal("Rafal Wilczur"));

        for (Map.Entry<School,Principal> entry: schoolPrincipalMap.entrySet()) {
            System.out.println("Principial: "+entry.getValue().getName()+" has "+entry.getKey().getTotalStudents()+" students.");
        }
    }
}
