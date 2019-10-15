package org.fizz.buzz.executor;

import org.fizz.buzz.controller.FizzController;

import java.util.stream.Stream;

public interface Executor {

    void execute(Stream<Integer> numbers, FizzController fizzController);
}
