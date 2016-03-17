package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 21/03/2016.
 */
public class MyObject {

    public synchronized void foo(String name) {
        try {
            System.out.println("Thread " + name + ".foo(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".foo(): ending");
        } catch (InterruptedException exc) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }

    public synchronized void bar(String name) {
        try {
            System.out.println("Thread " + name + ".bar(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".bar(): ending");
        } catch (InterruptedException exc) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }

    public static synchronized void fooStatic(String name) {
        try {
            System.out.println("Thread " + name + ".foo(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".foo(): ending");
        } catch (InterruptedException exc) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }

    public static synchronized void barStatic(String name) {
        try {
            System.out.println("Thread " + name + ".bar(): starting");
            Thread.sleep(3000);
            System.out.println("Thread " + name + ".bar(): ending");
        } catch (InterruptedException exc) {
            System.out.println("Thread " + name + ": interrupted.");
        }
    }

    public void fooSyncCode(String name) {
        synchronized (this) {
            try {
                System.out.println("Thread " + name + ".fooSyncCode(): starting");
                Thread.sleep(3000);
                System.out.println("Thread " + name + ".fooSyncCode(): ending");
            } catch (InterruptedException exc) {
                System.out.println("Thread " + name + ": interrupted.");
            }
        }
    }
}
