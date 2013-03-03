package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public class StringFunctions {
    private static final Function<String, Integer> STRING_TO_INT_FUNCTION = new StringToInt();
    private static final Function<String, Long> STRING_TO_LONG_FUNCTION = new StringToLong();
    private static final Function<String, Float> STRING_TO_FLOAT_FUNCTION = new StringToFloat();
    private static final Function<String, Double> STRING_TO_DOUBLE_FUNCTION = new StringToDouble();
    private static final Function<String, String> STRING_TRIM_FUNCTION = new StringTrim();
    private static final Function<String, String> STRING_TO_UPPER_CASE_FUNCTION = new StringToUpper();
    private static final Function<String, String> STRING_TO_LOWER_CASE_FUNCTION = new StringToLowerCase();

    public static Function<String, Integer> toInt() {
        return STRING_TO_INT_FUNCTION;
    }

    public static Function<String, Long> toLong() {
        return STRING_TO_LONG_FUNCTION;
    }

    public static Function<String, Float> toFloat() {
        return STRING_TO_FLOAT_FUNCTION;
    }

    public static Function<String, Double> toDouble() {
        return STRING_TO_DOUBLE_FUNCTION;
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

    private static class StringToInt extends NoArityFunction<String, Integer> {
        @Override
        public Integer apply(String input) {
            return Integer.parseInt(input);
        }
    }

    private static class StringToLong extends NoArityFunction<String, Long> {
        @Override
        public Long apply(String input) {
            return Long.parseLong(input);
        }
    }

    private static class StringToFloat extends NoArityFunction<String, Float> {
        @Override
        public Float apply(String input) {
            return Float.parseFloat(input);
        }
    }

    private static class StringToDouble extends NoArityFunction<String, Double> {
        @Override
        public Double apply(String input) {
            return Double.parseDouble(input);
        }
    }

    private static class StringTrim implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input == null ? null : input.trim();
        }
    }

    private static class StringToUpper implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input == null ? null : input.toUpperCase();
        }
    }

    private static class StringToLowerCase implements Function<String, String> {
        @Override
        public String apply(String input) {
            return input == null ? null : input.toLowerCase();
        }
    }
}
