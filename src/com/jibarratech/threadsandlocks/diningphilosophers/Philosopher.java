package com.jibarratech.threadsandlocks.diningphilosophers;

/**
 * Created by jid on 25/03/2016.
 */
public class Philosopher extends Thread {
    private int id;
    private int bites = 1000;
    private Chopstick left;
    private Chopstick right;


    public Philosopher(int id, Chopstick left, Chopstick right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

    public void eat() {
        System.out.println("Philosopher " + id + " : trying to pick up chopsticks");
        if(pickUp()){
            chew();
            System.out.println("Philosopher " + id + " : putting down");
            putDown();
        }
    }

    public boolean pickUp() {
        if(!left.pickUp()){
            return false;
        }
        if(!right.pickUp()){
            left.putDown();
            return false;
        }
        return true;
    }

    public void chew() {
//        try {
//            this.wait(bites);
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
    }

    public void putDown() {
        left.putDown();
        right.putDown();
    }

    public void run() {
        for (int i = 0; i < bites; i++) {
            eat();
        }
    }

}
