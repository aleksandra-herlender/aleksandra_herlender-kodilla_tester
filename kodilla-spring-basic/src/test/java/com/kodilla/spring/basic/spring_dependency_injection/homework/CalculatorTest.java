package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Test
    void add() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        assertEquals(12, bean.add(6, 6));
    }

    @Test
    void subtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        assertEquals(12, bean.subtract(18, 6));
    }

    @Test
    void multiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        assertEquals(12, bean.multiply(6, 2));

    }

    @Test
    void divide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        Calculator bean = context.getBean(Calculator.class);
        assertEquals(12, bean.divide(24, 2));
    }
}