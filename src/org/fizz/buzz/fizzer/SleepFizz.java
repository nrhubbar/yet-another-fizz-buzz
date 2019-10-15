package org.fizz.buzz.fizzer;

public class SleepFizz implements Fizz {
    @Override
    public String getFizz(Integer i) {
        try {
           Thread.sleep(100);
        } catch (Exception e) {

        }
        return "";
    }
}
