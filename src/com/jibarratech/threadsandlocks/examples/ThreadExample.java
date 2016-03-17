package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 18/03/2016.
 */
public class ThreadExample extends Thread {
    int count = 0;

    public void run() {
        System.out.println("Thread starting.");
        try {
            while (count < 5) {
                Thread.sleep(500);
                System.out.println("In Thread, count is " + count);
                count++;
            }
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread terminating.");
    }
}
