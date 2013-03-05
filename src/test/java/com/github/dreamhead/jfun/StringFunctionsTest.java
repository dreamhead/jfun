package com.github.dreamhead.jfun;

import org.junit.Test;

import java.util.List;

import static com.github.dreamhead.jfun.StringFunctions.*;
import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Iterables.get;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class StringFunctionsTest {
    @Test
    public void should_convert_string_to_int() {
        List<String> strings = of("1", "2", "3");
        Iterable<Integer> ints = transform(strings, toInt());
        assertThat(get(ints, 0), is(1));
        assertThat(get(ints, 1), is(2));
        assertThat(get(ints, 2), is(3));
    }

    @Test
    public void should_convert_string_to_long() {
        List<String> strings = of("1", "2", "3");
        Iterable<Long> longs = transform(strings, toLong());
        assertThat(get(longs, 0), is(1L));
        assertThat(get(longs, 1), is(2L));
        assertThat(get(longs, 2), is(3L));
    }

    @Test
    public void should_convert_string_to_float() {
        List<String> strings = of("1.5", "2.3", "3.1");
        Iterable<Float> longs = transform(strings, toFloat());
        assertThat(get(longs, 0), is(1.5f));
        assertThat(get(longs, 1), is(2.3f));
        assertThat(get(longs, 2), is(3.1f));
    }

    @Test
    public void should_convert_string_to_double() {
        List<String> strings = of("1.5", "2.3", "3.1");
        Iterable<Double> longs = transform(strings, toDouble());
        assertThat(get(longs, 0), is(1.5));
        assertThat(get(longs, 1), is(2.3));
        assertThat(get(longs, 2), is(3.1));
    }

    @Test
    public void should_trim() {
        // newArrayList for null
        List<String> strings = newArrayList("foo ", " bar", " foobar ", null);
        Iterable<String> transformed = transform(strings, trim());
        assertThat(get(transformed, 0), is("foo"));
        assertThat(get(transformed, 1), is("bar"));
        assertThat(get(transformed, 2), is("foobar"));
        assertThat(get(transformed, 3), nullValue());
    }

    @Test
    public void should_to_upper_case() {
        // newArrayList for null
        List<String> strings = newArrayList("Foo", "Bar", null);
        Iterable<String> transformed = transform(strings, toUpperCase());
        assertThat(get(transformed, 0), is("FOO"));
        assertThat(get(transformed, 1), is("BAR"));
        assertThat(get(transformed, 2), nullValue());
    }

    @Test
    public void should_to_lower_case() {
        // newArrayList for null
        List<String> strings = newArrayList("Foo", "Bar", null);
        Iterable<String> transformed = transform(strings, toLowerCase());
        assertThat(get(transformed, 0), is("foo"));
        assertThat(get(transformed, 1), is("bar"));
        assertThat(get(transformed, 2), nullValue());
    }

    @Test
    public void should_replace_with_replacement() {
        // newArrayList for null
        List<String> strings = newArrayList("Foo", "Bar", "FooBar", null);
        Iterable<String> transformed = transform(strings, replace("Foo", "Bar"));
        assertThat(get(transformed, 0), is("Bar"));
        assertThat(get(transformed, 1), is("Bar"));
        assertThat(get(transformed, 2), is("BarBar"));
        assertThat(get(transformed, 3), nullValue());
    }
}
