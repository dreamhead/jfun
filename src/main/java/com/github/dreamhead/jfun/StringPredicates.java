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

    public static Predicate<String> contains(final String text) {
        return new StringContainsPredicate(text);
    }

    public static Predicate<String> matches(final String regex) {
        return new StringMatchesPredicate(regex);
    }

    public static Predicate<String> equalToIgnoringCase(final String text) {
        return new StringEqualToIgnoringCase(text);
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

    private static class StringContainsPredicate extends UnaryPredicate<String> {
        public StringContainsPredicate(String text) {
            super(text);
        }

        @Override
        public boolean apply(String input) {
            return input != null && input.contains(target);
        }
    }

    private static class StringMatchesPredicate extends UnaryPredicate<String> {
        public StringMatchesPredicate(String regex) {
            super(regex);
        }

        @Override
        public boolean apply(final String input) {
            return input != null && input.matches(target);
        }
    }

    private static class StringEqualToIgnoringCase extends UnaryPredicate<String> {
        public StringEqualToIgnoringCase(String text) {
            super(text);
        }

        @Override
        public boolean apply(String input) {
            return input != null && input.equalsIgnoreCase(target);
        }
    }
}
