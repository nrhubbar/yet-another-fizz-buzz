package org.fizz.buzz.controller;

import org.fizz.buzz.controller.output.builder.SimpleOutputBuilder;
import org.fizz.buzz.controller.output.builder.UnboundedFizzControllerFactory;

public class PrintUnboundedFizzControllerFactory implements UnboundedFizzControllerFactory {
    @Override
    public UnboundedFizzController buildUnboundedFizzController() {
        return new UnboundedFizzController(System.out::println, new SimpleOutputBuilder());
    }
}
