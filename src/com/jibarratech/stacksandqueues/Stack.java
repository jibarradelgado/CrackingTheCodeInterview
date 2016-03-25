package com.jibarratech.stacksandqueues;

/**
 * Created by jid on 10/03/2016.
 */
public class Stack {
    Node top;

    Object pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node(item);
        t.next = top;
        top = t;
    }

    Object peek() {
        return top.data;
    }

    /**
     * Describe how you could use a single array to implement three stacks.
     */

    /**
     * How would you design a stack which, in addition to push and pop, also has a
     * function min which returns the minimum element? Push, pop and min should
     * all operate in O(1) time.
     */

    /**
     * Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
     * Therefore, in real life, we would likely start a new stack when the previous stack
     * exceeds some threshold. Implement a data structure SetOfStacks that mimics
     * this. SetOfStacks should be composed of several stacks and should create a
     * new stack once the previous one exceeds capacity. SetOfStacks.push() and
     * SetOfStacks.pop() should behave identically to a single stack (that is, pop()
     * should return the same values as it would if there were just a single stack).
     * FOLLOW UP
     * Implement a function popAt(int index) which performs a pop operation on
     * a specific sub-stack.
     */

    /**
     * In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of
     * different sizes which can slide onto any tower. The puzzle starts with disks sorted
     * in ascending order of size from top to bottom (i.e., each disk sits on top of an
     * even larger one). You have the following constraints:
     * (1) Only one disk can be moved at a time.
     * (2) A disk is slid off the top of one tower onto the next tower.
     * (3) A disk can only be placed on top of a larger disk.
     * Write a program to move the disks from the first tower to the last using stacks.
     */

    /**
     * Write a program to sort a stack in ascending order (with biggest items on top).
     * You may use at most one additional stack to hold items, but you may not copy
     * the elements into any other data structure (such as an array). The stack supports
     * the following operations: push, pop, peek, and isEmpty.
     */

}
