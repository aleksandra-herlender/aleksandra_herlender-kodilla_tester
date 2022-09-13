package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static double averageOld(List<User> users){
       return users.stream().filter(u -> u.getAge()>=40)
                .mapToInt(User::getNumberOfPost).average().orElse(0.0);
    }

    public static double averageYoung(List<User> users){
        return users.stream().filter(u -> u.getAge()<40)
                .mapToInt(User::getNumberOfPost).average().orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        System.out.println("Srednia dla użytkowników starszych niż 40 wynosi "+averageOld(users));
        System.out.println("Srednia dla użytkowników młodszych niż 40 wynosi "+averageYoung(users));
    }

    }
