package com.github.dreamhead.jfun;

import org.junit.Test;

import static com.github.dreamhead.jfun.Numbers.times;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumbersTest {
    @Test
    public void should_run_for_times() {
        TimesConsumer consumer = new TimesConsumer();
        times(5, consumer);
        assertThat(consumer.getSum(), is(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_for_negative_times() {
        times(-1, new TimesConsumer());
    }

    private static class TimesConsumer implements Consumer<Integer> {
        private int sum = 0;

        private int getSum() {
            return sum;
        }

        @Override
        public void apply(Integer input) {
            sum += input;
        }
    }
}
