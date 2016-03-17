package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 21/03/2016.
 */
public class MyClass1 extends Thread {
    private String name;
    private MyObject myOjb;

    public MyClass1(MyObject obj, String n) {
        name = n;
        myOjb = obj;
    }

    public void run() {
        if (name.equals("1")) MyObject.fooStatic(name);
        else if (name.equals("2")) MyObject.barStatic(name);
    }
}
