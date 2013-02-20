package com.github.dreamhead.jfun.number;

import com.google.common.base.Predicate;

public abstract class DoublePredict implements Predicate<Number> {

    protected double number;

    public DoublePredict(double number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(number).hashCode();
    }

}
