package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTest {

    @Test
    void sendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("Pola", 50);
        assertEquals("Package not delivered to: Pola", result );
        String result2 = bean.sendPackage("Pola", 25);
        assertEquals("Package delivered to: Pola", result2 );
    }
}