package com.github.dreamhead.jfun.optional;

public class Place {
    private final String name;
    private City city;

    public Place(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}
