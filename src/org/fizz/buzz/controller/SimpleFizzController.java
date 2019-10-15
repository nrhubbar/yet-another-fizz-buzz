package org.fizz.buzz.controller;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SimpleFizzController implements FizzController {
    Predicate<Integer> fizzController;
    Predicate<Integer> buzzController;
    Supplier<String> fizzProducer;
    Supplier<String> buzzProducer;
    Consumer<String> fizzConsumer;

    public SimpleFizzController(Predicate<Integer> fizzController, Predicate<Integer> buzzController, Supplier<String> fizzProducer, Supplier<String> buzzProducer, Consumer<String> fizzConsumer) {
        this.fizzController = fizzController;
        this.buzzController = buzzController;
        this.fizzProducer = fizzProducer;
        this.buzzProducer = buzzProducer;
        this.fizzConsumer = fizzConsumer;
    }

    @Override
    public void accept(Integer integer) {
        if (fizzController.test(integer)) {
            if (buzzController.test(integer)) {
                fizzConsumer.accept(fizzProducer.get().concat(buzzProducer.get()));
            } else {
                fizzConsumer.accept(fizzProducer.get());
            }
        } else if (buzzController.test(integer)) {
            fizzConsumer.accept(buzzProducer.get());
        } else {
            fizzConsumer.accept(integer.toString());
        }
    }
}
