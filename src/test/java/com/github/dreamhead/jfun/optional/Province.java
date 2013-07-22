package com.github.dreamhead.jfun.optional;

public class Province {
    private final String name;
    private final Country country;

    public Province(String name, Country country) {

        this.name = name;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }
}
