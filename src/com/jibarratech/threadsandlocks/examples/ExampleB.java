package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 18/03/2016.
 */
public class ExampleB {
    public static void main (String[] args){
        ThreadExample instance = new ThreadExample();
        instance.start();

        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }
}
