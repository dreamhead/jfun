package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public class StringFunctions {
    public static final StringToIntFunction STRING_TO_INT_FUNCTION = new StringToIntFunction();
    public static final StringTrimFunction STRING_TRIM_FUNCTION = new StringTrimFunction();

    public static Function<String, Integer> toInt() {
        return STRING_TO_INT_FUNCTION;
    }

    public static Function<String, String> trim() {
        return STRING_TRIM_FUNCTION;
    }


    private static class StringToIntFunction implements Function<String, Integer> {
        @Override
        public Integer apply(String input) {
            return Integer.parseInt(input);
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof StringToIntFunction;
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public String toString() {
            return "StringToInt";
        }
    }

    private static class StringTrimFunction implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input == null ? null : input.trim();
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof StringToIntFunction;
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public String toString() {
            return "StringTrim";
        }
    }
}
