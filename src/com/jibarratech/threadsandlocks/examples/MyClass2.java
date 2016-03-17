package com.jibarratech.threadsandlocks.examples;

/**
 * Created by jid on 21/03/2016.
 */
public class MyClass2 extends Thread {
    private String name;
    private MyObject myOjb;

    public MyClass2(MyObject obj, String n) {
        name = n;
        myOjb = obj;
    }

    public void run() {
        if (name.equals("1")) myOjb.foo(name);
        else if (name.equals("2")) myOjb.bar(name);
    }
}