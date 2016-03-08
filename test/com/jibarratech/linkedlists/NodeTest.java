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

    @Test
    public void testAppendToTail() throws Exception {
        node.appendToTail(2);
        assertEquals("1->2", node.toString());
    }

    @Test
    public void testDeleteNode() throws Exception {

    }
}