package com.github.dreamhead.jfun.number;

public class DoubleGreaterThanPredicate extends DoublePredict {

    public DoubleGreaterThanPredicate(double number) {
        super(number);
    }

    @Override
    public boolean apply(Number input) {
        return input.doubleValue() > number;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof DoubleGreaterThanPredicate) {
            double that = Double.valueOf(DoubleGreaterThanPredicate.class.cast(object).number);
            return Double.valueOf(number).equals(that);
        }

        return false;
    }

    @Override
    public String toString() {
        return "DoubleGreaterThanPredicate(" + number + ")";
    }
}
