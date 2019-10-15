package org.fizz.buzz.tester;

import org.fizz.buzz.controller.UnboundedFizzController;
import org.fizz.buzz.executor.Executor;
import org.fizz.buzz.fizzer.SimpleFizzFactory;
import org.fizz.buzz.fizzer.SleepFizz;
import org.fizz.buzz.stream.generator.StreamGenerator;

public class FizzControllerFizzBuzz implements Tester {

    SimpleFizzFactory simpleFizzFactory;
    UnboundedFizzController unboundedFizzController;
    Executor executor;
    StreamGenerator generator;

    public FizzControllerFizzBuzz(SimpleFizzFactory simpleFizzFactory, UnboundedFizzController unboundedFizzController, Executor executor, StreamGenerator generator) {
        this.simpleFizzFactory = simpleFizzFactory;
        this.unboundedFizzController = unboundedFizzController;
        this.executor = executor;
        this.generator = generator;
    }

    @Override
    public void run() {
         unboundedFizzController
                .putFizz(simpleFizzFactory.buildSimpleFizz(3, "Fizz"))
                .putFizz(simpleFizzFactory.buildSimpleFizz(5, "Buzz"));

        executor.execute(generator.generate(), unboundedFizzController);
    }
}
