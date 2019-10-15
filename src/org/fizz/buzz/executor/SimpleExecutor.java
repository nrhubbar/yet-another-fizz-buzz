package org.fizz.buzz.executor;

import org.fizz.buzz.controller.FizzController;

import java.util.stream.Stream;

public class SimpleExecutor implements Executor {

    @Override
    public void execute(Stream<Integer> numbers, FizzController fizzController) {
        numbers.forEach(fizzController);
    }
}
