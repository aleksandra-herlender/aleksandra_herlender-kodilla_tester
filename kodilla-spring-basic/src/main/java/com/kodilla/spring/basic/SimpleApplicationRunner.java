package com.kodilla.spring.basic;

import com.kodilla.spring.basic.dependency_injection.SimpleApplication;

public class SimpleApplicationRunner {

    public static void main(String[] args) {
        SimpleApplication application = new SimpleApplication();
        application.processMessage("Test message", "receiver@mail.com");
    }
}
