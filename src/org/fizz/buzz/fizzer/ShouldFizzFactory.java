package org.fizz.buzz.fizzer;

import java.util.function.Predicate;

public interface ShouldFizzFactory {
    Predicate<Integer> buildShouldFizz(Integer i);
}
