package com.github.dreamhead.jfun;

import com.github.dreamhead.jfun.number.DoubleCloseToPredicate;
import com.github.dreamhead.jfun.number.DoubleGreaterThanPredicate;
import com.github.dreamhead.jfun.number.DoubleLessThanPredicate;
import com.google.common.base.Predicate;

import static com.google.common.base.Preconditions.checkArgument;

public class NumberPredicates {

    public static Predicate<Number> lessThan(final double number) {
        return new DoubleLessThanPredicate(number);
    }

    public static Predicate<Number> greaterThan(final double number) {
        return new DoubleGreaterThanPredicate(number);
    }

    public static Predicate<Number> closeTo(final double operand, final double delta) {
        checkArgument(delta >= 0, "delta should be greater than or equal to 0");
        return new DoubleCloseToPredicate(operand, delta);
    }

}
