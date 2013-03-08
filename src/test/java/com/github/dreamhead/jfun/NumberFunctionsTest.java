package com.github.dreamhead.jfun;

import com.google.common.collect.Iterables;
import org.junit.Test;

import java.util.List;

import static com.github.dreamhead.jfun.NumberFunctions.intToString;
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
}
