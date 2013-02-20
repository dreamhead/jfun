package com.github.dreamhead.jfun;

import com.github.dreamhead.jfun.number.DoubleGreaterThanPredicate;
import com.github.dreamhead.jfun.number.DoubleLessThanPredicate;
import com.google.common.base.Predicate;

public class NumberPredicates {

    public static Predicate<Number> lessThan(final double number) {
        return new DoubleLessThanPredicate(number);
    }

    public static Predicate<Number> greaterThan(final double number) {
        return new DoubleGreaterThanPredicate(number);
    }

}
