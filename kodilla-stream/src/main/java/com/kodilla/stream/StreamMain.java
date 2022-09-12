package com.kodilla.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        processUsersStream();
    }

    private static void processUsersStream() {
        List<User> list = UsersRepository.getUsersList();
        Stream<User> stream = list.stream();
        Function<User,String> akcja = User::getUsername;
        Stream<String> stream1 = stream.map(akcja);
        stream1.forEach(username -> System.out.println(username));

        UsersRepository.getUsersList()
                .stream()
                .map(user -> user.getUsername())
                .forEach(username -> System.out.println(username));
    }
}
