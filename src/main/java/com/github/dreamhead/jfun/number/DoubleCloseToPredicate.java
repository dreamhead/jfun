package com.github.dreamhead.jfun.number;

import com.google.common.base.Predicate;

public class DoubleCloseToPredicate implements Predicate<Number> {

    private final double operand;
    private final double delta;

    public DoubleCloseToPredicate(double operand, double delta) {
        this.operand = operand;
        this.delta = delta;
    }

    @Override
    public boolean apply(Number input) {
        return (Math.abs(input.doubleValue() - operand) - delta) <= 0.0;
    }
}
