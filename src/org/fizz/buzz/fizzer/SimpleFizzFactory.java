package org.fizz.buzz.fizzer;

import org.fizz.buzz.fizzer.SimpleFizz;

public interface SimpleFizzFactory {
    SimpleFizz buildSimpleFizz(Integer fizzMatcher, String fizzValue);
}
