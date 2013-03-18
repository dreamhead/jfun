package com.github.dreamhead.jfun;

import com.google.common.collect.FluentIterable;
import org.junit.Test;

import static com.github.dreamhead.jfun.NumberPredicates.greaterThan;
import static com.github.dreamhead.jfun.NumberPredicates.lessThan;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.ImmutableList.of;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberPredicatesTest {
    @Test
    public void should_filter_less_than_int() {
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(lessThan(2));
        assertThat(ints.get(0), is(1));
    }

    @Test
    public void should_filter_less_than_double() {
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(lessThan(2.0));
        assertThat(ints.get(0), is(1));
    }

    @Test
    public void should_filter_less_than_long() {
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(lessThan(2L));
        assertThat(ints.get(0), is(1));
    }

    @Test
    public void should_filter_less_than_float() {
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(lessThan(2.0f));
        assertThat(ints.get(0), is(1));
    }

    @Test
    public void should_filter_greater_than_int(){
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(greaterThan(2));
        assertThat(ints.get(0), is(3));
    }

    @Test
    public void should_filter_greater_than_double(){
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(greaterThan(2.0));
        assertThat(ints.get(0), is(3));
    }

    @Test
    public void should_filter_greater_than_long(){
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(greaterThan(2L));
        assertThat(ints.get(0), is(3));
    }

    @Test
    public void should_filter_greater_than_float(){
        FluentIterable<Integer> ints = from(of(1, 2, 3)).filter(greaterThan(2.0f));
        assertThat(ints.get(0), is(3));
    }
}
