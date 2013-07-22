package com.github.dreamhead.jfun.optional;

import com.github.dreamhead.jfun.optional.Province;

public class City {
    private final String name;
    private final Province province;

    public City(String name, Province province) {
        this.name = name;
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }
}
