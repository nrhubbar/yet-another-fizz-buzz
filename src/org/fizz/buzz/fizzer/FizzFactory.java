package org.fizz.buzz.fizzer;

import org.fizz.buzz.controller.SimpleFizzController;

@FunctionalInterface
public interface FizzFactory {
    SimpleFizzController buildFizzController();
}
