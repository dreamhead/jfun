package com.github.dreamhead.jfun;

import com.google.common.collect.Iterables;
import org.junit.Test;

import java.util.List;

import static com.github.dreamhead.jfun.NumberFunctions.*;
import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Iterables.transform;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberFunctionsTest {
    @Test
    public void should_convert_int_to_string() {
        List<Integer> ints = of(1, 2, 3);

        Iterable<String> strings = transform(ints, intToString());
        assertThat(Iterables.get(strings, 0), is("1"));
        assertThat(Iterables.get(strings, 1), is("2"));
        assertThat(Iterables.get(strings, 2), is("3"));
    }

    @Test
    public void should_convert_long_to_string() {
        List<Long> longs = of(1l, 2l, 3l);

        Iterable<String> strings = transform(longs, longToString());
        assertThat(Iterables.get(strings, 0), is("1"));
        assertThat(Iterables.get(strings, 1), is("2"));
        assertThat(Iterables.get(strings, 2), is("3"));
    }

    @Test
    public void should_convert_double_to_string() {
        List<Double> doubles = of(1.1, 2.2, 3.3);

        Iterable<String> strings = transform(doubles, doubleToString());
        assertThat(Iterables.get(strings, 0), is("1.1"));
        assertThat(Iterables.get(strings, 1), is("2.2"));
        assertThat(Iterables.get(strings, 2), is("3.3"));
    }

    @Test
    public void should_convert_float_to_string() {
        List<Float> doubles = of(1.1f, 2.2f, 3.3f);

        Iterable<String> strings = transform(doubles, floatToString());
        assertThat(Iterables.get(strings, 0), is("1.1"));
        assertThat(Iterables.get(strings, 1), is("2.2"));
        assertThat(Iterables.get(strings, 2), is("3.3"));
    }
}
