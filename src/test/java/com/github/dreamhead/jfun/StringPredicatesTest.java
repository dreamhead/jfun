package com.github.dreamhead.jfun;

import org.junit.Test;

import java.util.List;

import static com.github.dreamhead.jfun.StringPredicates.*;
import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.get;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class StringPredicatesTest {
    @Test
    public void should_start_with_prefix() {
        List<String> strings = of("foo", "bar", "foobar");
        Iterable<String> filtered = filter(strings, startsWith("foo"));
        assertThat(get(filtered, 0), is("foo"));
        assertThat(get(filtered, 1), is("foobar"));
    }

    @Test
    public void should_end_with_suffix() {
        List<String> strings = of("foo", "bar", "foobar");
        Iterable<String> filtered = filter(strings, endsWith("bar"));
        assertThat(get(filtered, 0), is("bar"));
        assertThat(get(filtered, 1), is("foobar"));
    }

    @Test
    public void should_be_empty() {
        // newArrayList for null
        List<String> strings = newArrayList("foo", "", null);
        Iterable<String> filtered = filter(strings, isEmptyString());
        assertThat(get(filtered, 0), is(""));
        assertThat(get(filtered, 1), nullValue());
    }

    @Test
    public void should_be_not_empty() {
        // newArrayList for null
        List<String> strings = newArrayList("foo", "", null);
        Iterable<String> filtered = filter(strings, notEmptyString());
        assertThat(get(filtered, 0), is("foo"));
    }
}
