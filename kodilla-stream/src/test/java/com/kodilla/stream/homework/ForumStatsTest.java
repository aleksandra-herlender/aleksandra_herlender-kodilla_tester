package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void averageOld() {
        List<User> usersOld = new ArrayList<>();
        usersOld.add(new User("Jan",40, 3, "group1"));
        List<User> usersYoung = new ArrayList<>();
        usersYoung.add(new User("Jan",30, 3, "group1"));
        assertEquals(3.0, ForumStats.averageOld(usersOld));
        assertEquals(0.0, ForumStats.averageOld(usersYoung));
    }

    @Test
    void averageYoung() {
        List<User> usersOld = new ArrayList<>();
        usersOld.add(new User("Jan",40, 3, "group1"));
        List<User> usersYoung = new ArrayList<>();
        usersYoung.add(new User("Jan",30, 3, "group1"));
        assertEquals(0.0, ForumStats.averageYoung(usersOld));
        assertEquals(3.0, ForumStats.averageYoung(usersYoung));
    }
}