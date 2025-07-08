package com.neetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    LinkedListCycle sol = new LinkedListCycle();

    @Test
    void testOne() {
        ListNodeV2 head = new ListNodeV2(3);
        ListNodeV2 node2 = new ListNodeV2(2);
        ListNodeV2 node3 = new ListNodeV2(0);
        ListNodeV2 node4 = new ListNodeV2(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Assertions.assertTrue(sol.hasCycle(head));
    }

    @Test
    void testTwo() {
        ListNodeV2 head = new ListNodeV2(1);
        ListNodeV2 node2 = new ListNodeV2(2);

        head.next = node2;
        node2.next = head;

        Assertions.assertTrue(sol.hasCycle(head));
    }
}
