package org.fizz.buzz.tester;

import java.util.stream.IntStream;

public class DecoupledWithStreamsFizzBuzzFizzBuzz extends DecoupledLogicFizzBuzz {

    @Override
    public void run() {
        IntStream.range(0, max)
                .boxed()
                .map(this::fizzDeterminer)
                .forEach(System.out::println);
    }
}
