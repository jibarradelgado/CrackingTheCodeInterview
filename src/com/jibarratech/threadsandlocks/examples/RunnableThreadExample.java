package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 18/03/2016.
 */
public class RunnableThreadExample implements Runnable {
    public int count = 0;

    public void run () {
        System.out.println("RunnableThread starting.");
        try {
            while (count < 5) {
                Thread.sleep(500);
                count++;
            }
        } catch (InterruptedException ex) {
            System.out.println("RunnableThread interrupted.");
        }
        System.out.println("RunnableThread terminating.");
    }
}
