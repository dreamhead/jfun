package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public class NumberFunctions {
    private static final Function<Integer, String> INT_TO_STRING_FUNCTION = new IntToStringFunction();

    public static Function<Integer, String> intToString() {
        return INT_TO_STRING_FUNCTION;
    }

    private static class IntToStringFunction extends NoArityFunction<Integer, String> {
        @Override
        public String apply(Integer input) {
            return input.toString();
        }
    }
}
