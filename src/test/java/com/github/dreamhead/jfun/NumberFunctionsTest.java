package com.github.dreamhead.jfun;

import com.google.common.collect.FluentIterable;
import org.junit.Test;

import static com.github.dreamhead.jfun.NumberFunctions.*;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.ImmutableList.of;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberFunctionsTest {
    @Test
    public void should_convert_int_to_string() {
        FluentIterable<String> strings = from(of(1, 2, 3)).transform(intToString());
        assertThat(strings.get(0), is("1"));
        assertThat(strings.get(1), is("2"));
        assertThat(strings.get(2), is("3"));
    }

    @Test
    public void should_convert_long_to_string() {
        FluentIterable<String> strings = from(of(1l, 2l, 3l)).transform(longToString());
        assertThat(strings.get(0), is("1"));
        assertThat(strings.get(1), is("2"));
        assertThat(strings.get(2), is("3"));
    }

    @Test
    public void should_convert_double_to_string() {
        FluentIterable<String> strings = from(of(1.1, 2.2, 3.3)).transform(doubleToString());
        assertThat(strings.get(0), is("1.1"));
        assertThat(strings.get(1), is("2.2"));
        assertThat(strings.get(2), is("3.3"));
    }

    @Test
    public void should_convert_float_to_string() {
        FluentIterable<String> strings = from(of(1.1f, 2.2f, 3.3f)).transform(floatToString());
        assertThat(strings.get(0), is("1.1"));
        assertThat(strings.get(1), is("2.2"));
        assertThat(strings.get(2), is("3.3"));
    }
}
