package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Pilsudski", 14, true));
        stamps.add(new Stamp("Witos", 15, false));
        stamps.add(new Stamp("Rapacki", 9, true));
        stamps.add(new Stamp("Pilsudski", 14, true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);


    }
}
