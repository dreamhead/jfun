package com.github.dreamhead.jfun.number;

public class DoubleGreaterThanPredicate extends DoublePredicate {

    public DoubleGreaterThanPredicate(double number) {
        super(number);
    }

    @Override
    public boolean apply(Number input) {
        return input.doubleValue() > number;
    }

}
