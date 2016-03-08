package com.jibarratech.linkedlists;

/**
 * Created by Jorge on 2016-02-02.
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        Node n = this;

        builder.append(this.data);

        while(n.next != null){
            n = n.next;
            builder.append("->" + n.data);
        }

        return builder.toString();
    }

    Node deleteNode(Node head, int d){
        Node n = head;

        if(n.data == d){
            return head.next; //moved head
        }

        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head; // head didn't change
            }
            n = n.next;
        }
        return head;
    }

    /**
     * Write code to remove duplicates from an unsorted linked list.
     * FOLLOW UP
     * How would you solve this problem if a temporary buffer is not allowed?
     */


    /**
     * Implement an algorithm to find the kth to last element of a singly linked list
     */


    /**
     * Implement an algorithm to delete a node in the middle of a singly linked list,
     * given only access to that node.
     * EXAMPLE
     * Input: the node c from the linked list a->b->c->d->e
     * Result: nothing is returned, but the new linked list looks like a->b->d->e
     */


    /**
     * Write code to partition a linked list around a value x, such that all nodes less than
     * x come before all nodes greater than or equal to x.
     */


    /**
     * You have two numbers represented by a linked list, where each node contains a
     * single digit. The digits are stored in reverse order, such that the 1's digit is at the
     * head of the list. Write a function that adds the two numbers and returns the sum
     * as a linked list.
     * EXAMPLE
     * Input: (7->1->6) + (5->9->2). That is, 617 + 295
     * Output: 2->1->9. That is, 912.
     * FOLLOW UP
     * Suppose the digits are stored in forward order. Repeat the above problem.
     * Input: (6->1->7) + (2->9->5). That is, 617 + 295
     * Output: 9->1->2. That is, 912.
     */


    /**
     * Given a circular linked list, implement an algorithm which returns the node at
     * the beginning of the loop.
     * DEFINITION
     * Circular linked list: A (corrupt) linked list in which a node's next pointer points
     * to an earlier node, so as to make a loop in the linked list.
     * EXAMPLE
     * Input: A -> B -> C -> D -> E -> C [the same C as earlier]
     * Output: C
     */


    /**
     * Implement a function to check if a linked list is a palindrome.
     */
}
