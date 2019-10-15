package org.fizz.buzz.tester;

public class DecoupledLogicFizzBuzz implements Tester {

    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println(fizzDeterminer(i));
        }
    }

    protected String fizzDeterminer(int i) {
        if (i % 3 == 0) {
                if (i % 5 == 0) {
                    return  ("FizzBuzz");
                } else {
                    return ("Fizz");
                }
            } else if (i % 5 == 0) {
                return ("Buzz");
            } else {
                return Integer.toString(i);
            }
    }
}
