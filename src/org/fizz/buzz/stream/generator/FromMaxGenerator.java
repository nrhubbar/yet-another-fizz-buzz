package org.fizz.buzz.stream.generator;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromMaxGenerator implements StreamGenerator {

    private int max;

    public FromMaxGenerator(int max) {
        this.max = max;
    }

    @Override
    public Stream<Integer> generate() {
        return IntStream.range(0, max).boxed();
    }
}
