package org.fizz.buzz;

import org.fizz.buzz.controller.PrintUnboundedFizzControllerFactory;
import org.fizz.buzz.executor.SimpleExecutor;
import org.fizz.buzz.fizzer.ModuloSimpleFizzFactory;
import org.fizz.buzz.stream.generator.FromMaxGenerator;
import org.fizz.buzz.stream.generator.InfiniteGenerator;
import org.fizz.buzz.tester.FizzControllerFizzBuzz;

public class Main {

    public static void main(String[] args) {

        int max = 100;

        new FizzControllerFizzBuzz(new ModuloSimpleFizzFactory(),
                    new PrintUnboundedFizzControllerFactory().buildUnboundedFizzController(),
                    new SimpleExecutor(),
                    new InfiniteGenerator())
            .run();
    }
}
