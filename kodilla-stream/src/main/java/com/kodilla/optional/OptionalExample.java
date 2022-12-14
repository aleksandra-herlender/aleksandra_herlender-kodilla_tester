package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");

        Optional<User> optionalUser = Optional.ofNullable(user);

        String username =
                optionalUser.orElse(new User("", 0, 0, "")).getUsername();     // [1]

        System.out.println(username);
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));

       user = null;
        optionalUser = Optional.ofNullable(user);

       username =
                optionalUser.orElse(new User("domyslny", 0, 0, "")).getUsername();     // [1]
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
        System.out.println(username);
    }
}
