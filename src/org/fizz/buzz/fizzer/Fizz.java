package org.fizz.buzz.fizzer;


import java.util.function.Function;

public interface Fizz extends Function<Integer, String> {
    String getFizz(Integer i);

    @Override
    default String apply(Integer integer) {
        return getFizz(integer);
    }
}
