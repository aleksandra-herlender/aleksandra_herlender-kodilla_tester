package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public String getResponsibilities() {
        return this.job.responsibilities;
    }
}
