package com.github.dreamhead.jfun;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static com.github.dreamhead.jfun.NumberPredicates.greaterThan;
import static com.github.dreamhead.jfun.NumberPredicates.lessThan;
import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.getFirst;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberPredicatesTest {
    @Test
    public void should_filter_less_than_int() {
        List<Integer> ints = of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, lessThan(2));
        assertThat(getFirst(filter, 0), is(1));
    }

    @Test
    public void should_filter_less_than_double() {
        List<Integer> ints = of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, lessThan(2.0));
        assertThat(getFirst(filter, 0), is(1));
    }

    @Test
    public void should_filter_less_than_long() {
        List<Integer> ints = of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, lessThan(2L));
        assertThat(getFirst(filter, 0), is(1));
    }

    @Test
    public void should_filter_less_than_float() {
        List<Integer> ints = of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, lessThan(2.0f));
        assertThat(getFirst(filter, 0), is(1));
    }

    @Test
    public void should_filter_greater_than_int(){
        List<Integer> ints = ImmutableList.of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, greaterThan(2));
        assertThat(getFirst(filter, 1), is(3));
    }

    @Test
    public void should_filter_greater_than_double(){
        List<Integer> ints = ImmutableList.of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, greaterThan(2.0));
        assertThat(getFirst(filter, 1), is(3));
    }

    @Test
    public void should_filter_greater_than_long(){
        List<Integer> ints = ImmutableList.of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, greaterThan(2L));
        assertThat(getFirst(filter, 1), is(3));
    }

    @Test
    public void should_filter_greater_than_float(){
        List<Integer> ints = ImmutableList.of(1, 2, 3);
        Iterable<Integer> filter = filter(ints, greaterThan(2));
        assertThat(getFirst(filter, 1), is(3));
    }
}
