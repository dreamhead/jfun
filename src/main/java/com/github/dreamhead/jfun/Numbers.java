package com.github.dreamhead.jfun;

import static com.google.common.base.Preconditions.checkArgument;

public class Numbers {
    public static void times(int times, Consumer<Integer> consumer) {
        checkArgument(times >= 0, "");
        for (int i = 0; i < times; i++) {
            consumer.apply(i);
        }
    }
}
