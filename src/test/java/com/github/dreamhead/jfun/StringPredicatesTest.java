package com.github.dreamhead.jfun;

import com.google.common.collect.FluentIterable;
import org.junit.Test;

import static com.github.dreamhead.jfun.StringPredicates.*;
import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.ImmutableList.of;
import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class StringPredicatesTest {
    @Test
    public void should_start_with_prefix() {
        FluentIterable<String> strings = from(of("foo", "bar", "foobar")).filter(startsWith("foo"));
        assertThat(strings.get(0), is("foo"));
        assertThat(strings.get(1), is("foobar"));
    }

    @Test
    public void should_end_with_suffix() {
        FluentIterable<String> strings = from(of("foo", "bar", "foobar")).filter(endsWith("bar"));
        assertThat(strings.get(0), is("bar"));
        assertThat(strings.get(1), is("foobar"));
    }

    @Test
    public void should_be_empty() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("foo", "", null)).filter(isEmptyString());
        assertThat(strings.get(0), is(""));
        assertThat(strings.get(1), nullValue());
    }

    @Test
    public void should_be_not_empty() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("foo", "", null)).filter(notEmptyString());
        assertThat(strings.get(0), is("foo"));
    }

    @Test
    public void should_contain() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("foo", "bar", "foobar", null)).filter(contains("foo"));
        assertThat(strings.get(0), is("foo"));
        assertThat(strings.get(1), is("foobar"));
    }

    @Test
    public void should_match() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("foo", "bar", "foobar", null)).filter(matches("foo.*"));
        assertThat(strings.get(0), is("foo"));
        assertThat(strings.get(1), is("foobar"));
    }

    @Test
    public void should_equal_to_ignoring_case() {
        // newArrayList for null
        FluentIterable<String> strings = from(newArrayList("foo", "bar", "Foo", null)).filter(equalToIgnoringCase("foo"));
        assertThat(strings.get(0), is("foo"));
        assertThat(strings.get(1), is("Foo"));
    }
}
