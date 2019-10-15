package org.fizz.buzz.fizzer;

public class ModuloSimpleFizzFactory implements SimpleFizzFactory {

    @Override
    public SimpleFizz buildSimpleFizz(Integer fizzMatcher, String fizzValue) {
        return new SimpleFizz(fizzMatcher, fizzValue, new ModuloIs0ShouldFizzFactory());
    }
}
