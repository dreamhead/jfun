package com.github.dreamhead.jfun.number;

public class DoubleLessThanPredicate extends DoublePredicate {

    public DoubleLessThanPredicate(double number) {
        super(number);
    }

    @Override
    public boolean apply(Number input) {
        return input.doubleValue() < number;
    }

}
