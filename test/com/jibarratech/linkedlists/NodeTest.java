package com.jibarratech.linkedlists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jorge on 2016-02-04.
 */
public class NodeTest {

    Node node;

    @Before
    public void initialize(){
        this.node = new Node(1);
    }

    /**
     * Fills the list with n values from 2 to n
     * @param n
     */
    public void fillList(int n) {

        for (int i = 2; i <= n; i++) {
            node.appendToTail(i);
        }

    }

    @Test
    public void testAppendToTail() throws Exception {
        node.appendToTail(2);
        assertEquals("1->2", node.toString());
    }

    @Test
    public void testDeleteNode() throws Exception {
        fillList(5);
        node.deleteNode(node, 3);
        assertEquals("1->2->4->5", node.toString());
    }

    @Test
    public void testRemoveDuplicates() throws Exception {
        fillList(5);
        node.appendToTail(3);
        node.removeDuplicates(node);
        assertEquals("1->2->3->4->5", node.toString());
    }

    @Test
    public void testRemoveDuplicatesNoBuffer() throws Exception {
        fillList(5);
        node.appendToTail(3);
        node.appendToTail(5);
        node.removeDuplicatesNoBuffer(node);
        assertEquals("1->2->3->4->5", node.toString());
    }

    @Test
    public void testNthToLast() throws Exception {
        fillList(10);
        int n = 5;
        Node nth = node.nthToLastRecursive(node, n);
        assertEquals("6->7->8->9->10", nth.toString());
    }

    @Test
    public void testNthToLastIterative() throws Exception {
        fillList(10);
        int n = 4;
        Node nth = node.nthToLastIterative(node, n);
        assertEquals("7->8->9->10", nth.toString());
    }

    @Test
    public void testDeleteGivenNode(){
        fillList(5);
        Node head = node;
        node = node.getNext();
        node.deleteGivenNode(node);
        assertEquals("1->3->4->5", head.toString());
    }

    @Test
    public void testPartition() {
        node.appendToTail(5);
        node.appendToTail(4);
        node.appendToTail(3);
        node.appendToTail(2);
        Node result = node.partition(node, 3);
        assertEquals("1->2->5->4->3", result.toString());
    }

}