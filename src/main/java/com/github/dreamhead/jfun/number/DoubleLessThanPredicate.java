package com.github.dreamhead.jfun.number;

public class DoubleLessThanPredicate extends DoublePredict {

    public DoubleLessThanPredicate(double number) {
        super(number);
    }

    @Override
    public boolean apply(Number input) {
        return input.doubleValue() < number;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof DoubleLessThanPredicate) {
            double that = Double.valueOf(DoubleLessThanPredicate.class.cast(object).number);
            return Double.valueOf(number).equals(that);
        }

        return false;
    }

    @Override
    public String toString() {
        return "DoubleLessThanPredicate(" + number + ")";
    }
}
