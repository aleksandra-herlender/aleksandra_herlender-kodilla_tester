package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private ArrayList<Double> studentsInClasses;


    public School(List<Double> studentsInClasses) {
        this.studentsInClasses = new ArrayList<>();
        this.studentsInClasses.addAll(studentsInClasses);
    }

    public ArrayList<Double> getStudentsInClasses() {
        return studentsInClasses;
    }

    public Double getTotalStudents() {
        double total = 0;
        for (Double studentsCount: studentsInClasses ) {
            total = total + studentsCount;
        }
        return total;
    }
}
