package org.fizz.buzz.controller.output.builder;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleOutputBuilder implements UnboundedOutputBuilder {

    @Override
    public String buildOutput(Stream<Function<Integer, String>> outputGenerator, Integer input) {
        String output = outputGenerator.map(getOutput(input)).collect(Collectors.joining());

        return output.isEmpty() ? input.toString() : output;
    }

    private Function<Function<Integer, String>, String> getOutput(Integer input) {
        return (function) -> function.apply(input);
    }
}
