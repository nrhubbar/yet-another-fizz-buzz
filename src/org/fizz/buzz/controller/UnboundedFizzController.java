package org.fizz.buzz.controller;

import org.fizz.buzz.fizzer.Fizz;
import org.fizz.buzz.controller.output.builder.UnboundedOutputBuilder;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Uses a stream of {@link Fizz} to build the output to be consumed by the {@link UnboundedFizzController#fizzSaver}.
 */
public class UnboundedFizzController implements FizzController {

    ArrayList<Function<Integer, String>> fizzes = new ArrayList<>();
    UnboundedOutputBuilder outputBuilder;
    Consumer<String> fizzSaver;

    public UnboundedFizzController(Consumer<String> fizzSaver, UnboundedOutputBuilder outputBuilder) {
        this.fizzSaver = fizzSaver;
        this.outputBuilder = outputBuilder;
    }

    @Override
    public void processFizz(Integer integer) {

        fizzSaver.accept(outputBuilder.buildOutput(fizzes.stream(), integer));
    }

    public UnboundedFizzController putFizz(Fizz fizz) {
        fizzes.add(fizz);
        return this;
    }
}
