package com.github.dreamhead.jfun.optional;

import com.google.common.base.Function;
import com.google.common.base.Optional;

import static com.google.common.base.Optional.absent;

public class Optionals {
    public static <T, U> Optional<U> bind(Optional<T> value,
                                          Function<T, Optional<U>> function) {
        if (value.isPresent()) {
            return function.apply(value.get());
        }

        return absent();
    }

    private Optionals() {}
}
