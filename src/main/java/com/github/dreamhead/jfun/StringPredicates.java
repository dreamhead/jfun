package com.github.dreamhead.jfun;

import com.google.common.base.Predicate;
import com.google.common.base.Strings;

import static com.google.common.base.Preconditions.checkNotNull;
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

    private static class StringStartsWithPredicate implements Predicate<String> {
        private final String prefix;

        private StringStartsWithPredicate(final String prefix) {
            this.prefix = checkNotNull(prefix);
        }

        @Override
        public boolean apply(String input) {
            return input != null && input.startsWith(prefix);
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof StringStartsWithPredicate) {
                StringStartsWithPredicate predicate = StringStartsWithPredicate.class.cast(object);
                return this.prefix.equals(predicate);
            }

            return false;
        }

        @Override
        public int hashCode() {
            return this.prefix.hashCode();
        }

        @Override
        public String toString() {
            return "StringStartsWith(" + this.prefix + ")";
        }
    }

    private static class StringEndsWithPredicate implements Predicate<String> {
        private String suffix;

        public StringEndsWithPredicate(final String suffix) {
            this.suffix = suffix;
        }

        @Override
        public boolean apply(String input) {
            return input != null && input.endsWith(suffix);
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof StringEndsWithPredicate) {
                StringEndsWithPredicate predicate = StringEndsWithPredicate.class.cast(object);
                return this.suffix.equals(predicate);
            }

            return false;
        }

        @Override
        public int hashCode() {
            return this.suffix.hashCode();
        }

        @Override
        public String toString() {
            return "StringEndsWith(" + this.suffix + ")";
        }
    }

    private static class StringIsEmptyPredicate implements Predicate<String> {

        @Override
        public boolean apply(String input) {
            return isNullOrEmpty(input);
        }

        @Override
        public boolean equals(Object object) {
            return object instanceof StringIsEmptyPredicate;
        }

        @Override
        public int hashCode() {
            return this.getClass().hashCode();
        }

        @Override
        public String toString() {
            return "StringIsEmpty";
        }
    }
}
