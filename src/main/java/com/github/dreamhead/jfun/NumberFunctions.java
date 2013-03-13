package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public class NumberFunctions {
    private static final Function<Integer, String> INT_TO_STRING_FUNCTION = new ToStringFunction<Integer>();
    private static final Function<Long, String> LONG_TO_STRING_FUNCTION = new ToStringFunction<Long>();
    private static final Function<Double, String> DOUBLE_TO_STRING_FUNCTION = new ToStringFunction<Double>();
    private static final Function<Float, String> FLOAT_TO_STRING_FUNCTION = new ToStringFunction<Float>();

    public static Function<Integer, String> intToString() {
        return INT_TO_STRING_FUNCTION;
    }

    public static Function<Long, String> longToString() {
        return LONG_TO_STRING_FUNCTION;
    }

    public static Function<Double, String> doubleToString() {
        return DOUBLE_TO_STRING_FUNCTION;
    }

    public static Function<Float, String> floatToString() {
        return FLOAT_TO_STRING_FUNCTION;
    }

    private static class ToStringFunction<T> extends NoArityFunction<T, String> {
        @Override
        public String apply(T input) {
            return input.toString();
        }
    }
}
