package com.jibarratech.threadsandlocks.diningphilosophers;

/**
 * Created by jid on 25/03/2016.
 */
public class Main {
    private static final int QUANTITY = 5;

    public static void main(String[] args){
        Chopstick[] chopsticks = new Chopstick[QUANTITY];
        Philosopher[] philosophers = new Philosopher[QUANTITY];

        for(int i = 0 ; i < QUANTITY ; i++) {
            chopsticks[i] = new Chopstick();
        }

        for(int i = 0 ; i < QUANTITY ; i++) {
            if(i == QUANTITY - 1) {
                philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[0]);
            } else {
                philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[i+1]);
            }
        }

        for(int i = 0 ; i < QUANTITY ; i++) {
            philosophers[i].start();
//            try {
//                philosophers[i].wait(1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
        }
    }


}
