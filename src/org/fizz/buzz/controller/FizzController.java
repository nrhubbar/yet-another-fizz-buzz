package org.fizz.buzz.controller;

import java.util.function.Consumer;

public interface FizzController extends Consumer<Integer> {

    default void processFizz(Integer input) {
        accept(input);
    }

    @Override
    default void accept(Integer integer) {
        processFizz(integer);
    }
}
