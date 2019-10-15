package org.fizz.buzz.fizzer;

import java.util.function.Predicate;

public class SimpleFizz implements Fizz {

    Integer fizzMatcher;
    String fizzValue;
    Predicate<Integer> shouldFizz;

    public SimpleFizz(Integer fizzMatcher, String fizzValue, ShouldFizzFactory shouldFizzFactory) {
        this.fizzMatcher = fizzMatcher;
        this.fizzValue = fizzValue;
        this.shouldFizz = shouldFizzFactory.buildShouldFizz(fizzMatcher);
    }

    @Override
    public String getFizz(Integer i) {
        return shouldFizz.test(i) ? fizzValue : "";
    }
}
