package com.github.dreamhead.jfun;

import com.google.common.base.Predicate;

import static java.lang.String.format;

public abstract class UnaryPredicate<T> implements Predicate<T> {
    protected final T target;

    protected UnaryPredicate(T target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object obj) {
        Class<? extends UnaryPredicate> clazz = this.getClass();
        if (clazz.isInstance(obj)) {
            UnaryPredicate that = clazz.cast(obj);
            return target.equals(that.target);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return target.hashCode();
    }

    @Override
    public String toString() {
        return format("%s(%s)", this.getClass().getSimpleName(), target.toString());
    }
}
