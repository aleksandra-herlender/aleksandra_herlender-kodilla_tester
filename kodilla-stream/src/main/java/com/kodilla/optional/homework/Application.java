package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan",null));
        students.add(new Student("Kuba",new Teacher("Krzysztof")));
        for (Student student: students) {
            System.out.println(getStudentInfo(student));
        }
    }

    public static String getStudentInfo(Student student) {
        Teacher undefinedTeacher = new Teacher("<undefined>");
        String teacherName = Optional.ofNullable(student.getTeacher()).orElse(undefinedTeacher).getName();
        return "Uczen: "+student.getName()+ " nauczyciel: "
                +teacherName;
    }
}
