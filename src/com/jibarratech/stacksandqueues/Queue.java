package com.jibarratech.stacksandqueues;

/**
 * Created by jid on 10/03/2016.
 */
public class Queue {

    Node first, last;

    void enqueue(Object item) {
        if(first == null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }

    Object dequeue() {
        if (first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }

    /**
     * Implement a MyQueue class which implements a queue using two stacks.
     */

    /**
     * An animal shelter holds only dogs and cats, and operates ona strictly "first in,
     * first out" basis. People must adopt either the "oldest" (based on arrival time) of
     * all animals at the shelter, or they can select whether they would prefer a dog or
     * a cat (and will receive the oldest animal of that type). They cannot select which
     * specific animal they would like. Create the data structures to maintain this system
     * and implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat.
     * You may use the built-in LinkedList data structure.
     */

}
