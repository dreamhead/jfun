package com.github.dreamhead.jfun;

import com.google.common.collect.FluentIterable;
import org.junit.Test;

import static com.github.dreamhead.jfun.NumberPredicates.closeTo;
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

    @Test
    public void should_close_to() {
        FluentIterable<Double> doubles = from(of(2.0, 2.1, 2.109, 2.2)).filter(closeTo(2.1f, 0.01f));
        assertThat(doubles.get(0), is(2.1));
        assertThat(doubles.get(1), is(2.109));
    }
}
