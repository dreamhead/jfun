package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public class StringFunctions {
    private static final Function<String, Integer> STRING_TO_INT_FUNCTION = new StringToIntFunction();
    private static final Function<String, Long> STRING_TO_LONG_FUNCTION = new StringToLongFunction();
    private static final Function<String, Float> STRING_TO_FLOAT_FUNCTION = new StringToFloatFunction();
    private static final Function<String, String> STRING_TRIM_FUNCTION = new StringTrimFunction();
    private static final Function<String, String> STRING_TO_UPPER_CASE_FUNCTION = new StringToUpperCaseFunction();
    private static final Function<String, String> STRING_TO_LOWER_CASE_FUNCTION = new StringToLowerCaseFunction();

    public static Function<String, Integer> toInt() {
        return STRING_TO_INT_FUNCTION;
    }

    public static Function<String, Long> toLong() {
        return STRING_TO_LONG_FUNCTION;
    }

    public static Function<String, Float> toFloat() {
        return STRING_TO_FLOAT_FUNCTION;
    }

    public static Function<String, String> trim() {
        return STRING_TRIM_FUNCTION;
    }

    public static Function<String, String> toUpperCase() {
        return STRING_TO_UPPER_CASE_FUNCTION;
    }

    public static Function<String, String> toLowerCase() {
        return STRING_TO_LOWER_CASE_FUNCTION;
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

    private static class StringToLongFunction implements Function<String, Long> {
        @Override
        public Long apply(String input) {
            return Long.parseLong(input);
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof StringToLongFunction;
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public String toString() {
            return "StringToLong";
        }
    }

    private static class StringToFloatFunction implements Function<String, Float> {
        @Override
        public Float apply(String input) {
            return Float.parseFloat(input);
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return obj instanceof StringToFloatFunction;
        }

        @Override
        public String toString() {
            return "StringToFloat";
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

    private static class StringToUpperCaseFunction implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input == null ? null : input.toUpperCase();
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof StringToUpperCaseFunction;
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public String toString() {
            return "StringToUpperCase";
        }
    }

    private static class StringToLowerCaseFunction implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input == null ? null : input.toLowerCase();
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof StringToUpperCaseFunction;
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public String toString() {
            return "StringToLowerCase";
        }
    }
}
