package com.github.dreamhead.jfun;

import com.google.common.collect.FluentIterable;
import org.junit.Test;

import static com.github.dreamhead.jfun.StringFunctions.*;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class StringFunctionsTest {
    @Test
    public void should_convert_string_to_int() {
        FluentIterable<Integer> ints = from(of("1", "2", "3")).transform(toInt());
        assertThat(ints.get(0), is(1));
        assertThat(ints.get(1), is(2));
        assertThat(ints.get(2), is(3));
    }

    @Test
    public void should_convert_string_to_long() {
        FluentIterable<Long> longs = from(of("1", "2", "3")).transform(toLong());
        assertThat(longs.get(0), is(1L));
        assertThat(longs.get(1), is(2L));
        assertThat(longs.get(2), is(3L));
    }

    @Test
    public void should_convert_string_to_float() {
        FluentIterable<Float> flotats = from(of("1.5", "2.3", "3.1")).transform(toFloat());
        assertThat(flotats.get(0), is(1.5f));
        assertThat(flotats.get(1), is(2.3f));
        assertThat(flotats.get(2), is(3.1f));
    }

    @Test
    public void should_convert_string_to_double() {
        FluentIterable<Double> doubles = from(of("1.5", "2.3", "3.1")).transform(toDouble());
        assertThat(doubles.get(0), is(1.5));
        assertThat(doubles.get(1), is(2.3));
        assertThat(doubles.get(2), is(3.1));
    }

    @Test
    public void should_trim() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("foo ", " bar", " foobar ", null)).transform(trim());

        assertThat(strings.get(0), is("foo"));
        assertThat(strings.get(1), is("bar"));
        assertThat(strings.get(2), is("foobar"));
        assertThat(strings.get(3), nullValue());
    }

    @Test
    public void should_to_upper_case() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("Foo", "Bar", null)).transform(toUpperCase());
        assertThat(strings.get(0), is("FOO"));
        assertThat(strings.get(1), is("BAR"));
        assertThat(strings.get(2), nullValue());
    }

    @Test
    public void should_to_lower_case() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("Foo", "Bar", null)).transform(toLowerCase());
        assertThat(strings.get(0), is("foo"));
        assertThat(strings.get(1), is("bar"));
        assertThat(strings.get(2), nullValue());
    }

    @Test
    public void should_replace_with_replacement() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("Foo", "Bar", "FooBar", null)).transform(replace("Foo", "Bar"));
        assertThat(strings.get(0), is("Bar"));
        assertThat(strings.get(1), is("Bar"));
        assertThat(strings.get(2), is("BarBar"));
        assertThat(strings.get(3), nullValue());
    }
}
