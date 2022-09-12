package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    void filterChemistGroupUsernames() {
        List<String> usernames = UsersManager.filterChemistGroupUsernames();
        List<String> expected = new ArrayList<>();
        expected.add("Walter White");
        expected.add("Gale Boetticher");
        assertEquals(expected,usernames);

    }


    @Test
    void getUsersOlderThan() {
        List<User> users = UsersManager.getUsersOlderThan(50);
        List<User> expected = new ArrayList<>();
        expected.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expected,users);
    }

    @Test
    void getUserByName() {
        List<User> users = UsersManager.getUserByName("Mike Ehrmantraut");
        List<User> expected = new ArrayList<>();
        expected.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expected,users);
        users = UsersManager.getUserByName("Mike Ehrmantraut II");
        expected = new ArrayList<>();
        assertEquals(expected,users);
    }
}