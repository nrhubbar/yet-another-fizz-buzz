package org.fizz.buzz.stream.generator;

import java.util.function.Supplier;
import java.util.stream.Stream;

public interface StreamGenerator extends Supplier<Stream<Integer>> {
    Stream<Integer> generate();

    @Override
    default Stream<Integer> get() {
        return generate();
    }
}
