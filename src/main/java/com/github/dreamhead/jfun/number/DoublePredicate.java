package com.github.dreamhead.jfun.number;

import com.google.common.base.Predicate;

import static java.lang.String.format;

public abstract class DoublePredicate implements Predicate<Number> {

    protected double number;

    public DoublePredicate(double number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object object) {
        Class<? extends DoublePredicate> clazz = this.getClass();
        if (clazz.isInstance(object)) {
            double that = Double.valueOf(clazz.cast(object).number);
            return Double.valueOf(number).equals(that);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(number).hashCode();
    }

    @Override
    public String toString() {
        return format("%s(%e)", this.getClass().getSimpleName(), number);
    }

}
