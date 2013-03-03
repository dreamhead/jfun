package com.github.dreamhead.jfun;

import com.google.common.base.Predicate;

import static com.google.common.base.Predicates.not;
import static com.google.common.base.Strings.isNullOrEmpty;

public class StringPredicates {
    private static Predicate<String> IS_EMPTY_PREDICATE = new StringIsEmptyPredicate();
    private static Predicate<String> NOT_EMPTY_PREDICATE = not(IS_EMPTY_PREDICATE);

    public static Predicate<String> startsWith(final String prefix) {
        return new StringStartsWithPredicate(prefix);
    }

    public static Predicate<String> endsWith(final String suffix) {
        return new StringEndsWithPredicate(suffix);
    }

    public static Predicate<String> isEmptyString() {
        return IS_EMPTY_PREDICATE;
    }

    public static Predicate<String> notEmptyString() {
        return NOT_EMPTY_PREDICATE;
    }

    private static class StringStartsWithPredicate extends UnaryPredicate<String> {
        private StringStartsWithPredicate(final String prefix) {
            super(prefix);
        }

        @Override
        public boolean apply(String input) {
            return input != null && input.startsWith(target);
        }
    }

    private static class StringEndsWithPredicate extends UnaryPredicate<String> {
        public StringEndsWithPredicate(final String suffix) {
            super(suffix);
        }

        @Override
        public boolean apply(String input) {
            return input != null && input.endsWith(target);
        }
    }

    private static class StringIsEmptyPredicate extends NoArityPredicate<String> {
        @Override
        public boolean apply(String input) {
            return isNullOrEmpty(input);
        }
    }
}
