package org.fizz.buzz.fizzer;

import org.fizz.buzz.controller.SimpleFizzController;

public class DefaulFizzFactory implements FizzFactory {
    @Override
    public SimpleFizzController buildFizzController() {
        return new SimpleFizzController(this::fizzController, this::buzzController, this::buildFizz, this::buildBuzz, System.out::println);
    }

    private Boolean fizzController(Integer i) {
        return  i % 3 == 0;
    }

    private Boolean buzzController(Integer i) {
        return i % 5 == 0;
    }

    private String buildFizz() {
        return "Fizz";
    }

    private String buildBuzz() {
        return "Buzz";
    }
}
