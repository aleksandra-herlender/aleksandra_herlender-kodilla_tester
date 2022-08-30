package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    String name;
    double size;
    boolean stamped;

    public Stamp(String name, double size, boolean stamped) {
        this.name = name;
        this.size = size;
        this.stamped = stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.size, size) == 0 && stamped == stamp.stamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", stamped=" + stamped +
                '}';
    }
}
