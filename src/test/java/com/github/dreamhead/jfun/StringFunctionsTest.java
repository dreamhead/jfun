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
        List<String> strings = newArrayList("foo", "bar", null);
        Iterable<String> transformed = transform(strings, toUpperCase());
        assertThat(get(transformed, 0), is("FOO"));
        assertThat(get(transformed, 1), is("BAR"));
        assertThat(get(transformed, 2), nullValue());
    }
}
