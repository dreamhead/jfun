package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public class StringFunctions {
    private static final Function<String, Integer> STRING_TO_INT_FUNCTION = new StringToIntFunction();
    private static final Function<String, String> STRING_TRIM_FUNCTION = new StringTrimFunction();
    private static final Function<String, String> STRING_TO_UPPER_CASE_FUNCTION = new StringToUpperCaseFunction();
    private static final Function<String, String> STRING_TO_LOWER_CASE_FUNCTION = new StringToLowerCaseFunction();

    public static Function<String, Integer> toInt() {
        return STRING_TO_INT_FUNCTION;
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
