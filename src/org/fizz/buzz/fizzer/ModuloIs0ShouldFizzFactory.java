package org.fizz.buzz.fizzer;

import java.util.function.Predicate;

public class ModuloIs0ShouldFizzFactory implements ShouldFizzFactory {
    @Override
    public Predicate<Integer> buildShouldFizz(Integer i) {
        return (x) -> x % i == 0;
    }
}
