package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void getStudentInfo() {
        Student student1 = new Student("Jan",null);
        String info = Application.getStudentInfo(student1);
        String expected = "Uczen: Jan nauczyciel: <undefined>";
        assertEquals(expected, info);
        Student student2 = new Student("Kuba", new Teacher("Krzysztof"));
        info = Application.getStudentInfo(student2);
        expected = "Uczen: Kuba nauczyciel: Krzysztof";
        assertEquals(expected,info);
    }
}