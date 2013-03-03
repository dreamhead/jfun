package com.github.dreamhead.jfun;

import com.google.common.base.Predicate;

public abstract class NoArityPredicate<T> implements Predicate<T> {
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
