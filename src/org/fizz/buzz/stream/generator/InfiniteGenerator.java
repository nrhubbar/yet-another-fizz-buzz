package org.fizz.buzz.stream.generator;

import java.util.stream.Stream;

public class InfiniteGenerator implements StreamGenerator {

    int i = 0;

    @Override
    public Stream<Integer> generate() {
        return Stream.generate(this::iterate);
    }

    private int iterate() {
        return i++;
    }
}
