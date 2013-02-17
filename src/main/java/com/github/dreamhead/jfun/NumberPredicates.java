package com.github.dreamhead.jfun;

import com.google.common.base.Predicate;

public class NumberPredicates {
    public static Predicate<Number> lessThan(final double number) {
        return new DoubleLessThanPredicate(number);
    }

    public static Predicate<Number> lessThan(final int number) {
        return new DoubleLessThanPredicate(number);
    }

    private static class DoubleLessThanPredicate implements Predicate<Number> {

        private double number;

        public DoubleLessThanPredicate(double number) {
            this.number = number;
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
        public int hashCode() {
            return Double.valueOf(number).hashCode();
        }

        @Override
        public String toString() {
            return "DoubleLessThanPredicate(" + number + ")";
        }
    }
}
