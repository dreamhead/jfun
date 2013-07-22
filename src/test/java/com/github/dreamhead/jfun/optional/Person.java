package com.github.dreamhead.jfun.optional;

public class Person {
    private final String name;
    private Place place;

    public Person(String name, Place place) {

        this.name = name;
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }
}
