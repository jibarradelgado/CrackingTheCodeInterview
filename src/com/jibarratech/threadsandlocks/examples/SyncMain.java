package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 21/03/2016.
 */
public class SyncMain {

    public static void main(String[] args){
        /* Difference references - both threads can call MyObject.foo() */
        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyClass2 thread1 = new MyClass2(obj1, "1");
        MyClass2 thread2 = new MyClass2(obj2, "2");

        thread1.start();
        thread2.start();

        /* Same reference to obj. Only one will be allowed to call foo,
         * and the other will be forced to wait */
        MyObject obj = new MyObject();
        MyClass1 thread3 = new MyClass1(obj, "1");
        MyClass1 thread4 = new MyClass1(obj, "2");

        thread3.start();
        thread4.start();
    }
}
