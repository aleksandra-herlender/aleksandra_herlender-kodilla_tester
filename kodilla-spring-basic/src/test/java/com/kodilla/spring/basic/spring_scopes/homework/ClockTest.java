package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTest {

    @Test
    public void shouldCreateDifferentClocks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        System.out.println(firstBean.getNow());
        Clock secondBean = context.getBean(Clock.class);
        System.out.println(secondBean.getNow());
        Clock thirdBean = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstBean.getNow(), secondBean.getNow());
        Assertions.assertNotEquals(secondBean.getNow(), thirdBean.getNow());
        Assertions.assertNotEquals(firstBean.getNow(), thirdBean.getNow());
    }

}