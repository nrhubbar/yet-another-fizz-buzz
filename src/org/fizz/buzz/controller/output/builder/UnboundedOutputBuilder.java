package org.fizz.buzz.controller.output.builder;

import java.util.function.Function;
import java.util.stream.Stream;

public interface UnboundedOutputBuilder {
    String buildOutput(Stream<Function<Integer, String>> outputGenerator, Integer input);
}
