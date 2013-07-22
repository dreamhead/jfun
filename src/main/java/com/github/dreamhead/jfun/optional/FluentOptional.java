package com.github.dreamhead.jfun.optional;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;

import java.util.Set;

public class FluentOptional<T> {
    private Optional<T> optional;

    private FluentOptional(Optional<T> optional) {
        this.optional = optional;
    }

    public static <T> FluentOptional<T> from(Optional<T> optional) {
        return new FluentOptional<T>(optional);
    }

    public <U> FluentOptional<U> bind(Function<T, Optional<U>> function) {
        if (isPresent()) {
            return from(function.apply(get()));
        }

        return from(Optional.<U>absent());
    }

    public boolean isPresent() {
        return optional.isPresent();
    }

    public T get() {
        return optional.get();
    }

    public T or(T defaultValue) {
        return optional.or(defaultValue);
    }

    public Optional<T> or(Optional<? extends T> secondChoice) {
        return optional.or(secondChoice);
    }

    public T or(Supplier<? extends T> supplier) {
        return optional.or(supplier);
    }

    public T orNull() {
        return optional.orNull();
    }

    public Set<T> asSet() {
        return optional.asSet();
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        return optional.transform(function);
    }

    @Override
    public boolean equals(Object object) {
        return optional.equals(object);
    }

    @Override
    public int hashCode() {
        return optional.hashCode();
    }

    @Override
    public String toString() {
        return optional.toString();
    }
}
