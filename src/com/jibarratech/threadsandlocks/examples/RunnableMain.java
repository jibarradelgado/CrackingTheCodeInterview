package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 18/03/2016.
 */
public class RunnableMain {
    public static void main(String[] args) {
        RunnableThreadExample instance = new RunnableThreadExample();
        Thread thread = new Thread(instance);
        thread.start();

        /* Waits until above thread counts to 5 (slowly) */
        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }
}
