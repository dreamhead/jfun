package com.github.dreamhead.jfun;

import com.google.common.base.Function;

public abstract class NoArityFunction<F, T> implements Function<F, T> {
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return this.getClass().isInstance(object);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
